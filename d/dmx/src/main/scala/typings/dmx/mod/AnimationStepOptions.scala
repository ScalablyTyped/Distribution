package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStepOptions extends StObject {
  
  /**
    * @default 'linear'
    */
  var easing: js.UndefOr[EasingType] = js.undefined
}
object AnimationStepOptions {
  
  inline def apply(): AnimationStepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStepOptions]
  }
  
  extension [Self <: AnimationStepOptions](x: Self) {
    
    inline def setEasing(value: EasingType): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
