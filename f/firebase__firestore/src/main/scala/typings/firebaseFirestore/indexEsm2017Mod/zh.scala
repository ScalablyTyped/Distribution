package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait zh
  extends StObject
     with Oh {
  
  var Ea: Any
  
  var Ta: Any
  
  def _apply(t: Any): Ea
  
  var `type`: Any
}
object zh {
  
  inline def apply(Ea: Any, Ta: Any, _apply: Any => Ea, `type`: Any): zh = {
    val __obj = js.Dynamic.literal(Ea = Ea.asInstanceOf[js.Any], Ta = Ta.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[zh]
  }
  
  extension [Self <: zh](x: Self) {
    
    inline def setEa(value: Any): Self = StObject.set(x, "Ea", value.asInstanceOf[js.Any])
    
    inline def setTa(value: Any): Self = StObject.set(x, "Ta", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Ea): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
