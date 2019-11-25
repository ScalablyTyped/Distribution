package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBy extends js.Object {
  var fieldName: js.UndefOr[String] = js.undefined
  var orderType: js.UndefOr[String] = js.undefined
  var sortOrder: js.UndefOr[String] = js.undefined
}

object OrderBy {
  @scala.inline
  def apply(fieldName: String = null, orderType: String = null, sortOrder: String = null): OrderBy = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (orderType != null) __obj.updateDynamic("orderType")(orderType.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy]
  }
}

