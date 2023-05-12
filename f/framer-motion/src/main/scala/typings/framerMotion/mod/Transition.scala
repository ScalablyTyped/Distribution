package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.decay
import typings.framerMotion.framerMotionStrings.inertia
import typings.framerMotion.framerMotionStrings.keyframes
import typings.framerMotion.framerMotionStrings.loop
import typings.framerMotion.framerMotionStrings.mirror
import typings.framerMotion.framerMotionStrings.reverse
import typings.framerMotion.framerMotionStrings.tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent framer-motion.framer-motion.AnimationPlaybackOptions */
/* Inlined parent std.Omit<framer-motion.framer-motion.SpringOptions, 'keyframes'> */
/* Inlined parent std.Omit<framer-motion.framer-motion.InertiaOptions$1, 'keyframes'> */
/* Inlined parent framer-motion.framer-motion.KeyframeOptions */
trait Transition extends StObject {
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var bounce: js.UndefOr[Double] = js.undefined
  
  var bounceDamping: js.UndefOr[Double] = js.undefined
  
  var bounceStiffness: js.UndefOr[Double] = js.undefined
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var driver: js.UndefOr[Driver] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var ease: js.UndefOr[Easing | js.Array[Easing]] = js.undefined
  
  var elapsed: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var modifyTarget: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
  
  var power: js.UndefOr[Double] = js.undefined
  
  var repeat: js.UndefOr[Double] = js.undefined
  
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  var repeatType: js.UndefOr[loop | reverse | mirror] = js.undefined
  
  var restDelta: js.UndefOr[Double] = js.undefined
  
  var restSpeed: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var timeConstant: js.UndefOr[Double] = js.undefined
  
  var times: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: js.UndefOr[
    decay | typings.framerMotion.framerMotionStrings.spring | keyframes | tween | inertia
  ] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
}
object Transition {
  
  inline def apply(): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setBounceDamping(value: Double): Self = StObject.set(x, "bounceDamping", value.asInstanceOf[js.Any])
    
    inline def setBounceDampingUndefined: Self = StObject.set(x, "bounceDamping", js.undefined)
    
    inline def setBounceStiffness(value: Double): Self = StObject.set(x, "bounceStiffness", value.asInstanceOf[js.Any])
    
    inline def setBounceStiffnessUndefined: Self = StObject.set(x, "bounceStiffness", js.undefined)
    
    inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDriver(value: /* update */ Update => DriverControls): Self = StObject.set(x, "driver", js.Any.fromFunction1(value))
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
    
    inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setModifyTarget(value: /* v */ Double => Double): Self = StObject.set(x, "modifyTarget", js.Any.fromFunction1(value))
    
    inline def setModifyTargetUndefined: Self = StObject.set(x, "modifyTarget", js.undefined)
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatType(value: loop | reverse | mirror): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
    
    inline def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
    
    inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
    
    inline def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setTimeConstant(value: Double): Self = StObject.set(x, "timeConstant", value.asInstanceOf[js.Any])
    
    inline def setTimeConstantUndefined: Self = StObject.set(x, "timeConstant", js.undefined)
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
    
    inline def setType(value: decay | typings.framerMotion.framerMotionStrings.spring | keyframes | tween | inertia): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
