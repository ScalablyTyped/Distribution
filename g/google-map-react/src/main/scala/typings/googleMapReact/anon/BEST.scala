package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BEST extends StObject {
  
  var BEST: String
  
  var NEAREST: String
}
object BEST {
  
  inline def apply(BEST: String, NEAREST: String): BEST = {
    val __obj = js.Dynamic.literal(BEST = BEST.asInstanceOf[js.Any], NEAREST = NEAREST.asInstanceOf[js.Any])
    __obj.asInstanceOf[BEST]
  }
  
  extension [Self <: BEST](x: Self) {
    
    inline def setBEST(value: String): Self = StObject.set(x, "BEST", value.asInstanceOf[js.Any])
    
    inline def setNEAREST(value: String): Self = StObject.set(x, "NEAREST", value.asInstanceOf[js.Any])
  }
}
