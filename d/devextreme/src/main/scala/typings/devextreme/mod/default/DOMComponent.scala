package typings.devextreme.mod.default

import typings.devextreme.anon.Device
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.DOMComponent")
@js.native
class DOMComponent protected ()
  extends StObject
     with typings.devextreme.mod.DevExpress.DOMComponent {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: DOMComponentOptions[typings.devextreme.mod.DevExpress.DOMComponent]) = this()
  def this(element: Element, options: DOMComponentOptions[typings.devextreme.mod.DevExpress.DOMComponent]) = this()
}
/* static members */
object DOMComponent {
  
  @JSImport("devextreme", "default.DOMComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * [descr:DOMComponent.defaultOptions(rule)]
    */
  @scala.inline
  def defaultOptions(rule: Device): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getInstance(element: JQuery): typings.devextreme.mod.DevExpress.DOMComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.devextreme.mod.DevExpress.DOMComponent]
  /**
    * [descr:DOMComponent.getInstance(element)]
    */
  @scala.inline
  def getInstance(element: Element): typings.devextreme.mod.DevExpress.DOMComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typings.devextreme.mod.DevExpress.DOMComponent]
}
