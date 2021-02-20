package typings.ejWebAll.global.ej

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widget {
  
  @JSGlobal("ej.widget")
  @js.native
  def apply(pluginName: String, className: String, proto: js.Any): js.Any = js.native
  
  @JSGlobal("ej.widget.autoInit")
  @js.native
  val autoInit: Boolean = js.native
  
  @JSGlobal("ej.widget.destroyAll")
  @js.native
  def destroyAll(elements: Element): Unit = js.native
  
  @JSGlobal("ej.widget.init")
  @js.native
  def init(element: Element): Unit = js.native
  
  @JSGlobal("ej.widget.register")
  @js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  
  @JSGlobal("ej.widget.registerInstance")
  @js.native
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
  
  @JSGlobal("ej.widget.registeredInstances")
  @js.native
  val registeredInstances: js.Array[js.Any] = js.native
  
  @JSGlobal("ej.widget.registeredWidgets")
  @js.native
  val registeredWidgets: js.Array[js.Any] = js.native
}
