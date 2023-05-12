package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jn_
  extends StObject
     with Un {
  
  def _toFieldTransform(t: Any): Null
  
  def isEqual(t: Any): Boolean
}
object Jn_ {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Null, isEqual: Any => Boolean): Jn_ = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[Jn_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jn_] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Null): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
