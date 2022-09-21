package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  /**
    * Allows you to read or modify the values being set to each channel during each animation step.
    *
    * You may modify the values of `completedAnimationStatesToSet` to override the values in real-time,
    * for example to scale channel brightness based on a master fader.
    */
  var filter: js.UndefOr[js.Function1[/* completedAnimationStatesToSet */ ChannelMap, Boolean]] = js.undefined
  
  /**
    * The number of times this animation sequence will loop when `run()` is invoked. This value is overridden
    * if you invoke `runLoop()`.
    */
  var loop: js.UndefOr[Double] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setFilter(value: /* completedAnimationStatesToSet */ ChannelMap => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
