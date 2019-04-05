package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterUppercaseDetails extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var fieldIndex: js.UndefOr[scala.Double] = js.undefined
}

object FilterUppercaseDetails {
  @scala.inline
  def apply(field: java.lang.String = null, fieldIndex: scala.Int | scala.Double = null): FilterUppercaseDetails = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterUppercaseDetails]
  }
}

