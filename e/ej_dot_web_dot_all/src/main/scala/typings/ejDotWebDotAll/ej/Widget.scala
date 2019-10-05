package typings.ejDotWebDotAll.ej

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Widget")
@js.native
class Widget protected () extends WidgetBase {
  def this(pluginName: String, className: String, proto: js.Any) = this()
  var model: js.Any = js.native
  def destroyAll(elements: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("ej.Widget")
@js.native
object Widget extends js.Object {
  var fn: Widget = js.native
  def extend(widget: Widget): js.Any = js.native
}

@JSGlobal("ej.widget")
@js.native
object widget extends js.Object {
  val autoInit: Boolean = js.native
  val registeredInstances: js.Array[js.Any] = js.native
  val registeredWidgets: js.Array[js.Any] = js.native
  def apply(pluginName: String, className: String, proto: js.Any): js.Any = js.native
  def destroyAll(elements: Element): Unit = js.native
  def init(element: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

