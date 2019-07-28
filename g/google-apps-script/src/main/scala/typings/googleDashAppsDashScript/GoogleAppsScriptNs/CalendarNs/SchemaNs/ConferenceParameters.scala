package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceParameters extends js.Object {
  var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.undefined
}

object ConferenceParameters {
  @scala.inline
  def apply(addOnParameters: ConferenceParametersAddOnParameters = null): ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    if (addOnParameters != null) __obj.updateDynamic("addOnParameters")(addOnParameters)
    __obj.asInstanceOf[ConferenceParameters]
  }
}

