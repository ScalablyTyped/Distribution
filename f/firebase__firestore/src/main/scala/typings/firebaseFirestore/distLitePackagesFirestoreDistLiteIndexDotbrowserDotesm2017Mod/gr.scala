package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait gr
  extends StObject
     with hr {
  
  var At: Any
  
  var Tt: Any
  
  def _apply(t: Any): bn
  
  var `type`: Any
}
object gr {
  
  inline def apply(At: Any, Tt: Any, _apply: Any => bn, `type`: Any): gr = {
    val __obj = js.Dynamic.literal(At = At.asInstanceOf[js.Any], Tt = Tt.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[gr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: gr] (val x: Self) extends AnyVal {
    
    inline def setAt(value: Any): Self = StObject.set(x, "At", value.asInstanceOf[js.Any])
    
    inline def setTt(value: Any): Self = StObject.set(x, "Tt", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
