package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceProperties extends js.Object {
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ConferenceProperties {
  @scala.inline
  def apply(allowedConferenceSolutionTypes: js.Array[String] = null): ConferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (allowedConferenceSolutionTypes != null) __obj.updateDynamic("allowedConferenceSolutionTypes")(allowedConferenceSolutionTypes)
    __obj.asInstanceOf[ConferenceProperties]
  }
}

