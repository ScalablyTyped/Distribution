package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fr
  extends StObject
     with hr {
  
  def _apply(t: Any): bn
  
  var bt: Any
  
  var gt: Any
  
  var `type`: String
  
  var vt: Any
}
object fr {
  
  inline def apply(_apply: Any => bn, bt: Any, gt: Any, `type`: String, vt: Any): fr = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), bt = bt.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[fr]
  }
  
  extension [Self <: fr](x: Self) {
    
    inline def setBt(value: Any): Self = StObject.set(x, "bt", value.asInstanceOf[js.Any])
    
    inline def setGt(value: Any): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVt(value: Any): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
