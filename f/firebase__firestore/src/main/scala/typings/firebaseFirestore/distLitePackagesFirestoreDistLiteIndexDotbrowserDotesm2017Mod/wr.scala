package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait wr
  extends StObject
     with hr {
  
  var Et: Any
  
  def _apply(t: Any): bn
  
  var gt: Any
  
  var `type`: String
}
object wr {
  
  inline def apply(Et: Any, _apply: Any => bn, gt: Any, `type`: String): wr = {
    val __obj = js.Dynamic.literal(Et = Et.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply), gt = gt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[wr]
  }
  
  extension [Self <: wr](x: Self) {
    
    inline def setEt(value: Any): Self = StObject.set(x, "Et", value.asInstanceOf[js.Any])
    
    inline def setGt(value: Any): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
