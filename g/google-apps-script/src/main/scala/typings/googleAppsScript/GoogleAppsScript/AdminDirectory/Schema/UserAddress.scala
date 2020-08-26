package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAddress extends js.Object {
  var country: js.UndefOr[String] = js.native
  var countryCode: js.UndefOr[String] = js.native
  var customType: js.UndefOr[String] = js.native
  var extendedAddress: js.UndefOr[String] = js.native
  var formatted: js.UndefOr[String] = js.native
  var locality: js.UndefOr[String] = js.native
  var poBox: js.UndefOr[String] = js.native
  var postalCode: js.UndefOr[String] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var region: js.UndefOr[String] = js.native
  var sourceIsStructured: js.UndefOr[Boolean] = js.native
  var streetAddress: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object UserAddress {
  @scala.inline
  def apply(): UserAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAddress]
  }
  @scala.inline
  implicit class UserAddressOps[Self <: UserAddress] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    @scala.inline
    def setExtendedAddress(value: String): Self = this.set("extendedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedAddress: Self = this.set("extendedAddress", js.undefined)
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setPoBox(value: String): Self = this.set("poBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoBox: Self = this.set("poBox", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSourceIsStructured(value: Boolean): Self = this.set("sourceIsStructured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIsStructured: Self = this.set("sourceIsStructured", js.undefined)
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

