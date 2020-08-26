package typings.gapiClientAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var creation_time: js.UndefOr[String] = js.native
  /** Unique identifier of this account. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adsense#account. */
  var kind: js.UndefOr[String] = js.native
  /** Name of this account. */
  var name: js.UndefOr[String] = js.native
  /** Whether this account is premium. */
  var premium: js.UndefOr[Boolean] = js.native
  /** Sub accounts of the this account. */
  var subAccounts: js.UndefOr[js.Array[Account]] = js.native
  /** AdSense timezone of this account. */
  var timezone: js.UndefOr[String] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setCreation_time(value: String): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreation_time: Self = this.set("creation_time", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPremium(value: Boolean): Self = this.set("premium", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremium: Self = this.set("premium", js.undefined)
    @scala.inline
    def setSubAccountsVarargs(value: Account*): Self = this.set("subAccounts", js.Array(value :_*))
    @scala.inline
    def setSubAccounts(value: js.Array[Account]): Self = this.set("subAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAccounts: Self = this.set("subAccounts", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
  
}

