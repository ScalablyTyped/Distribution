package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An animation that animates between two or more values over a specific duration of time.
  * This is the default animation for non-physical values like `color` and `opacity`.
  *
  * @public
  */
trait Tween
  extends StObject
     with Repeat
     with _TransitionDefinition {
  
  /**
    * The duration of the tween animation. Set to `0.3` by default, 0r `0.8` if animating a series of keyframes.
    *
    * ```jsx
    * const variants = {
    *   visible: {
    *     opacity: 1,
    *     transition: { duration: 2 }
    *   }
    * }
    * ```
    *
    * @public
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The easing function to use. Set as one of the below.
    *
    * - The name of an existing easing function.
    *
    * - An array of four numbers to define a cubic bezier curve.
    *
    * - An easing function, that accepts and returns a value `0-1`.
    *
    * If the animating value is set as an array of multiple values for a keyframes
    * animation, `ease` can be set as an array of easing functions to set different easings between
    * each of those values.
    *
    *
    * ```jsx
    * <motion.div
    *   animate={{ opacity: 0 }}
    *   transition={{ ease: [0.17, 0.67, 0.83, 0.67] }}
    * />
    * ```
    *
    * @public
    */
  var ease: js.UndefOr[Easing | js.Array[Easing]] = js.undefined
  
  /**
    * When animating keyframes, `easings` can be used to define easing functions between each keyframe. This array should be one item fewer than the number of keyframes, as these easings apply to the transitions between the keyframes.
    *
    * ```jsx
    * <motion.div
    *   animate={{ backgroundColor: ["#0f0", "#00f", "#f00"] }}
    *   transition={{ easings: ["easeIn", "easeOut"] }}
    * />
    * ```
    *
    * @public
    */
  var easings: js.UndefOr[js.Array[Easing]] = js.undefined
  
  /**
    * The value to animate from.
    * By default, this is the current state of the animating value.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ from: 90, duration: 2 }}
    * />
    * ```
    *
    * @public
    */
  var from: js.UndefOr[Double | String] = js.undefined
  
  /**
    * When animating keyframes, `times` can be used to determine where in the animation each keyframe is reached.
    * Each value in `times` is a value between `0` and `1`, representing `duration`.
    *
    * There must be the same number of `times` as there are keyframes.
    * Defaults to an array of evenly-spread durations.
    *
    * ```jsx
    * <motion.div
    *   animate={{ scale: [0, 1, 0.5, 1] }}
    *   transition={{ times: [0, 0.1, 0.9, 1] }}
    * />
    * ```
    *
    * @public
    */
  var times: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Set `type` to `"tween"` to use a duration-based tween animation.
    * If any non-orchestration `transition` values are set without a `type` property,
    * this is used as the default animation.
    *
    * ```jsx
    * <motion.path
    *   animate={{ pathLength: 1 }}
    *   transition={{ duration: 2, type: "tween" }}
    * />
    * ```
    *
    * @public
    */
  var `type`: js.UndefOr[tween] = js.undefined
}
object Tween {
  
  inline def apply(): Tween = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tween]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tween] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setEasings(value: js.Array[Easing]): Self = StObject.set(x, "easings", value.asInstanceOf[js.Any])
    
    inline def setEasingsUndefined: Self = StObject.set(x, "easings", js.undefined)
    
    inline def setEasingsVarargs(value: Easing*): Self = StObject.set(x, "easings", js.Array(value*))
    
    inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
    
    inline def setType(value: tween): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
