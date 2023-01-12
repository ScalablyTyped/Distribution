package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pr
  extends StObject
     with hr {
  
  var Et: Any
  
  var It: Any
  
  def _apply(t: Any): bn
  
  var `type`: Any
}
object pr {
  
  inline def apply(Et: Any, It: Any, _apply: Any => bn, `type`: Any): pr = {
    val __obj = js.Dynamic.literal(Et = Et.asInstanceOf[js.Any], It = It.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[pr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pr] (val x: Self) extends AnyVal {
    
    inline def setEt(value: Any): Self = StObject.set(x, "Et", value.asInstanceOf[js.Any])
    
    inline def setIt(value: Any): Self = StObject.set(x, "It", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
