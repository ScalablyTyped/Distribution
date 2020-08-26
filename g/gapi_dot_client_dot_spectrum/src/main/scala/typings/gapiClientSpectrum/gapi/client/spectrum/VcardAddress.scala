package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VcardAddress extends js.Object {
  /** The postal code associated with the address. For example: 94423. */
  var code: js.UndefOr[String] = js.native
  /** The country name. For example: US. */
  var country: js.UndefOr[String] = js.native
  /** The city or local equivalent portion of the address. For example: San Jose. */
  var locality: js.UndefOr[String] = js.native
  /** An optional post office box number. */
  var pobox: js.UndefOr[String] = js.native
  /** The state or local equivalent portion of the address. For example: CA. */
  var region: js.UndefOr[String] = js.native
  /** The street number and name. For example: 123 Any St. */
  var street: js.UndefOr[String] = js.native
}

object VcardAddress {
  @scala.inline
  def apply(): VcardAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcardAddress]
  }
  @scala.inline
  implicit class VcardAddressOps[Self <: VcardAddress] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setPobox(value: String): Self = this.set("pobox", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePobox: Self = this.set("pobox", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreet: Self = this.set("street", js.undefined)
  }
  
}

