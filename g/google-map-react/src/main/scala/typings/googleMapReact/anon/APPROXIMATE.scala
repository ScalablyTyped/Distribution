package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APPROXIMATE extends StObject {
  
  var APPROXIMATE: String
  
  var GEOMETRIC_CENTER: String
  
  var RANGE_INTERPOLATED: String
  
  var ROOFTOP: String
}
object APPROXIMATE {
  
  inline def apply(APPROXIMATE: String, GEOMETRIC_CENTER: String, RANGE_INTERPOLATED: String, ROOFTOP: String): APPROXIMATE = {
    val __obj = js.Dynamic.literal(APPROXIMATE = APPROXIMATE.asInstanceOf[js.Any], GEOMETRIC_CENTER = GEOMETRIC_CENTER.asInstanceOf[js.Any], RANGE_INTERPOLATED = RANGE_INTERPOLATED.asInstanceOf[js.Any], ROOFTOP = ROOFTOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[APPROXIMATE]
  }
  
  extension [Self <: APPROXIMATE](x: Self) {
    
    inline def setAPPROXIMATE(value: String): Self = StObject.set(x, "APPROXIMATE", value.asInstanceOf[js.Any])
    
    inline def setGEOMETRIC_CENTER(value: String): Self = StObject.set(x, "GEOMETRIC_CENTER", value.asInstanceOf[js.Any])
    
    inline def setRANGE_INTERPOLATED(value: String): Self = StObject.set(x, "RANGE_INTERPOLATED", value.asInstanceOf[js.Any])
    
    inline def setROOFTOP(value: String): Self = StObject.set(x, "ROOFTOP", value.asInstanceOf[js.Any])
  }
}
