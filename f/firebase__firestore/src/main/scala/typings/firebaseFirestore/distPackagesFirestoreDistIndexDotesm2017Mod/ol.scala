package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ol
  extends StObject
     with Qh_ {
  
  var Ia: Any
  
  def _toFieldTransform(t: Any): Ms
  
  def isEqual(t: Any): Boolean
}
object ol {
  
  inline def apply(Ia: Any, _methodName: Any, _toFieldTransform: Any => Ms, isEqual: Any => Boolean): ol = {
    val __obj = js.Dynamic.literal(Ia = Ia.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[ol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ol] (val x: Self) extends AnyVal {
    
    inline def setIa(value: Any): Self = StObject.set(x, "Ia", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Ms): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
