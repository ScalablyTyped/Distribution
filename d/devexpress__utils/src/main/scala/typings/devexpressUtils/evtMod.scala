package typings.devexpressUtils

import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def cancelBubble(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelBubble")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/utils/evt", "EvtUtils.clientEventRequiresDocScrollCorrection")
    @js.native
    def clientEventRequiresDocScrollCorrection: js.Any = js.native
    inline def clientEventRequiresDocScrollCorrection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientEventRequiresDocScrollCorrection")(x.asInstanceOf[js.Any])
    
    inline def getEventSource(evt: Event): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventSource")(evt.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    inline def getEventSourceByPosition(evt: MouseEvent): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventSourceByPosition")(evt.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    inline def getEventSourceByPosition(evt: TouchEvent): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventSourceByPosition")(evt.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    inline def getEventX(evt: MouseEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventX")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getEventX(evt: TouchEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventX")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getEventY(evt: MouseEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventY")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getEventY(evt: TouchEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventY")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getMouseWheelEventName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMouseWheelEventName")().asInstanceOf[String]
    
    inline def getWheelDelta(evt: WheelEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWheelDelta")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isLeftButtonPressed(evt: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeftButtonPressed")(evt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def preventEvent(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def preventEventAndBubble(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventEventAndBubble")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
