package typings.ejWebAll.global.ej

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.widget")
@js.native
object widget extends js.Object {
  
  def apply(pluginName: String, className: String, proto: js.Any): js.Any = js.native
  
  val autoInit: Boolean = js.native
  
  def destroyAll(elements: Element): Unit = js.native
  
  def init(element: Element): Unit = js.native
  
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
  
  val registeredInstances: js.Array[js.Any] = js.native
  
  val registeredWidgets: js.Array[js.Any] = js.native
}
