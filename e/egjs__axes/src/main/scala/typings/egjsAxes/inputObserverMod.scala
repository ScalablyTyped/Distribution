package typings.egjsAxes

import typings.egjsAxes.animationManagerMod.AnimationManager
import typings.egjsAxes.axesMod.AxesOption
import typings.egjsAxes.axisManagerMod.Axis
import typings.egjsAxes.axisManagerMod.AxisManager
import typings.egjsAxes.eventManagerMod.EventManager
import typings.egjsAxes.inputTypeMod.IInputTypeObserver
import typings.egjsAxes.interruptManagerMod.InterruptManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputObserverMod {
  
  @JSImport("@egjs/axes/InputObserver", "InputObserver")
  @js.native
  class InputObserver protected () extends IInputTypeObserver {
    def this(
      options: AxesOption,
      itm: InterruptManager,
      em: EventManager,
      axm: AxisManager,
      am: AnimationManager
    ) = this()
    
    var am: js.Any = js.native
    
    /* private */ def atOutside(pos: js.Any): js.Any = js.native
    
    var axm: js.Any = js.native
    
    def change(inputType: js.Any, event: js.Any, offset: Axis): Unit = js.native
    
    var em: js.Any = js.native
    
    var isOutside: Boolean = js.native
    
    var itm: js.Any = js.native
    
    var moveDistance: Axis = js.native
  }
}
