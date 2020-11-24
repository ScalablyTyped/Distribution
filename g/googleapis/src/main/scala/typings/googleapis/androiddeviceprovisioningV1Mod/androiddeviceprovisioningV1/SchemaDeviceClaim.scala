package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A record of a device claimed by a reseller for a customer. Devices claimed
  * for zero-touch enrollment have a claim with the type
  * `SECTION_TYPE_ZERO_TOUCH`. To learn more, read [Claim devices for
  * customers](/zero-touch/guides/how-it-works#claim).
  */
@js.native
trait SchemaDeviceClaim extends js.Object {
  
  /**
    * The ID of the Customer that purchased the device.
    */
  var ownerCompanyId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the reseller that claimed the device.
    */
  var resellerId: js.UndefOr[String] = js.native
  
  /**
    * Output only. The type of claim made on the device.
    */
  var sectionType: js.UndefOr[String] = js.native
}
object SchemaDeviceClaim {
  
  @scala.inline
  def apply(): SchemaDeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceClaim]
  }
  
  @scala.inline
  implicit class SchemaDeviceClaimOps[Self <: SchemaDeviceClaim] (val x: Self) extends AnyVal {
    
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
    def setOwnerCompanyId(value: String): Self = this.set("ownerCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerCompanyId: Self = this.set("ownerCompanyId", js.undefined)
    
    @scala.inline
    def setResellerId(value: String): Self = this.set("resellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResellerId: Self = this.set("resellerId", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
  }
}
