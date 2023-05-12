package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait er
  extends StObject
     with Un {
  
  def _toFieldTransform(t: Any): qe
  
  var ft: Any
  
  def isEqual(t: Any): Boolean
}
object er {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => qe, ft: Any, isEqual: Any => Boolean): er = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), ft = ft.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[er]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: er] (val x: Self) extends AnyVal {
    
    inline def setFt(value: Any): Self = StObject.set(x, "ft", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => qe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
