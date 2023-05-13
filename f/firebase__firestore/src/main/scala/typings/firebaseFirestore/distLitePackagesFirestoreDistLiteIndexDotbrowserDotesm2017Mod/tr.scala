package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait tr
  extends StObject
     with jn {
  
  def _toFieldTransform(t: Any): Oe
  
  def isEqual(t: Any): Boolean
}
object tr {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Oe, isEqual: Any => Boolean): tr = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[tr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: tr] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Oe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
