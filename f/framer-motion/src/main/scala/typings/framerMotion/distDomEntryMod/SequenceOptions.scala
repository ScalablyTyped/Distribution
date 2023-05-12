package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceOptions
  extends StObject
     with AnimationPlaybackOptions {
  
  var defaultTransition: js.UndefOr[Transition] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object SequenceOptions {
  
  inline def apply(): SequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultTransition(value: Transition): Self = StObject.set(x, "defaultTransition", value.asInstanceOf[js.Any])
    
    inline def setDefaultTransitionUndefined: Self = StObject.set(x, "defaultTransition", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
