package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolateOptions[T] extends StObject {
  
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  var ease: js.UndefOr[EasingFunction | js.Array[EasingFunction]] = js.undefined
  
  var mixer: js.UndefOr[MixerFactory[T]] = js.undefined
}
object InterpolateOptions {
  
  inline def apply[T](): InterpolateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolateOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolateOptions[?], T] (val x: Self & InterpolateOptions[T]) extends AnyVal {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setEase(value: EasingFunction | js.Array[EasingFunction]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: EasingFunction*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setMixer(value: (T, T) => Mix_[T]): Self = StObject.set(x, "mixer", js.Any.fromFunction2(value))
    
    inline def setMixerUndefined: Self = StObject.set(x, "mixer", js.undefined)
  }
}
