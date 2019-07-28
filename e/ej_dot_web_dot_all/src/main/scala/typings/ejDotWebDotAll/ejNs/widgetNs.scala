package typings.ejDotWebDotAll.ejNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.widget")
@js.native
object widgetNs extends js.Object {
  val autoInit: Boolean = js.native
  val registeredInstances: js.Array[js.Any] = js.native
  val registeredWidgets: js.Array[js.Any] = js.native
  def destroyAll(elements: Element): Unit = js.native
  def init(element: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

