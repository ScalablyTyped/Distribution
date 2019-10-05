package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Form
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
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

