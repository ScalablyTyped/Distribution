package typings
package ftdomdelegateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Delegate")
@js.native
class Delegate protected () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def destroy(): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def off(eventType: java.lang.String): scala.Unit = js.native
  def off(eventType: java.lang.String, selector: java.lang.String): scala.Unit = js.native
  def off(
    eventType: java.lang.String,
    selector: java.lang.String,
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def off(eventType: java.lang.String, selector: js.Function1[/* element */ stdLib.Element, scala.Boolean]): scala.Unit = js.native
  def off(
    eventType: java.lang.String,
    selector: js.Function1[/* element */ stdLib.Element, scala.Boolean],
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def on(
    eventType: java.lang.String,
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def on(
    eventType: java.lang.String,
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit],
    eventData: js.Any
  ): scala.Unit = js.native
  def on(
    eventType: java.lang.String,
    selector: java.lang.String,
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def on(
    eventType: java.lang.String,
    selector: java.lang.String,
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit],
    eventData: js.Any
  ): scala.Unit = js.native
  def on(
    eventType: java.lang.String,
    selector: js.Function1[/* element */ stdLib.Element, scala.Boolean],
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def on(
    eventType: java.lang.String,
    selector: js.Function1[/* element */ stdLib.Element, scala.Boolean],
    handler: js.Function2[/* event */ stdLib.Event, /* targetElement */ stdLib.Element, scala.Unit],
    eventData: js.Any
  ): scala.Unit = js.native
  def root(): scala.Unit = js.native
  def root(element: stdLib.Element): scala.Unit = js.native
}

