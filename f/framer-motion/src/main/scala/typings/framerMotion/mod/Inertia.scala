package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An animation that decelerates a value based on its initial velocity,
  * usually used to implement inertial scrolling.
  *
  * Optionally, `min` and `max` boundaries can be defined, and inertia
  * will snap to these with a spring animation.
  *
  * This animation will automatically precalculate a target value,
  * which can be modified with the `modifyTarget` property.
  *
  * This allows you to add snap-to-grid or similar functionality.
  *
  * Inertia is also the animation used for `dragTransition`, and can be configured via that prop.
  *
  * @public
  */
trait Inertia
  extends StObject
     with _TransitionDefinition {
  
  /**
    * If `min` or `max` is set, this affects the damping of the bounce spring.
    * If set to `0`, spring will oscillate indefinitely. Set to `10` by
    * default.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{
    *     min: 0,
    *     max: 100,
    *     bounceDamping: 8
    *   }}
    * />
    * ```
    *
    * @public
    */
  var bounceDamping: js.UndefOr[Double] = js.undefined
  
  /**
    * If `min` or `max` is set, this affects the stiffness of the bounce
    * spring. Higher values will create more sudden movement. Set to `500` by
    * default.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{
    *     min: 0,
    *     max: 100,
    *     bounceStiffness: 100
    *   }}
    * />
    * ```
    *
    * @public
    */
  var bounceStiffness: js.UndefOr[Double] = js.undefined
  
  /**
    * The value to animate from. By default, this is the current state of the animating value.
    *
    * ```jsx
    * <Frame
    *   drag
    *   dragTransition={{ from: 50 }}
    * />
    * ```
    *
    * @public
    */
  var from: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Maximum constraint. If set, the value will "bump" against this value (or immediately snap to it, if the initial animation value exceeds this value).
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{ min: 0, max: 100 }}
    * />
    * ```
    *
    * @public
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum constraint. If set, the value will "bump" against this value (or immediately spring to it if the animation starts as less than this value).
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{ min: 0, max: 100 }}
    * />
    * ```
    *
    * @public
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that receives the automatically-calculated target and returns a new one. Useful for snapping the target to a grid.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{
    *     power: 0,
    *     // Snap calculated target to nearest 50 pixels
    *     modifyTarget: target => Math.round(target / 50) * 50
    *   }}
    * />
    * ```
    *
    * @public
    */
  var modifyTarget: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
  
  /**
    * A higher power value equals a further target. Set to `0.8` by default.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{ power: 0.2 }}
    * />
    * ```
    *
    * @public
    */
  var power: js.UndefOr[Double] = js.undefined
  
  /**
    * End the animation if the distance to the animation target is below this value, and the absolute speed is below `restSpeed`.
    * When the animation ends, the value gets snapped to the animation target. Set to `0.01` by default.
    * Generally the default values provide smooth animation endings, only in rare cases should you need to customize these.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{ restDelta: 10 }}
    * />
    * ```
    *
    * @public
    */
  var restDelta: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjusting the time constant will change the duration of the
    * deceleration, thereby affecting its feel. Set to `700` by default.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{ timeConstant: 200 }}
    * />
    * ```
    *
    * @public
    */
  var timeConstant: js.UndefOr[Double] = js.undefined
  
  /**
    * Set `type` to animate using the inertia animation. Set to `"tween"` by
    * default. This can be used for natural deceleration, like momentum scrolling.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: "inertia", velocity: 50 }}
    * />
    * ```
    *
    * @public
    */
  var `type`: inertia
  
  /**
    * The initial velocity of the animation.
    * By default this is the current velocity of the component.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'inertia', velocity: 200 }}
    * />
    * ```
    *
    * @public
    */
  var velocity: js.UndefOr[Double] = js.undefined
}
object Inertia {
  
  inline def apply(): Inertia = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("inertia")
    __obj.asInstanceOf[Inertia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inertia] (val x: Self) extends AnyVal {
    
    inline def setBounceDamping(value: Double): Self = StObject.set(x, "bounceDamping", value.asInstanceOf[js.Any])
    
    inline def setBounceDampingUndefined: Self = StObject.set(x, "bounceDamping", js.undefined)
    
    inline def setBounceStiffness(value: Double): Self = StObject.set(x, "bounceStiffness", value.asInstanceOf[js.Any])
    
    inline def setBounceStiffnessUndefined: Self = StObject.set(x, "bounceStiffness", js.undefined)
    
    inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setModifyTarget(value: /* v */ Double => Double): Self = StObject.set(x, "modifyTarget", js.Any.fromFunction1(value))
    
    inline def setModifyTargetUndefined: Self = StObject.set(x, "modifyTarget", js.undefined)
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
    
    inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
    
    inline def setTimeConstant(value: Double): Self = StObject.set(x, "timeConstant", value.asInstanceOf[js.Any])
    
    inline def setTimeConstantUndefined: Self = StObject.set(x, "timeConstant", js.undefined)
    
    inline def setType(value: inertia): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
