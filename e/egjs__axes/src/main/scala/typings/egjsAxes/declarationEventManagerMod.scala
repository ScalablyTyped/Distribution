package typings.egjsAxes

import typings.egjsAxes.declarationAnimationAnimationManagerMod.AnimationManager
import typings.egjsAxes.declarationAxesMod.default
import typings.egjsAxes.declarationAxisManagerMod.Axis
import typings.egjsAxes.declarationInputTypeInputTypeMod.InputType
import typings.egjsAxes.declarationTypesMod.AnimationParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationEventManagerMod {
  
  @JSImport("@egjs/axes/declaration/EventManager", "EventManager")
  @js.native
  open class EventManager protected () extends StObject {
    def this(_axes: default) = this()
    
    /* private */ var _axes: Any = js.native
    
    /* private */ var _createUserControll: Any = js.native
    
    /* private */ var _getBounceRatio: Any = js.native
    
    /* private */ var _getRoundPos: Any = js.native
    
    var animationManager: AnimationManager = js.native
    
    def destroy(): Unit = js.native
    
    def hold(pos: Axis, option: ChangeEventOption): Unit = js.native
    
    var holdingCount: Double = js.native
    
    def setAnimationManager(animationManager: AnimationManager): Unit = js.native
    
    def triggerAnimationEnd(): Unit = js.native
    def triggerAnimationEnd(isTrusted: Boolean): Unit = js.native
    
    def triggerAnimationStart(param: AnimationParam): Boolean = js.native
    
    def triggerChange(pos: Axis): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Unit, option: Unit, holding: Boolean): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Unit, option: ChangeEventOption): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Unit, option: ChangeEventOption, holding: Boolean): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Axis): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Axis, option: Unit, holding: Boolean): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Axis, option: ChangeEventOption): Boolean = js.native
    def triggerChange(pos: Axis, depaPos: Axis, option: ChangeEventOption, holding: Boolean): Boolean = js.native
    
    def triggerFinish(): Unit = js.native
    def triggerFinish(isTrusted: Boolean): Unit = js.native
    
    def triggerRelease(param: AnimationParam): Unit = js.native
  }
  
  trait ChangeEventOption extends StObject {
    
    var event: Any
    
    var input: InputType
  }
  object ChangeEventOption {
    
    inline def apply(event: Any, input: InputType): ChangeEventOption = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEventOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventOption] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setInput(value: InputType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
}
