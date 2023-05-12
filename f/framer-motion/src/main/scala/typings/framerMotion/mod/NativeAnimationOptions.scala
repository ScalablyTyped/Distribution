package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.loop
import typings.framerMotion.framerMotionStrings.mirror
import typings.framerMotion.framerMotionStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeAnimationOptions extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var ease: js.UndefOr[Easing | js.Array[Easing]] = js.undefined
  
  var repeat: js.UndefOr[Double] = js.undefined
  
  var repeatType: js.UndefOr[loop | reverse | mirror] = js.undefined
  
  var times: js.UndefOr[js.Array[Double]] = js.undefined
}
object NativeAnimationOptions {
  
  inline def apply(): NativeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatType(value: loop | reverse | mirror): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
    
    inline def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
