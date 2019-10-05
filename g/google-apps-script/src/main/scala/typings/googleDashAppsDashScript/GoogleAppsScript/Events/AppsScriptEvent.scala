package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
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

