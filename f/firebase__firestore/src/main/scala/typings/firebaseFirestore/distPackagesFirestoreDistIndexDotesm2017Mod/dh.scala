package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dh
  extends StObject
     with sh {
  
  def _toFieldTransform(t: Any): Null
  
  def isEqual(t: Any): Boolean
}
object dh {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Null, isEqual: Any => Boolean): dh = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[dh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dh] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Null): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
