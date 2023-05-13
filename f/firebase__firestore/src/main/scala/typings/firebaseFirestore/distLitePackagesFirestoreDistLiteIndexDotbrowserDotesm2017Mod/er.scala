package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait er
  extends StObject
     with jn {
  
  def _toFieldTransform(t: Any): Oe
  
  var dt: Any
  
  def isEqual(t: Any): Boolean
}
object er {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Oe, dt: Any, isEqual: Any => Boolean): er = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), dt = dt.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[er]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: er] (val x: Self) extends AnyVal {
    
    inline def setDt(value: Any): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Oe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
