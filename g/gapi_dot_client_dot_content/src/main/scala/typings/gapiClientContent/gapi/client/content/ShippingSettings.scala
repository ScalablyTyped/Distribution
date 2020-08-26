package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingSettings extends js.Object {
  /** The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[String] = js.native
  /** A list of postal code groups that can be referred to in services. Optional. */
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.native
  /** The target account's list of services. Optional. */
  var services: js.UndefOr[js.Array[Service]] = js.native
}

object ShippingSettings {
  @scala.inline
  def apply(): ShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingSettings]
  }
  @scala.inline
  implicit class ShippingSettingsOps[Self <: ShippingSettings] (val x: Self) extends AnyVal {
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
    def setPostalCodeGroupsVarargs(value: PostalCodeGroup*): Self = this.set("postalCodeGroups", js.Array(value :_*))
    @scala.inline
    def setPostalCodeGroups(value: js.Array[PostalCodeGroup]): Self = this.set("postalCodeGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodeGroups: Self = this.set("postalCodeGroups", js.undefined)
    @scala.inline
    def setServicesVarargs(value: Service*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[Service]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

