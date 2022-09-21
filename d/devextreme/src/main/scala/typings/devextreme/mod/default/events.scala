package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @JSImport("devextreme", "default.events")
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventsHandler(event: DxEvent[Event], extraParameters: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eventsHandler")(event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def off(element: js.Array[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String, selector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String, selector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(element: js.Array[Element], eventName: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: js.Array[Element], eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: js.Array[Element], eventName: String, selector: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, selector: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def one(element: js.Array[Element], eventName: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: js.Array[Element], eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: js.Array[Element], eventName: String, selector: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, selector: String, data: Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trigger(element: js.Array[Element], event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: js.Array[Element], event: String, extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: js.Array[Element], event: DxEvent[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: js.Array[Element], event: DxEvent[Event], extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: String, extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: DxEvent[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: DxEvent[Event], extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def triggerHandler(element: js.Array[Element], event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: js.Array[Element], event: String, extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: js.Array[Element], event: DxEvent[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: js.Array[Element], event: DxEvent[Event], extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: String, extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: DxEvent[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: DxEvent[Event], extraParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
