package typings.egjsAxes

import typings.egjsAxes.animationManagerMod.AnimationManager
import typings.egjsAxes.anon.AxisManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingManagerMod {
  
  @JSImport("@egjs/axes/declaration/animation/EasingManager", "EasingManager")
  @js.native
  open class EasingManager protected () extends AnimationManager {
    def this(hasOptionsInterruptManagerEventManagerAxisManager: AxisManager) = this()
    
    /* private */ var _durationOffset: Any = js.native
    
    /* private */ var _easing: Any = js.native
    
    /* private */ var _initialEasingPer: Any = js.native
    
    /* private */ var _prevEasingPer: Any = js.native
    
    /* protected */ var _useDuration: Boolean = js.native
  }
}
