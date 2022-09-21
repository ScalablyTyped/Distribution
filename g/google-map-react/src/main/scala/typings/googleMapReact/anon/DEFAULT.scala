package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEFAULT extends StObject {
  
  var DEFAULT: Double
  
  var DROPDOWN_MENU: Double
  
  var HORIZONTAL_BAR: Double
  
  var INSET: Double
  
  var INSET_LARGE: Double
}
object DEFAULT {
  
  inline def apply(DEFAULT: Double, DROPDOWN_MENU: Double, HORIZONTAL_BAR: Double, INSET: Double, INSET_LARGE: Double): DEFAULT = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], DROPDOWN_MENU = DROPDOWN_MENU.asInstanceOf[js.Any], HORIZONTAL_BAR = HORIZONTAL_BAR.asInstanceOf[js.Any], INSET = INSET.asInstanceOf[js.Any], INSET_LARGE = INSET_LARGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  extension [Self <: DEFAULT](x: Self) {
    
    inline def setDEFAULT(value: Double): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setDROPDOWN_MENU(value: Double): Self = StObject.set(x, "DROPDOWN_MENU", value.asInstanceOf[js.Any])
    
    inline def setHORIZONTAL_BAR(value: Double): Self = StObject.set(x, "HORIZONTAL_BAR", value.asInstanceOf[js.Any])
    
    inline def setINSET(value: Double): Self = StObject.set(x, "INSET", value.asInstanceOf[js.Any])
    
    inline def setINSET_LARGE(value: Double): Self = StObject.set(x, "INSET_LARGE", value.asInstanceOf[js.Any])
  }
}
