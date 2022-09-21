package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait or
  extends StObject
     with sr {
  
  def _apply(t: Any): mn
  
  var _t: Any
  
  var gt: Any
  
  var `type`: String
  
  var vt: Any
}
object or {
  
  inline def apply(_apply: Any => mn, _t: Any, gt: Any, `type`: String, vt: Any): or = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _t = _t.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[or]
  }
  
  extension [Self <: or](x: Self) {
    
    inline def setGt(value: Any): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVt(value: Any): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => mn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_t(value: Any): Self = StObject.set(x, "_t", value.asInstanceOf[js.Any])
  }
}
