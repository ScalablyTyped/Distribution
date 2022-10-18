package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gn
  extends StObject
     with n {
  
  var _t: Any
  
  def _toFieldTransform(t: Any): Pe
  
  def isEqual(t: Any): Boolean
}
object Gn {
  
  inline def apply(_methodName: Any, _t: Any, _toFieldTransform: Any => Pe, isEqual: Any => Boolean): Gn = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _t = _t.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[Gn]
  }
  
  extension [Self <: Gn](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_t(value: Any): Self = StObject.set(x, "_t", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => Pe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
