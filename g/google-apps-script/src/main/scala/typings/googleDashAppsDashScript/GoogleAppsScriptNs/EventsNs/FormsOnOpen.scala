package typings.googleDashAppsDashScript.GoogleAppsScriptNs.EventsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.Form
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOnOpen extends AppsScriptEvent {
  var source: Form
}

object FormsOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Form, triggerUid: String, user: User): FormsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[FormsOnOpen]
  }
}

