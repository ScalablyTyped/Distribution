package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HYBRID extends StObject {
  
  var HYBRID: String
  
  var ROADMAP: String
  
  var SATELLITE: String
  
  var TERRAIN: String
}
object HYBRID {
  
  inline def apply(HYBRID: String, ROADMAP: String, SATELLITE: String, TERRAIN: String): HYBRID = {
    val __obj = js.Dynamic.literal(HYBRID = HYBRID.asInstanceOf[js.Any], ROADMAP = ROADMAP.asInstanceOf[js.Any], SATELLITE = SATELLITE.asInstanceOf[js.Any], TERRAIN = TERRAIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[HYBRID]
  }
  
  extension [Self <: HYBRID](x: Self) {
    
    inline def setHYBRID(value: String): Self = StObject.set(x, "HYBRID", value.asInstanceOf[js.Any])
    
    inline def setROADMAP(value: String): Self = StObject.set(x, "ROADMAP", value.asInstanceOf[js.Any])
    
    inline def setSATELLITE(value: String): Self = StObject.set(x, "SATELLITE", value.asInstanceOf[js.Any])
    
    inline def setTERRAIN(value: String): Self = StObject.set(x, "TERRAIN", value.asInstanceOf[js.Any])
  }
}
