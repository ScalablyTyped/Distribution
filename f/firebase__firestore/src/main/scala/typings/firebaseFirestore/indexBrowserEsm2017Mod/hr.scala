package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hr
  extends StObject
     with sr {
  
  var Et: Any
  
  var Tt: Any
  
  def _apply(t: Any): mn
  
  var `type`: Any
}
object hr {
  
  inline def apply(Et: Any, Tt: Any, _apply: Any => mn, `type`: Any): hr = {
    val __obj = js.Dynamic.literal(Et = Et.asInstanceOf[js.Any], Tt = Tt.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[hr]
  }
  
  extension [Self <: hr](x: Self) {
    
    inline def setEt(value: Any): Self = StObject.set(x, "Et", value.asInstanceOf[js.Any])
    
    inline def setTt(value: Any): Self = StObject.set(x, "Tt", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => mn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
