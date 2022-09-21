package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hh
  extends StObject
     with Xa {
  
  def _toFieldTransform(t: Any): Cn
  
  def isEqual(t: Any): Boolean
}
object hh {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Cn, isEqual: Any => Boolean): hh = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[hh]
  }
  
  extension [Self <: hh](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Cn): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
