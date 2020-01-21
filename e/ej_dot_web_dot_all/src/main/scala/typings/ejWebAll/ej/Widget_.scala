package typings.ejWebAll.ej

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Widget")
@js.native
class Widget_ protected () extends WidgetBase {
  def this(pluginName: String, className: String, proto: js.Any) = this()
  var model: js.Any = js.native
  def destroyAll(elements: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("ej.Widget")
@js.native
object Widget_ extends js.Object {
  var fn: Widget_ = js.native
  def extend(widget: Widget_): js.Any = js.native
}

