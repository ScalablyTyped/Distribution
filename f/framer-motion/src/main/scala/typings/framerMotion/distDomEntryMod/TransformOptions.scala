package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait TransformOptions[T] extends StObject {
  
  /**
    * Clamp values to within the given range. Defaults to `true`
    *
    * @public
    */
  var clamp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Easing functions to use on the interpolations between each value in the input and output ranges.
    *
    * If provided as an array, the array must be one item shorter than the input and output ranges, as the easings apply to the transition **between** each.
    *
    * @public
    */
  var ease: js.UndefOr[EasingFunction | js.Array[EasingFunction]] = js.undefined
  
  /**
    * Provide a function that can interpolate between any two values in the provided range.
    *
    * @public
    */
  var mixer: js.UndefOr[js.Function2[/* from */ T, /* to */ T, js.Function1[/* v */ Double, Any]]] = js.undefined
}
object TransformOptions {
  
  inline def apply[T](): TransformOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformOptions[?], T] (val x: Self & TransformOptions[T]) extends AnyVal {
    
    inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setEase(value: EasingFunction | js.Array[EasingFunction]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: EasingFunction*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setMixer(value: (/* from */ T, /* to */ T) => js.Function1[/* v */ Double, Any]): Self = StObject.set(x, "mixer", js.Any.fromFunction2(value))
    
    inline def setMixerUndefined: Self = StObject.set(x, "mixer", js.undefined)
  }
}
