package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rl
  extends StObject
     with Qh_ {
  
  def _toFieldTransform(t: Any): Ms
  
  def isEqual(t: Any): Boolean
  
  var pa: Any
}
object rl {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Ms, isEqual: Any => Boolean, pa: Any): rl = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual), pa = pa.asInstanceOf[js.Any])
    __obj.asInstanceOf[rl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rl] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setPa(value: Any): Self = StObject.set(x, "pa", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => Ms): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
