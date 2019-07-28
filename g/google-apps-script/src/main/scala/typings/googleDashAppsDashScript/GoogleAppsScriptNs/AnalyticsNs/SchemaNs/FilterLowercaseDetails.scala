package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterLowercaseDetails extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var fieldIndex: js.UndefOr[Double] = js.undefined
}

object FilterLowercaseDetails {
  @scala.inline
  def apply(field: String = null, fieldIndex: Int | Double = null): FilterLowercaseDetails = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLowercaseDetails]
  }
}

