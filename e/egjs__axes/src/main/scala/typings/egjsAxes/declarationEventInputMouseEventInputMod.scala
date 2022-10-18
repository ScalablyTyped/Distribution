package typings.egjsAxes

import typings.egjsAxes.anon.X
import typings.egjsAxes.declarationEventInputEventInputMod.EventInput
import typings.egjsAxes.declarationTypesMod.ActiveEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationEventInputMouseEventInputMod {
  
  @JSImport("@egjs/axes/declaration/eventInput/MouseEventInput", "MouseEventInput")
  @js.native
  open class MouseEventInput ()
    extends EventInput
       with ActiveEvent {
    
    /* protected */ def _getCenter(event: MouseEvent): X = js.native
    
    /* protected */ def _getMovement(event: MouseEvent): X = js.native
    
    /* protected */ def _getScale(): Double = js.native
    
    val end: js.Array[String] = js.native
    
    val move: js.Array[String] = js.native
    
    def onEventEnd(): Unit = js.native
    
    def onRelease(): Unit = js.native
    
    val start: js.Array[String] = js.native
  }
}
