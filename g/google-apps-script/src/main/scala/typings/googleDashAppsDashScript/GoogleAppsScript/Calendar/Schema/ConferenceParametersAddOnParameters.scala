package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[js.Object] = js.undefined
}

object ConferenceParametersAddOnParameters {
  @scala.inline
  def apply(parameters: js.Object = null): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
}

