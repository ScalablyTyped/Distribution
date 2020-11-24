package typings.devexpressUtils

import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/evt", JSImport.Namespace)
@js.native
object evtMod extends js.Object {
  
  @js.native
  class EvtUtils () extends js.Object
  /* static members */
  @js.native
  object EvtUtils extends js.Object {
    
    def cancelBubble(evt: Event): Unit = js.native
    
    var clientEventRequiresDocScrollCorrection: js.Any = js.native
    
    def getEventSource(evt: Event): HTMLElement | Null = js.native
    
    def getEventSourceByPosition(evt: MouseEvent): HTMLElement | Null = js.native
    def getEventSourceByPosition(evt: TouchEvent): HTMLElement | Null = js.native
    
    def getEventX(evt: MouseEvent): Double = js.native
    def getEventX(evt: TouchEvent): Double = js.native
    
    def getEventY(evt: MouseEvent): Double = js.native
    def getEventY(evt: TouchEvent): Double = js.native
    
    def getMouseWheelEventName(): String = js.native
    
    def getWheelDelta(evt: WheelEvent): Double = js.native
    
    def isLeftButtonPressed(evt: Event): Boolean = js.native
    
    def preventEvent(evt: Event): Unit = js.native
    
    def preventEventAndBubble(evt: Event): Unit = js.native
  }
}
