package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Widget")
@js.native
class Widget protected () extends WidgetBase {
  def this(pluginName: java.lang.String, className: java.lang.String, proto: js.Any) = this()
  var model: js.Any = js.native
  def destroyAll(elements: stdLib.Element): scala.Unit = js.native
  def register(pluginName: java.lang.String, className: java.lang.String, prototype: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.Widget")
@js.native
object Widget extends js.Object {
  var fn: ejDotWebDotAllLib.ejNs.Widget = js.native
  def extend(widget: ejDotWebDotAllLib.ejNs.Widget): js.Any = js.native
}

