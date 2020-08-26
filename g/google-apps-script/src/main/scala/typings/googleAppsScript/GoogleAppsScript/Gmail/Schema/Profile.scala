package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  var emailAddress: js.UndefOr[String] = js.native
  var historyId: js.UndefOr[String] = js.native
  var messagesTotal: js.UndefOr[Double] = js.native
  var threadsTotal: js.UndefOr[Double] = js.native
}

object Profile {
  @scala.inline
  def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setMessagesTotal(value: Double): Self = this.set("messagesTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesTotal: Self = this.set("messagesTotal", js.undefined)
    @scala.inline
    def setThreadsTotal(value: Double): Self = this.set("threadsTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadsTotal: Self = this.set("threadsTotal", js.undefined)
  }
  
}

