package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Family extends js.Object {
  
  var family: js.UndefOr[String] = js.native
  
  var firmwareVersion: js.UndefOr[String] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  var specLevel: js.UndefOr[String] = js.native
  
  var tpmModel: js.UndefOr[String] = js.native
  
  var vendorSpecific: js.UndefOr[String] = js.native
}
object Family {
  
  @scala.inline
  def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit class FamilyOps[Self <: Family] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setFirmwareVersion(value: String): Self = this.set("firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirmwareVersion: Self = this.set("firmwareVersion", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setSpecLevel(value: String): Self = this.set("specLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecLevel: Self = this.set("specLevel", js.undefined)
    
    @scala.inline
    def setTpmModel(value: String): Self = this.set("tpmModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpmModel: Self = this.set("tpmModel", js.undefined)
    
    @scala.inline
    def setVendorSpecific(value: String): Self = this.set("vendorSpecific", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorSpecific: Self = this.set("vendorSpecific", js.undefined)
  }
}
