package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Form
import typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FormResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOnFormSubmit extends AppsScriptEvent {
  var response: FormResponse
  var source: Form
}

object FormsOnFormSubmit {
  @scala.inline
  def apply(authMode: AuthMode, response: FormResponse, source: Form, triggerUid: String, user: User): FormsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode, response = response, source = source, triggerUid = triggerUid, user = user)
  
    __obj.asInstanceOf[FormsOnFormSubmit]
  }
}

