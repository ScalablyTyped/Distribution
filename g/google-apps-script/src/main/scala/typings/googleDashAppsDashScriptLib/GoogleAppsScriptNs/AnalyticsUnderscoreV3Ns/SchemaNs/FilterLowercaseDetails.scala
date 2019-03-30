package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterLowercaseDetails extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var fieldIndex: js.UndefOr[scala.Double] = js.undefined
}

object FilterLowercaseDetails {
  @scala.inline
  def apply(field: java.lang.String = null, fieldIndex: scala.Int | scala.Double = null): FilterLowercaseDetails = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLowercaseDetails]
  }
}

