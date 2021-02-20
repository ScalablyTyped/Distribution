package typings.devexpressUtils

import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evtMod {
  
  @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils")
  @js.native
  class EvtUtils () extends StObject
  /* static members */
  object EvtUtils {
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.cancelBubble")
    @js.native
    def cancelBubble(evt: Event): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.clientEventRequiresDocScrollCorrection")
    @js.native
    def clientEventRequiresDocScrollCorrection: js.Any = js.native
    @scala.inline
    def clientEventRequiresDocScrollCorrection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientEventRequiresDocScrollCorrection")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventSource")
    @js.native
    def getEventSource(evt: Event): HTMLElement | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventSourceByPosition")
    @js.native
    def getEventSourceByPosition(evt: MouseEvent): HTMLElement | Null = js.native
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventSourceByPosition")
    @js.native
    def getEventSourceByPosition(evt: TouchEvent): HTMLElement | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventX")
    @js.native
    def getEventX(evt: MouseEvent): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventX")
    @js.native
    def getEventX(evt: TouchEvent): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventY")
    @js.native
    def getEventY(evt: MouseEvent): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getEventY")
    @js.native
    def getEventY(evt: TouchEvent): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getMouseWheelEventName")
    @js.native
    def getMouseWheelEventName(): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.getWheelDelta")
    @js.native
    def getWheelDelta(evt: WheelEvent): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.isLeftButtonPressed")
    @js.native
    def isLeftButtonPressed(evt: Event): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.preventEvent")
    @js.native
    def preventEvent(evt: Event): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.preventEventAndBubble")
    @js.native
    def preventEventAndBubble(evt: Event): Unit = js.native
  }
}
