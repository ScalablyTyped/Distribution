package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uh
  extends StObject
     with Oh {
  
  var Ia: Any
  
  var Ta: Any
  
  def _apply(t: Any): Zc
  
  var `type`: Any
}
object Uh {
  
  inline def apply(Ia: Any, Ta: Any, _apply: Any => Zc, `type`: Any): Uh = {
    val __obj = js.Dynamic.literal(Ia = Ia.asInstanceOf[js.Any], Ta = Ta.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uh]
  }
  
  extension [Self <: Uh](x: Self) {
    
    inline def setIa(value: Any): Self = StObject.set(x, "Ia", value.asInstanceOf[js.Any])
    
    inline def setTa(value: Any): Self = StObject.set(x, "Ta", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Zc): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
