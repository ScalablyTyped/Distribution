package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal interfaces
trait AppsScriptEvent extends js.Object {
  var authMode: AuthMode
  var triggerUid: String
  var user: User
}

object AppsScriptEvent {
  @scala.inline
  def apply(authMode: AuthMode, triggerUid: String, user: User): AppsScriptEvent = {
    val __obj = js.Dynamic.literal(authMode = authMode, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[AppsScriptEvent]
  }
}

