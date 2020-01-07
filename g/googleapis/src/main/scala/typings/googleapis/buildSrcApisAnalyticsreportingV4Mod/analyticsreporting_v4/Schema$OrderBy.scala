package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the sorting options.
  */
@js.native
trait Schema$OrderBy extends js.Object {
  /**
    * The field which to sort by. The default sort order is ascending. Example:
    * `ga:browser`. Note, that you can only specify one field for sort here.
    * For example, `ga:browser, ga:city` is not valid.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * The order type. The default orderType is `VALUE`.
    */
  var orderType: js.UndefOr[String] = js.native
  /**
    * The sorting order for the field.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object Schema$OrderBy {
  @scala.inline
  def apply(fieldName: String = null, orderType: String = null, sortOrder: String = null): Schema$OrderBy = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (orderType != null) __obj.updateDynamic("orderType")(orderType.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderBy]
  }
}

