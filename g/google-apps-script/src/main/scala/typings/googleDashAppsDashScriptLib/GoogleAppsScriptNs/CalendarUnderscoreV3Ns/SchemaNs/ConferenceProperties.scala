package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceProperties extends js.Object {
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ConferenceProperties {
  @scala.inline
  def apply(allowedConferenceSolutionTypes: js.Array[java.lang.String] = null): ConferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (allowedConferenceSolutionTypes != null) __obj.updateDynamic("allowedConferenceSolutionTypes")(allowedConferenceSolutionTypes)
    __obj.asInstanceOf[ConferenceProperties]
  }
}

