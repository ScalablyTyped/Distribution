package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Forms.Form
import typings.googleAppsScript.GoogleAppsScript.Forms.FormResponse
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
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
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOnFormSubmit]
  }
}

