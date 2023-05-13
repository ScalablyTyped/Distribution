package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sl
  extends StObject
     with Qh_ {
  
  def _toFieldTransform(t: Any): Ms
  
  def isEqual(t: Any): Boolean
}
object sl {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Ms, isEqual: Any => Boolean): sl = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[sl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sl] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Ms): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
