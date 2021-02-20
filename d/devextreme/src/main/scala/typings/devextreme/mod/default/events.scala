package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.events.event
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @JSImport("devextreme", "default.events.dxEvent")
  @js.native
  class dxEvent ()
    extends typings.devextreme.mod.DevExpress.events.dxEvent
  
  @JSImport("devextreme", "default.events.eventsHandler")
  @js.native
  def eventsHandler(event: typings.devextreme.mod.DevExpress.events.dxEvent, extraParameters: js.Any): Boolean = js.native
  
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: js.Array[Element]): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: js.Array[Element], eventName: String): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: js.Array[Element], eventName: String, selector: String): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: Element): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: Element, eventName: String): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: Element, eventName: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: Element, eventName: String, selector: String): Unit = js.native
  @JSImport("devextreme", "default.events.off")
  @js.native
  def off(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: Element, eventName: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.on")
  @js.native
  def on(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: Element, eventName: String, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = js.native
  @JSImport("devextreme", "default.events.one")
  @js.native
  def one(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: js.Array[Element], event: String): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: js.Array[Element], event: event): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: Element, event: String): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: Element, event: String, extraParameters: js.Any): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: Element, event: event): Unit = js.native
  @JSImport("devextreme", "default.events.trigger")
  @js.native
  def trigger(element: Element, event: event, extraParameters: js.Any): Unit = js.native
  
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: js.Array[Element], event: String): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: js.Array[Element], event: event): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: Element, event: String): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: Element, event: String, extraParameters: js.Any): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: Element, event: event): Unit = js.native
  @JSImport("devextreme", "default.events.triggerHandler")
  @js.native
  def triggerHandler(element: Element, event: event, extraParameters: js.Any): Unit = js.native
}
