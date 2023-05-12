package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.loop
import typings.framerMotion.framerMotionStrings.mirror
import typings.framerMotion.framerMotionStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlaybackOptions extends StObject {
  
  var repeat: js.UndefOr[Double] = js.undefined
  
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  var repeatType: js.UndefOr[loop | reverse | mirror] = js.undefined
}
object AnimationPlaybackOptions {
  
  inline def apply(): AnimationPlaybackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationPlaybackOptions] (val x: Self) extends AnyVal {
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatType(value: loop | reverse | mirror): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
    
    inline def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
