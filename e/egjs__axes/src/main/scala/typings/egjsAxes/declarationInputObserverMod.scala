package typings.egjsAxes

import typings.egjsAxes.anon.AnimationManager
import typings.egjsAxes.declarationInputTypeInputTypeMod.InputTypeObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationInputObserverMod {
  
  @JSImport("@egjs/axes/declaration/InputObserver", "InputObserver")
  @js.native
  open class InputObserver protected ()
    extends StObject
       with InputTypeObserver {
    def this(hasOptionsInterruptManagerEventManagerAxisManagerAnimationManager: AnimationManager) = this()
    
    /* private */ var _animationManager: Any = js.native
    
    /* private */ var _atOutside: Any = js.native
    
    /* private */ var _axisManager: Any = js.native
    
    /* private */ var _eventManager: Any = js.native
    
    /* private */ var _interruptManager: Any = js.native
    
    /* private */ var _isEndofAxis: Any = js.native
    
    /* private */ var _isOutside: Any = js.native
    
    /* private */ var _isStopped: Any = js.native
    
    /* private */ var _moveDistance: Any = js.native
  }
}
