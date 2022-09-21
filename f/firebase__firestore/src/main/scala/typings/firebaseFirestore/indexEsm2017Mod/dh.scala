package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dh
  extends StObject
     with Xa {
  
  var _a: Any
  
  def _toFieldTransform(t: Any): Cn
  
  def isEqual(t: Any): Boolean
}
object dh {
  
  inline def apply(_a: Any, _methodName: Any, _toFieldTransform: Any => Cn, isEqual: Any => Boolean): dh = {
    val __obj = js.Dynamic.literal(_a = _a.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[dh]
  }
  
  extension [Self <: dh](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_a(value: Any): Self = StObject.set(x, "_a", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => Cn): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
