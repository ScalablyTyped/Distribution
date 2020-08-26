package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal interfaces
@js.native
trait AppsScriptEvent extends js.Object {
  var authMode: AuthMode = js.native
  var triggerUid: String = js.native
  var user: User = js.native
}

object AppsScriptEvent {
  @scala.inline
  def apply(authMode: AuthMode, triggerUid: String, user: User): AppsScriptEvent = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptEvent]
  }
  @scala.inline
  implicit class AppsScriptEventOps[Self <: AppsScriptEvent] (val x: Self) extends AnyVal {
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
    def setAuthMode(value: AuthMode): Self = this.set("authMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerUid(value: String): Self = this.set("triggerUid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

