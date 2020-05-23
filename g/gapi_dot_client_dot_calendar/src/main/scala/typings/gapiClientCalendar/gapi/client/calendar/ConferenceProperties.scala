package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceProperties extends js.Object {
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:
    * - "eventHangout"
    * - "eventNamedHangout"
    * - "hangoutsMeet"  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ConferenceProperties {
  @scala.inline
  def apply(allowedConferenceSolutionTypes: js.Array[String] = null): ConferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (allowedConferenceSolutionTypes != null) __obj.updateDynamic("allowedConferenceSolutionTypes")(allowedConferenceSolutionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceProperties]
  }
}

