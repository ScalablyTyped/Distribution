package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalIpAddress extends js.Object {
  /**
    * IP CIDR address or range.
    */
  var cidr: js.UndefOr[String] = js.native
  /**
    * The owner of the internal IP address.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * The purpose of the internal IP address if applicable.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * The region of the internal IP address if applicable.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The type of the internal IP address.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInternalIpAddress {
  @scala.inline
  def apply(): SchemaInternalIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalIpAddress]
  }
  @scala.inline
  implicit class SchemaInternalIpAddressOps[Self <: SchemaInternalIpAddress] (val x: Self) extends AnyVal {
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
    def setCidr(value: String): Self = this.set("cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPurpose(value: String): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

