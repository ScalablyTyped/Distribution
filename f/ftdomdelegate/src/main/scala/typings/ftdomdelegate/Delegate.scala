package typings.ftdomdelegate

import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Delegate")
@js.native
class Delegate protected () extends js.Object {
  def this(element: HTMLElement) = this()
  def destroy(): Unit = js.native
  def off(): Unit = js.native
  def off(eventType: String): Unit = js.native
  def off(eventType: String, selector: String): Unit = js.native
  def off(
    eventType: String,
    selector: String,
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def off(eventType: String, selector: js.Function1[/* element */ Element, Boolean]): Unit = js.native
  def off(
    eventType: String,
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def on(eventType: String, handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit]): Unit = js.native
  def on(
    eventType: String,
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit],
    eventData: js.Any
  ): Unit = js.native
  def on(
    eventType: String,
    selector: String,
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def on(
    eventType: String,
    selector: String,
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit],
    eventData: js.Any
  ): Unit = js.native
  def on(
    eventType: String,
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def on(
    eventType: String,
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event_, /* targetElement */ Element, Unit],
    eventData: js.Any
  ): Unit = js.native
  def root(): Unit = js.native
  def root(element: Element): Unit = js.native
}

