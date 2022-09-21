package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cr
  extends StObject
     with sr {
  
  def _apply(t: Any): mn
  
  var _t: Any
  
  var bt: Any
  
  var `type`: String
}
object cr {
  
  inline def apply(_apply: Any => mn, _t: Any, bt: Any, `type`: String): cr = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _t = _t.asInstanceOf[js.Any], bt = bt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[cr]
  }
  
  extension [Self <: cr](x: Self) {
    
    inline def setBt(value: Any): Self = StObject.set(x, "bt", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => mn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_t(value: Any): Self = StObject.set(x, "_t", value.asInstanceOf[js.Any])
  }
}
