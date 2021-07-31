package typings.ejWebAll.global.ej

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widget {
  
  @scala.inline
  def apply(pluginName: String, className: String, proto: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(pluginName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSGlobal("ej.widget")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.widget.autoInit")
  @js.native
  val autoInit: Boolean = js.native
  
  @scala.inline
  def destroyAll(elements: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def init(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def register(pluginName: String, className: String, prototype: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(pluginName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], prototype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInstance")(element.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], prototype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("ej.widget.registeredInstances")
  @js.native
  val registeredInstances: js.Array[js.Any] = js.native
  
  @JSGlobal("ej.widget.registeredWidgets")
  @js.native
  val registeredWidgets: js.Array[js.Any] = js.native
}
