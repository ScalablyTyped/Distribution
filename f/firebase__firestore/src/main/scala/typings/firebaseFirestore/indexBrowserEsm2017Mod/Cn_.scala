package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cn_
  extends StObject
     with An_ {
  
  def _toFieldTransform(t: Any): Ae
  
  def isEqual(t: Any): Boolean
  
  var wt: Any
}
object Cn_ {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Ae, isEqual: Any => Boolean, wt: Any): Cn_ = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual), wt = wt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cn_]
  }
  
  extension [Self <: Cn_](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setWt(value: Any): Self = StObject.set(x, "wt", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => Ae): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
