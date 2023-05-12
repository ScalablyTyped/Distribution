package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeOptions extends StObject {
  
  var ease: js.UndefOr[Easing | js.Array[Easing]] = js.undefined
  
  var times: js.UndefOr[js.Array[Double]] = js.undefined
}
object KeyframeOptions {
  
  inline def apply(): KeyframeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyframeOptions] (val x: Self) extends AnyVal {
    
    inline def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
