package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountId extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** View (Profile) ID. */
  var profileId: js.UndefOr[String] = js.native
  /** View (Profile) name. */
  var profileName: js.UndefOr[String] = js.native
  /** Table ID for view (profile). */
  var tableId: js.UndefOr[String] = js.native
  /** Web Property ID to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object AccountId {
  @scala.inline
  def apply(): AccountId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountId]
  }
  @scala.inline
  implicit class AccountIdOps[Self <: AccountId] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setProfileName(value: String): Self = this.set("profileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

