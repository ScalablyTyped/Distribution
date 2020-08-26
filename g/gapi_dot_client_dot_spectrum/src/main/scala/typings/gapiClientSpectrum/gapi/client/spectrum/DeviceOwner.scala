package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOwner extends js.Object {
  /** The vCard contact information for the device operator is optional, but may be required by specific regulatory domains. */
  var operator: js.UndefOr[Vcard] = js.native
  /** The vCard contact information for the individual or business that owns the device is required. */
  var owner: js.UndefOr[Vcard] = js.native
}

object DeviceOwner {
  @scala.inline
  def apply(): DeviceOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOwner]
  }
  @scala.inline
  implicit class DeviceOwnerOps[Self <: DeviceOwner] (val x: Self) extends AnyVal {
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
    def setOperator(value: Vcard): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setOwner(value: Vcard): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

