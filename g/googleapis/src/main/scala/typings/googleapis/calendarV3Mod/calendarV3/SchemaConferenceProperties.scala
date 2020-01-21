package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceProperties extends js.Object {
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:   - &quot;eventHangout&quot;  -
    * &quot;eventNamedHangout&quot;  - &quot;hangoutsMeet&quot;  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaConferenceProperties {
  @scala.inline
  def apply(allowedConferenceSolutionTypes: js.Array[String] = null): SchemaConferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (allowedConferenceSolutionTypes != null) __obj.updateDynamic("allowedConferenceSolutionTypes")(allowedConferenceSolutionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConferenceProperties]
  }
}

