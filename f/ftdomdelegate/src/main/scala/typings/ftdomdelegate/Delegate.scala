package typings.ftdomdelegate

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delegate extends js.Object {
  
  def destroy(): Unit = js.native
  
  def off(): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    selector: js.UndefOr[scala.Nothing],
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], selector: String): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    selector: String,
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], selector: js.Function1[/* element */ Element, Boolean]): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def off(eventType: String): Unit = js.native
  def off(
    eventType: String,
    selector: js.UndefOr[scala.Nothing],
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def off(eventType: String, selector: String): Unit = js.native
  def off(
    eventType: String,
    selector: String,
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def off(eventType: String, selector: js.Function1[/* element */ Element, Boolean]): Unit = js.native
  def off(
    eventType: String,
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  
  def on(eventType: String, handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]): Unit = js.native
  def on(
    eventType: String,
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit],
    eventData: js.Any
  ): Unit = js.native
  def on(
    eventType: String,
    selector: String,
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def on(
    eventType: String,
    selector: String,
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit],
    eventData: js.Any
  ): Unit = js.native
  def on(
    eventType: String,
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit]
  ): Unit = js.native
  def on(
    eventType: String,
    selector: js.Function1[/* element */ Element, Boolean],
    handler: js.Function2[/* event */ Event, /* targetElement */ Element, Unit],
    eventData: js.Any
  ): Unit = js.native
  
  def root(): Unit = js.native
  def root(element: Element): Unit = js.native
}
