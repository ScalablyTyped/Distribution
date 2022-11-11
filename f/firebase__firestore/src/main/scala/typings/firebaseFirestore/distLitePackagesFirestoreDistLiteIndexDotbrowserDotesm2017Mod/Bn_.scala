package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bn_
  extends StObject
     with Dn {
  
  def _toFieldTransform(t: Any): Pe
  
  def isEqual(t: Any): Boolean
}
object Bn_ {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Pe, isEqual: Any => Boolean): Bn_ = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[Bn_]
  }
  
  extension [Self <: Bn_](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def set_toFieldTransform(value: Any => Pe): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
