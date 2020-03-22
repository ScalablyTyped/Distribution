package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.event
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "events")
@js.native
object events extends js.Object {
  def off(element: js.Array[Element]): Unit = js.native
  def off(element: js.Array[Element], eventName: String): Unit = js.native
  def off(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  def off(element: js.Array[Element], eventName: String, selector: String): Unit = js.native
  def off(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  def off(element: Element): Unit = js.native
  def off(element: Element, eventName: String): Unit = js.native
  def off(element: Element, eventName: String, handler: js.Function): Unit = js.native
  def off(element: Element, eventName: String, selector: String): Unit = js.native
  def off(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  def on(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def on(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  def on(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = js.native
  def on(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  def one(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def one(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  def one(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = js.native
  def one(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  def trigger(element: js.Array[Element], event: String): Unit = js.native
  def trigger(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = js.native
  def trigger(element: js.Array[Element], event: event): Unit = js.native
  def trigger(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = js.native
  def trigger(element: Element, event: String): Unit = js.native
  def trigger(element: Element, event: String, extraParameters: js.Any): Unit = js.native
  def trigger(element: Element, event: event): Unit = js.native
  def trigger(element: Element, event: event, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: String): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: event): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: Element, event: String): Unit = js.native
  def triggerHandler(element: Element, event: String, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: Element, event: event): Unit = js.native
  def triggerHandler(element: Element, event: event, extraParameters: js.Any): Unit = js.native
}

