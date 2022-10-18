package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pr
  extends StObject
     with hr {
  
  var It: Any
  
  var Tt: Any
  
  def _apply(t: Any): bn
  
  var `type`: Any
}
object pr {
  
  inline def apply(It: Any, Tt: Any, _apply: Any => bn, `type`: Any): pr = {
    val __obj = js.Dynamic.literal(It = It.asInstanceOf[js.Any], Tt = Tt.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[pr]
  }
  
  extension [Self <: pr](x: Self) {
    
    inline def setIt(value: Any): Self = StObject.set(x, "It", value.asInstanceOf[js.Any])
    
    inline def setTt(value: Any): Self = StObject.set(x, "Tt", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => bn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
