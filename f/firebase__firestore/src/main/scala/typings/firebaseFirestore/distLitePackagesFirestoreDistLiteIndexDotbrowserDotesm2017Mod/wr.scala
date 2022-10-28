package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait wr
  extends StObject
     with hr {
  
  def _apply(t: Any): bn
  
  var _t: Any
  
  var bt: Any
  
  var `type`: String
}
object wr {
  
  inline def apply(_apply: Any => bn, _t: Any, bt: Any, `type`: String): wr = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), _t = _t.asInstanceOf[js.Any], bt = bt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[wr]
  }
  
  extension [Self <: wr](x: Self) {
    
    inline def setBt(value: Any): Self = StObject.set(x, "bt", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
    
    inline def set_t(value: Any): Self = StObject.set(x, "_t", value.asInstanceOf[js.Any])
  }
}
