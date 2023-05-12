package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionStrings.keyframes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keyframes tweens between multiple `values`.
  *
  * These tweens can be arranged using the `duration`, `easings`, and `times` properties.
  */
trait Keyframes
  extends StObject
     with _TransitionDefinition {
  
  /**
    * The total duration of the animation. Set to `0.3` by default.
    *
    * ```jsx
    * const transition = {
    *   type: "keyframes",
    *   duration: 2
    * }
    *
    * <Frame
    *   animate={{ opacity: 0 }}
    *   transition={transition}
    * />
    * ```
    *
    * @public
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of easing functions for each generated tween, or a single easing function applied to all tweens.
    *
    * This array should be one item less than `values`, as these easings apply to the transitions *between* the `values`.
    *
    * ```jsx
    * const transition = {
    *   backgroundColor: {
    *     type: 'keyframes',
    *     easings: ['circIn', 'circOut']
    *   }
    * }
    * ```
    *
    * @public
    */
  var ease: js.UndefOr[Easing | js.Array[Easing]] = js.undefined
  
  /**
    * @public
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of numbers between 0 and 1, where `1` represents the `total` duration.
    *
    * Each value represents at which point during the animation each item in the animation target should be hit, so the array should be the same length as `values`.
    *
    * Defaults to an array of evenly-spread durations.
    *
    * @public
    */
  var times: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Set `type` to `"keyframes"` to animate using the keyframes animation.
    * Set to `"tween"` by default. This can be used to animate between a series of values.
    *
    * @public
    */
  var `type`: keyframes
}
object Keyframes {
  
  inline def apply(): Keyframes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyframes")
    __obj.asInstanceOf[Keyframes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keyframes] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
    
    inline def setType(value: keyframes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
