package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal interfaces
trait AppsScriptEvent extends js.Object {
  var authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode
  var triggerUid: java.lang.String
  var user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
}

object AppsScriptEvent {
  @scala.inline
  def apply(
    authMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode,
    triggerUid: java.lang.String,
    user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User
  ): AppsScriptEvent = {
    val __obj = js.Dynamic.literal(authMode = authMode, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[AppsScriptEvent]
  }
}

