package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait yh
  extends StObject
     with sh {
  
  def _toFieldTransform(t: Any): xn
  
  def isEqual(t: Any): Boolean
  
  var wa: Any
}
object yh {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => xn, isEqual: Any => Boolean, wa: Any): yh = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual), wa = wa.asInstanceOf[js.Any])
    __obj.asInstanceOf[yh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: yh] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setWa(value: Any): Self = StObject.set(x, "wa", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => xn): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
