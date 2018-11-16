package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.widget")
@js.native
object widgetNs extends js.Object {
  val autoInit: scala.Boolean = js.native
  val registeredInstances: js.Array[js.Any] = js.native
  val registeredWidgets: js.Array[js.Any] = js.native
  def destroyAll(elements: stdLib.Element): scala.Unit = js.native
  def init(element: stdLib.Element): scala.Unit = js.native
  def register(pluginName: java.lang.String, className: java.lang.String, prototype: js.Any): scala.Unit = js.native
  def registerInstance(
    element: stdLib.Element,
    pluginName: java.lang.String,
    className: java.lang.String,
    prototype: js.Any
  ): scala.Unit = js.native
}

