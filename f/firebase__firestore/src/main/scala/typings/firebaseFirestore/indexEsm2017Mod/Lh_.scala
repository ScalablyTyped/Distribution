package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lh_
  extends StObject
     with Oh {
  
  def _apply(t: Any): Ea
  
  var `type`: String
  
  var wa: Any
  
  var ya: Any
}
object Lh_ {
  
  inline def apply(_apply: Any => Ea, `type`: String, wa: Any, ya: Any): Lh_ = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), wa = wa.asInstanceOf[js.Any], ya = ya.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lh_]
  }
  
  extension [Self <: Lh_](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWa(value: Any): Self = StObject.set(x, "wa", value.asInstanceOf[js.Any])
    
    inline def setYa(value: Any): Self = StObject.set(x, "ya", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Ea): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
