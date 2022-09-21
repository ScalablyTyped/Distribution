package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dr
  extends StObject
     with sr {
  
  var At: Any
  
  var It: Any
  
  def _apply(t: Any): mn
  
  var `type`: Any
}
object dr {
  
  inline def apply(At: Any, It: Any, _apply: Any => mn, `type`: Any): dr = {
    val __obj = js.Dynamic.literal(At = At.asInstanceOf[js.Any], It = It.asInstanceOf[js.Any], _apply = js.Any.fromFunction1(_apply))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[dr]
  }
  
  extension [Self <: dr](x: Self) {
    
    inline def setAt(value: Any): Self = StObject.set(x, "At", value.asInstanceOf[js.Any])
    
    inline def setIt(value: Any): Self = StObject.set(x, "It", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => mn): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
