package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Forms.Form
import typings.googleAppsScript.GoogleAppsScript.Forms.FormResponse
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormsOnFormSubmit extends AppsScriptEvent {
  var response: FormResponse = js.native
  var source: Form = js.native
}

object FormsOnFormSubmit {
  @scala.inline
  def apply(authMode: AuthMode, response: FormResponse, source: Form, triggerUid: String, user: User): FormsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOnFormSubmit]
  }
  @scala.inline
  implicit class FormsOnFormSubmitOps[Self <: FormsOnFormSubmit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponse(value: FormResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Form): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

