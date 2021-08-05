package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FWVersion extends StObject {
  
  var FWVersion: String
  
  var HWVersion: String
  
  var isLoggedIn: String
  
  var manufacturer: String
  
  var name: String
  
  var serial: String
}
object FWVersion {
  
  inline def apply(
    FWVersion: String,
    HWVersion: String,
    isLoggedIn: String,
    manufacturer: String,
    name: String,
    serial: String
  ): FWVersion = {
    val __obj = js.Dynamic.literal(FWVersion = FWVersion.asInstanceOf[js.Any], HWVersion = HWVersion.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[FWVersion]
  }
  
  extension [Self <: FWVersion](x: Self) {
    
    inline def setFWVersion(value: String): Self = StObject.set(x, "FWVersion", value.asInstanceOf[js.Any])
    
    inline def setHWVersion(value: String): Self = StObject.set(x, "HWVersion", value.asInstanceOf[js.Any])
    
    inline def setIsLoggedIn(value: String): Self = StObject.set(x, "isLoggedIn", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
