package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var combinedEvent: js.UndefOr[Event] = js.undefined
  var singleEvents: js.UndefOr[js.Array[Event]] = js.undefined
}

object Activity {
  @scala.inline
  def apply(combinedEvent: Event = null, singleEvents: js.Array[Event] = null): Activity = {
    val __obj = js.Dynamic.literal()
    if (combinedEvent != null) __obj.updateDynamic("combinedEvent")(combinedEvent)
    if (singleEvents != null) __obj.updateDynamic("singleEvents")(singleEvents)
    __obj.asInstanceOf[Activity]
  }
}

