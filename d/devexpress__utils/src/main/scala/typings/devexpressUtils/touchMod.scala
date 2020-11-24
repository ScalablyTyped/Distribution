package typings.devexpressUtils

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.Record
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/touch", JSImport.Namespace)
@js.native
object touchMod extends js.Object {
  
  @js.native
  class TouchUtils () extends js.Object
  /* static members */
  @js.native
  object TouchUtils extends js.Object {
    
    var documentEventAttachingAllowed: Boolean = js.native
    
    var documentTouchHandlers: Record[String, js.Array[EventListenerOrEventListenerObject]] = js.native
    
    def getEventX(evt: TouchEvent): Double = js.native
    
    def getEventY(evt: TouchEvent): Double = js.native
    
    def isTouchEvent(evt: Event): /* is std.TouchEvent */ Boolean = js.native
    
    def isTouchEventName(eventName: String): Boolean = js.native
    
    var msTouchDraggableClassName: String = js.native
    
    def onEventAttachingToDocument(eventName: String, func: EventListenerOrEventListenerObject): Boolean = js.native
    
    var touchMouseDownEventName: String = js.native
    
    var touchMouseMoveEventName: String = js.native
    
    var touchMouseUpEventName: String = js.native
  }
}
