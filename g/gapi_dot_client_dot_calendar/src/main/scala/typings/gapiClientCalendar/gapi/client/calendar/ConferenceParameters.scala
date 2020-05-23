package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceParameters extends js.Object {
  /** Additional add-on specific data. */
  var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.undefined
}

object ConferenceParameters {
  @scala.inline
  def apply(addOnParameters: ConferenceParametersAddOnParameters = null): ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    if (addOnParameters != null) __obj.updateDynamic("addOnParameters")(addOnParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceParameters]
  }
}

