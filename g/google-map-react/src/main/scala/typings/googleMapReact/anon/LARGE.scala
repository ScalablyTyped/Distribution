package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LARGE extends StObject {
  
  var DEFAULT: Double
  
  var LARGE: Double
  
  var Ot: Double
  
  var SMALL: Double
}
object LARGE {
  
  inline def apply(DEFAULT: Double, LARGE: Double, Ot: Double, SMALL: Double): LARGE = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], LARGE = LARGE.asInstanceOf[js.Any], Ot = Ot.asInstanceOf[js.Any], SMALL = SMALL.asInstanceOf[js.Any])
    __obj.asInstanceOf[LARGE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LARGE] (val x: Self) extends AnyVal {
    
    inline def setDEFAULT(value: Double): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setLARGE(value: Double): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
    
    inline def setOt(value: Double): Self = StObject.set(x, "Ot", value.asInstanceOf[js.Any])
    
    inline def setSMALL(value: Double): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
  }
}
