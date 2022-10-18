package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wh_
  extends StObject
     with Oh {
  
  var Aa: Any
  
  var Ea: Any
  
  def _apply(t: Any): Zc
  
  var `type`: Any
}
object Wh_ {
  
  inline def apply(Aa: Any, Ea: Any, _apply: Any => Zc, `type`: Any): Wh_ = {
    val __obj = js.Dynamic.literal(Aa = Aa.asInstanceOf[js.Any], Ea = Ea.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wh_]
  }
  
  extension [Self <: Wh_](x: Self) {
    
    inline def setAa(value: Any): Self = StObject.set(x, "Aa", value.asInstanceOf[js.Any])
    
    inline def setEa(value: Any): Self = StObject.set(x, "Ea", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Zc): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
