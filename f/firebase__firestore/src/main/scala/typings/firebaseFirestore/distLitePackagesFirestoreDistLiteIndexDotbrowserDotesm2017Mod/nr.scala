package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait nr
  extends StObject
     with Un {
  
  def _toFieldTransform(t: Any): qe
  
  var dt: Any
  
  def isEqual(t: Any): Boolean
}
object nr {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => qe, dt: Any, isEqual: Any => Boolean): nr = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), dt = dt.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[nr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: nr] (val x: Self) extends AnyVal {
    
    inline def setDt(value: Any): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => qe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
