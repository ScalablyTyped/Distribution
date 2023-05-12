package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.loop
import typings.framerMotion.framerMotionStrings.mirror
import typings.framerMotion.framerMotionStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repeat extends StObject {
  
  /**
    * The number of times to repeat the transition. Set to `Infinity` for perpetual repeating.
    *
    * Without setting `repeatType`, this will loop the animation.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ repeat: Infinity, duration: 2 }}
    * />
    * ```
    *
    * @public
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    * When repeating an animation, `repeatDelay` will set the
    * duration of the time to wait, in seconds, between each repetition.
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{ repeat: Infinity, repeatDelay: 1 }}
    * />
    * ```
    *
    * @public
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * How to repeat the animation. This can be either:
    *
    * "loop": Repeats the animation from the start
    *
    * "reverse": Alternates between forward and backwards playback
    *
    * "mirror": Switches `from` and `to` alternately
    *
    * ```jsx
    * <motion.div
    *   animate={{ rotate: 180 }}
    *   transition={{
    *     repeat: 1,
    *     repeatType: "reverse",
    *     duration: 2
    *   }}
    * />
    * ```
    *
    * @public
    */
  var repeatType: js.UndefOr[loop | reverse | mirror] = js.undefined
}
object Repeat {
  
  inline def apply(): Repeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repeat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repeat] (val x: Self) extends AnyVal {
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatType(value: loop | reverse | mirror): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
    
    inline def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
