package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mn_
  extends StObject
     with An_ {
  
  def _toFieldTransform(t: Any): Ae
  
  def isEqual(t: Any): Boolean
  
  var yt: Any
}
object Mn_ {
  
  inline def apply(_methodName: Any, _toFieldTransform: Any => Ae, isEqual: Any => Boolean, yt: Any): Mn_ = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _toFieldTransform = js.Any.fromFunction1(_toFieldTransform), isEqual = js.Any.fromFunction1(isEqual), yt = yt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mn_]
  }
  
  extension [Self <: Mn_](x: Self) {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setYt(value: Any): Self = StObject.set(x, "yt", value.asInstanceOf[js.Any])
    
    inline def set_toFieldTransform(value: Any => Ae): Self = StObject.set(x, "_toFieldTransform", js.Any.fromFunction1(value))
  }
}
