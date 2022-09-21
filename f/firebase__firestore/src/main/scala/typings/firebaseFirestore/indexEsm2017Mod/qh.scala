package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait qh
  extends StObject
     with Oh {
  
  var Ia: Any
  
  def _apply(t: Any): Ea
  
  var pa: Any
  
  var `type`: Any
}
object qh {
  
  inline def apply(Ia: Any, _apply: Any => Ea, pa: Any, `type`: Any): qh = {
    val __obj = js.Dynamic.literal(Ia = Ia.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply), pa = pa.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[qh]
  }
  
  extension [Self <: qh](x: Self) {
    
    inline def setIa(value: Any): Self = StObject.set(x, "Ia", value.asInstanceOf[js.Any])
    
    inline def setPa(value: Any): Self = StObject.set(x, "pa", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Ea): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
