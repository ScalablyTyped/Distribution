package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTreeRequest extends js.Object {
  var accountName: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var profileName: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var webpropertyName: js.UndefOr[String] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
}

object AccountTreeRequest {
  @scala.inline
  def apply(): AccountTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTreeRequest]
  }
  @scala.inline
  implicit class AccountTreeRequestOps[Self <: AccountTreeRequest] (val x: Self) extends AnyVal {
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProfileName(value: String): Self = this.set("profileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setWebpropertyName(value: String): Self = this.set("webpropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpropertyName: Self = this.set("webpropertyName", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

