package typings.egjsAxes

import typings.egjsAxes.anon.X
import typings.egjsAxes.declarationTypesMod.ExtendedEvent
import typings.egjsAxes.declarationTypesMod.InputEventType
import typings.std.PointerEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationEventInputEventInputMod {
  
  /* note: abstract class */ @JSImport("@egjs/axes/declaration/eventInput/EventInput", "EventInput")
  @js.native
  open class EventInput () extends StObject {
    
    /* protected */ def _getButton(event: InputEventType): String = js.native
    
    /* protected */ def _getCenter(event: InputEventType): X = js.native
    
    /* protected */ def _getDistance(start: PointerEvent, end: PointerEvent): Double = js.native
    /* protected */ def _getDistance(start: PointerEvent, end: Touch): Double = js.native
    /* protected */ def _getDistance(start: Touch, end: PointerEvent): Double = js.native
    /* protected */ def _getDistance(start: Touch, end: Touch): Double = js.native
    
    /* protected */ def _getMovement(event: InputEventType): X = js.native
    
    /* protected */ def _getScale(event: InputEventType): Double = js.native
    
    /* protected */ def _isTouchEvent(event: InputEventType): /* is std.TouchEvent */ Boolean = js.native
    
    /* protected */ def _isValidButton(button: String, inputButton: js.Array[String]): Boolean = js.native
    
    /* private */ var _latestInterval: Any = js.native
    
    /* protected */ def _preventMouseButton(event: InputEventType, button: String): Unit = js.native
    
    /* private */ var _stopContextMenu: Any = js.native
    
    def extendEvent(event: InputEventType): ExtendedEvent = js.native
    
    def getTouches(event: InputEventType): Double = js.native
    def getTouches(event: InputEventType, inputButton: js.Array[String]): Double = js.native
    
    def onEventEnd(event: InputEventType): Unit = js.native
    
    def onEventMove(event: InputEventType): ExtendedEvent = js.native
    def onEventMove(event: InputEventType, inputButton: js.Array[String]): ExtendedEvent = js.native
    
    def onEventStart(event: InputEventType): ExtendedEvent = js.native
    def onEventStart(event: InputEventType, inputButton: js.Array[String]): ExtendedEvent = js.native
    
    def onRelease(event: InputEventType): Unit = js.native
    
    var prevEvent: ExtendedEvent = js.native
  }
  
  @JSImport("@egjs/axes/declaration/eventInput/EventInput", "SUPPORT_MSPOINTER")
  @js.native
  val SUPPORT_MSPOINTER: Boolean = js.native
  
  @JSImport("@egjs/axes/declaration/eventInput/EventInput", "SUPPORT_POINTER")
  @js.native
  val SUPPORT_POINTER: Boolean = js.native
  
  @JSImport("@egjs/axes/declaration/eventInput/EventInput", "SUPPORT_POINTER_EVENTS")
  @js.native
  val SUPPORT_POINTER_EVENTS: Boolean = js.native
  
  @JSImport("@egjs/axes/declaration/eventInput/EventInput", "SUPPORT_TOUCH")
  @js.native
  val SUPPORT_TOUCH: Boolean = js.native
}
