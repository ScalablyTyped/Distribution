package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An animation that simulates spring physics for realistic motion.
  * This is the default animation for physical values like `x`, `y`, `scale` and `rotate`.
  *
  * @public
  */
trait Spring_
  extends StObject
     with Repeat
     with _TransitionDefinition {
  
  /**
    * `bounce` determines the "bounciness" of a spring animation.
    *
    * `0` is no bounce, and `1` is extremely bouncy.
    *
    * If `duration` is set, this defaults to `0.25`.
    *
    * Note: `bounce` and `duration` will be overridden if `stiffness`, `damping` or `mass` are set.
    *
    * ```jsx
    * <motion.div
    *   animate={{ x: 100 }}
    *   transition={{ type: "spring", bounce: 0.25 }}
    * />
    * ```
    *
    * @public
    */
  var bounce: js.UndefOr[Double] = js.undefined
  
  /**
    * Strength of opposing force. If set to 0, spring will oscillate
    * indefinitely. Set to `10` by default.
    *
    * ```jsx
    * <motion.a
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring', damping: 300 }}
    * />
    * ```
    *
    * @public
    */
  var damping: js.UndefOr[Double] = js.undefined
  
  /**
    * The duration of the animation, defined in seconds. Spring animations can be a maximum of 10 seconds.
    *
    * If `bounce` is set, this defaults to `0.8`.
    *
    * Note: `duration` and `bounce` will be overridden if `stiffness`, `damping` or `mass` are set.
    *
    * ```jsx
    * <motion.div
    *   animate={{ x: 100 }}
    *   transition={{ type: "spring", duration: 0.8 }}
    * />
    * ```
    *
    * @public
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The value to animate from.
    * By default, this is the initial state of the animating value.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring', from: 90 }}
    * />
    * ```
    *
    * @public
    */
  var from: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Mass of the moving object. Higher values will result in more lethargic
    * movement. Set to `1` by default.
    *
    * ```jsx
    * <motion.feTurbulence
    *   animate={{ baseFrequency: 0.5 } as any}
    *   transition={{ type: "spring", mass: 0.5 }}
    * />
    * ```
    *
    * @public
    */
  var mass: js.UndefOr[Double] = js.undefined
  
  /**
    * End animation if distance is below this value and speed is below
    * `restSpeed`. When animation ends, spring gets “snapped” to. Set to
    * `0.01` by default.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring', restDelta: 0.5 }}
    * />
    * ```
    *
    * @public
    */
  var restDelta: js.UndefOr[Double] = js.undefined
  
  /**
    * End animation if absolute speed (in units per second) drops below this
    * value and delta is smaller than `restDelta`. Set to `0.01` by default.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring', restSpeed: 0.5 }}
    * />
    * ```
    *
    * @public
    */
  var restSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Stiffness of the spring. Higher values will create more sudden movement.
    * Set to `100` by default.
    *
    * ```jsx
    * <motion.section
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring', stiffness: 50 }}
    * />
    * ```
    *
    * @public
    */
  var stiffness: js.UndefOr[Double] = js.undefined
  
  /**
    * Set `type` to `"spring"` to animate using spring physics for natural
    * movement. Type is set to `"spring"` by default.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring' }}
    * />
    * ```
    *
    * @public
    */
  var `type`: typings.framerMotion.framerMotionStrings.spring
  
  /**
    * The initial velocity of the spring. By default this is the current velocity of the component.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ type: 'spring', velocity: 2 }}
    * />
    * ```
    *
    * @public
    */
  var velocity: js.UndefOr[Double] = js.undefined
}
object Spring_ {
  
  inline def apply(): Spring_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("spring")
    __obj.asInstanceOf[Spring_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spring_] (val x: Self) extends AnyVal {
    
    inline def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
    
    inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
    
    inline def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setType(value: typings.framerMotion.framerMotionStrings.spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
