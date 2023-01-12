package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOUNCE extends StObject {
  
  var BOUNCE: Double
  
  var DROP: Double
  
  var Qz: Double
  
  var Uz: Double
}
object BOUNCE {
  
  inline def apply(BOUNCE: Double, DROP: Double, Qz: Double, Uz: Double): BOUNCE = {
    val __obj = js.Dynamic.literal(BOUNCE = BOUNCE.asInstanceOf[js.Any], DROP = DROP.asInstanceOf[js.Any], Qz = Qz.asInstanceOf[js.Any], Uz = Uz.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOUNCE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BOUNCE] (val x: Self) extends AnyVal {
    
    inline def setBOUNCE(value: Double): Self = StObject.set(x, "BOUNCE", value.asInstanceOf[js.Any])
    
    inline def setDROP(value: Double): Self = StObject.set(x, "DROP", value.asInstanceOf[js.Any])
    
    inline def setQz(value: Double): Self = StObject.set(x, "Qz", value.asInstanceOf[js.Any])
    
    inline def setUz(value: Double): Self = StObject.set(x, "Uz", value.asInstanceOf[js.Any])
  }
}
