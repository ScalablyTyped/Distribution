package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Qn
  extends StObject
     with n {
  
  def _toFieldTransform(t: Any): Pe
  
  def isEqual(t: Any): Boolean
  
  var wt: Any
}
object Qn {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Pe, isEqual: Any => Boolean, wt: Any): Qn = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual), wt = wt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qn]
  }
  
  extension [Self <: Qn](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setWt(value: Any): Self = StObject.set(x, "wt", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => Pe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
