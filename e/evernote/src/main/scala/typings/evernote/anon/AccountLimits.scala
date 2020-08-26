package typings.evernote.anon

import typings.evernote.mod.Types.Accounting
import typings.evernote.mod.Types.BusinessUserInfo
import typings.evernote.mod.Types.PrivilegeLevel
import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserAttributes
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimits extends js.Object {
  var accountLimits: js.UndefOr[typings.evernote.mod.Types.AccountLimits] = js.native
  var accounting: js.UndefOr[Accounting] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var attributes: js.UndefOr[UserAttributes] = js.native
  var businessUserInfo: js.UndefOr[BusinessUserInfo] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var deleted: js.UndefOr[Timestamp] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[UserID] = js.native
  var name: js.UndefOr[String] = js.native
  var photoLastUpdated: js.UndefOr[Timestamp] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[PrivilegeLevel] = js.native
  var serviceLevel: js.UndefOr[ServiceLevel] = js.native
  var shardId: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
  var username: js.UndefOr[String] = js.native
}

object AccountLimits {
  @scala.inline
  def apply(): AccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimits]
  }
  @scala.inline
  implicit class AccountLimitsOps[Self <: AccountLimits] (val x: Self) extends AnyVal {
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
    def setAccountLimits(value: typings.evernote.mod.Types.AccountLimits): Self = this.set("accountLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountLimits: Self = this.set("accountLimits", js.undefined)
    @scala.inline
    def setAccounting(value: Accounting): Self = this.set("accounting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounting: Self = this.set("accounting", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAttributes(value: UserAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setBusinessUserInfo(value: BusinessUserInfo): Self = this.set("businessUserInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessUserInfo: Self = this.set("businessUserInfo", js.undefined)
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDeleted(value: Timestamp): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setId(value: UserID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhotoLastUpdated(value: Timestamp): Self = this.set("photoLastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoLastUpdated: Self = this.set("photoLastUpdated", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    @scala.inline
    def setPrivilege(value: PrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    @scala.inline
    def setServiceLevel(value: ServiceLevel): Self = this.set("serviceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceLevel: Self = this.set("serviceLevel", js.undefined)
    @scala.inline
    def setShardId(value: String): Self = this.set("shardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardId: Self = this.set("shardId", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

