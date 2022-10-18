package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Er
  extends StObject
     with hr {
  
  var At: Any
  
  var Rt: Any
  
  def _apply(t: Any): bn
  
  var `type`: Any
}
object Er {
  
  inline def apply(At: Any, Rt: Any, _apply: Any => bn, `type`: Any): Er = {
    val __obj = js.Dynamic.literal(At = At.asInstanceOf[js.Any], Rt = Rt.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Er]
  }
  
  extension [Self <: Er](x: Self) {
    
    inline def setAt(value: Any): Self = StObject.set(x, "At", value.asInstanceOf[js.Any])
    
    inline def setRt(value: Any): Self = StObject.set(x, "Rt", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
