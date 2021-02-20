package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Family extends StObject {
  
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
  implicit class FamilyMutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareVersionUndefined: Self = StObject.set(x, "firmwareVersion", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setSpecLevel(value: String): Self = StObject.set(x, "specLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecLevelUndefined: Self = StObject.set(x, "specLevel", js.undefined)
    
    @scala.inline
    def setTpmModel(value: String): Self = StObject.set(x, "tpmModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpmModelUndefined: Self = StObject.set(x, "tpmModel", js.undefined)
    
    @scala.inline
    def setVendorSpecific(value: String): Self = StObject.set(x, "vendorSpecific", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorSpecificUndefined: Self = StObject.set(x, "vendorSpecific", js.undefined)
  }
}
