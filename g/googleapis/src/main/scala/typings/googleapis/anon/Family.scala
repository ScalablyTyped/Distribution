package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Family extends StObject {
  
  var family: js.UndefOr[String] = js.undefined
  
  var firmwareVersion: js.UndefOr[String] = js.undefined
  
  var manufacturer: js.UndefOr[String] = js.undefined
  
  var specLevel: js.UndefOr[String] = js.undefined
  
  var tpmModel: js.UndefOr[String] = js.undefined
  
  var vendorSpecific: js.UndefOr[String] = js.undefined
}
object Family {
  
  inline def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  
  extension [Self <: Family](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    inline def setFirmwareVersionUndefined: Self = StObject.set(x, "firmwareVersion", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setSpecLevel(value: String): Self = StObject.set(x, "specLevel", value.asInstanceOf[js.Any])
    
    inline def setSpecLevelUndefined: Self = StObject.set(x, "specLevel", js.undefined)
    
    inline def setTpmModel(value: String): Self = StObject.set(x, "tpmModel", value.asInstanceOf[js.Any])
    
    inline def setTpmModelUndefined: Self = StObject.set(x, "tpmModel", js.undefined)
    
    inline def setVendorSpecific(value: String): Self = StObject.set(x, "vendorSpecific", value.asInstanceOf[js.Any])
    
    inline def setVendorSpecificUndefined: Self = StObject.set(x, "vendorSpecific", js.undefined)
  }
}
