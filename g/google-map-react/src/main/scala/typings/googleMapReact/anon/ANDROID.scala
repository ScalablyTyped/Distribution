package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ANDROID extends StObject {
  
  var ANDROID: Double
  
  var DEFAULT: Double
  
  var Ot: Double
  
  var SMALL: Double
  
  var Vz: Double
  
  var ZOOM_PAN: Double
}
object ANDROID {
  
  inline def apply(ANDROID: Double, DEFAULT: Double, Ot: Double, SMALL: Double, Vz: Double, ZOOM_PAN: Double): ANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], Ot = Ot.asInstanceOf[js.Any], SMALL = SMALL.asInstanceOf[js.Any], Vz = Vz.asInstanceOf[js.Any], ZOOM_PAN = ZOOM_PAN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANDROID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ANDROID] (val x: Self) extends AnyVal {
    
    inline def setANDROID(value: Double): Self = StObject.set(x, "ANDROID", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: Double): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setOt(value: Double): Self = StObject.set(x, "Ot", value.asInstanceOf[js.Any])
    
    inline def setSMALL(value: Double): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
    
    inline def setVz(value: Double): Self = StObject.set(x, "Vz", value.asInstanceOf[js.Any])
    
    inline def setZOOM_PAN(value: Double): Self = StObject.set(x, "ZOOM_PAN", value.asInstanceOf[js.Any])
  }
}
