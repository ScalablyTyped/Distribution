package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBy extends js.Object {
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  var orderType: js.UndefOr[java.lang.String] = js.undefined
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

object OrderBy {
  @scala.inline
  def apply(
    fieldName: java.lang.String = null,
    orderType: java.lang.String = null,
    sortOrder: java.lang.String = null
  ): OrderBy = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (orderType != null) __obj.updateDynamic("orderType")(orderType)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[OrderBy]
  }
}

