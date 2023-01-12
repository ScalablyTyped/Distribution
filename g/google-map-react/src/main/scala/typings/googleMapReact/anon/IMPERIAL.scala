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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMPERIAL] (val x: Self) extends AnyVal {
    
    inline def setIMPERIAL(value: Double): Self = StObject.set(x, "IMPERIAL", value.asInstanceOf[js.Any])
    
    inline def setMETRIC(value: Double): Self = StObject.set(x, "METRIC", value.asInstanceOf[js.Any])
  }
}
