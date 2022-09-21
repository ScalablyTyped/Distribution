package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RASTER extends StObject {
  
  var RASTER: String
  
  var UNINITIALIZED: String
  
  var VECTOR: String
}
object RASTER {
  
  inline def apply(RASTER: String, UNINITIALIZED: String, VECTOR: String): RASTER = {
    val __obj = js.Dynamic.literal(RASTER = RASTER.asInstanceOf[js.Any], UNINITIALIZED = UNINITIALIZED.asInstanceOf[js.Any], VECTOR = VECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[RASTER]
  }
  
  extension [Self <: RASTER](x: Self) {
    
    inline def setRASTER(value: String): Self = StObject.set(x, "RASTER", value.asInstanceOf[js.Any])
    
    inline def setUNINITIALIZED(value: String): Self = StObject.set(x, "UNINITIALIZED", value.asInstanceOf[js.Any])
    
    inline def setVECTOR(value: String): Self = StObject.set(x, "VECTOR", value.asInstanceOf[js.Any])
  }
}
