package typings.devexpressUtils

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.Record
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchMod {
  
  @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils")
  @js.native
  class TouchUtils () extends StObject
  /* static members */
  object TouchUtils {
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.documentEventAttachingAllowed")
    @js.native
    def documentEventAttachingAllowed: Boolean = js.native
    @scala.inline
    def documentEventAttachingAllowed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentEventAttachingAllowed")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.documentTouchHandlers")
    @js.native
    def documentTouchHandlers: Record[String, js.Array[EventListenerOrEventListenerObject]] = js.native
    @scala.inline
    def documentTouchHandlers_=(x: Record[String, js.Array[EventListenerOrEventListenerObject]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentTouchHandlers")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.getEventX")
    @js.native
    def getEventX(evt: TouchEvent): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.getEventY")
    @js.native
    def getEventY(evt: TouchEvent): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.isTouchEvent")
    @js.native
    def isTouchEvent(evt: Event): /* is std.TouchEvent */ Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.isTouchEventName")
    @js.native
    def isTouchEventName(eventName: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.msTouchDraggableClassName")
    @js.native
    def msTouchDraggableClassName: String = js.native
    @scala.inline
    def msTouchDraggableClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("msTouchDraggableClassName")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.onEventAttachingToDocument")
    @js.native
    def onEventAttachingToDocument(eventName: String, func: EventListenerOrEventListenerObject): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.touchMouseDownEventName")
    @js.native
    def touchMouseDownEventName: String = js.native
    @scala.inline
    def touchMouseDownEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchMouseDownEventName")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.touchMouseMoveEventName")
    @js.native
    def touchMouseMoveEventName: String = js.native
    @scala.inline
    def touchMouseMoveEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchMouseMoveEventName")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/touch", "TouchUtils.touchMouseUpEventName")
    @js.native
    def touchMouseUpEventName: String = js.native
    @scala.inline
    def touchMouseUpEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchMouseUpEventName")(x.asInstanceOf[js.Any])
  }
}
