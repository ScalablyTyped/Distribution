package typings.egjsAxes

import typings.egjsAxes.anon.X
import typings.egjsAxes.declarationEventInputEventInputMod.EventInput
import typings.egjsAxes.declarationTypesMod.ActiveEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationEventInputTouchMouseEventInputMod {
  
  @JSImport("@egjs/axes/declaration/eventInput/TouchMouseEventInput", "TouchMouseEventInput")
  @js.native
  open class TouchMouseEventInput ()
    extends EventInput
       with ActiveEvent {
    
    /* private */ var _baseTouches: Any = js.native
    
    /* protected */ def _getCenter(event: MouseEvent): X = js.native
    /* protected */ def _getCenter(event: TouchEvent): X = js.native
    
    /* protected */ def _getMovement(event: MouseEvent): X = js.native
    /* protected */ def _getMovement(event: TouchEvent): X = js.native
    
    /* protected */ def _getScale(event: MouseEvent): Double = js.native
    /* protected */ def _getScale(event: TouchEvent): Double = js.native
    
    val end: js.Array[String] = js.native
    
    val move: js.Array[String] = js.native
    
    def onRelease(): Unit = js.native
    
    val start: js.Array[String] = js.native
  }
}
