package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMPERIAL extends StObject {
  
  var IMPERIAL: Double
  
  var METRIC: Double
}
object IMPERIAL {
  
  inline def apply(IMPERIAL: Double, METRIC: Double): IMPERIAL = {
    val __obj = js.Dynamic.literal(IMPERIAL = IMPERIAL.asInstanceOf[js.Any], METRIC = METRIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMPERIAL]
  }
  
  extension [Self <: IMPERIAL](x: Self) {
    
    inline def setIMPERIAL(value: Double): Self = StObject.set(x, "IMPERIAL", value.asInstanceOf[js.Any])
    
    inline def setMETRIC(value: Double): Self = StObject.set(x, "METRIC", value.asInstanceOf[js.Any])
  }
}
