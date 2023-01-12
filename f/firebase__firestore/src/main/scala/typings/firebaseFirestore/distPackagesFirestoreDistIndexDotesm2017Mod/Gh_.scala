package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gh_
  extends StObject
     with Oh {
  
  var Aa: Any
  
  var Ea: Any
  
  def _apply(t: Any): Zc
  
  var `type`: Any
}
object Gh_ {
  
  inline def apply(Aa: Any, Ea: Any, _apply: Any => Zc, `type`: Any): Gh_ = {
    val __obj = js.Dynamic.literal(Aa = Aa.asInstanceOf[js.Any], Ea = Ea.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gh_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gh_] (val x: Self) extends AnyVal {
    
    inline def setAa(value: Any): Self = StObject.set(x, "Aa", value.asInstanceOf[js.Any])
    
    inline def setEa(value: Any): Self = StObject.set(x, "Ea", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Zc): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
