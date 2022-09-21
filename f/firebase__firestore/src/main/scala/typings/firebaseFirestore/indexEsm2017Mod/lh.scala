package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait lh
  extends StObject
     with Xa {
  
  def _toFieldTransform(t: Any): Cn
  
  var da: Any
  
  def isEqual(t: Any): Boolean
}
object lh {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Cn, da: Any, isEqual: Any => Boolean): lh = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), da = da.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[lh]
  }
  
  extension [Self <: lh](x: Self) {
    
    inline def setDa(value: Any): Self = StObject.set(x, "da", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Cn): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
