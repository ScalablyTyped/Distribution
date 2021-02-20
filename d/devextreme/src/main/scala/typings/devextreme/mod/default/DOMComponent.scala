package typings.devextreme.mod.default

import typings.devextreme.anon.Device
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.DOMComponent")
@js.native
class DOMComponent protected ()
  extends typings.devextreme.mod.DevExpress.DOMComponent {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: DOMComponentOptions[typings.devextreme.mod.DevExpress.DOMComponent]) = this()
  def this(element: Element, options: DOMComponentOptions[typings.devextreme.mod.DevExpress.DOMComponent]) = this()
}
/* static members */
object DOMComponent {
  
  /**
    * [descr:DOMComponent.defaultOptions(rule)]
    */
  @JSImport("devextreme", "default.DOMComponent.defaultOptions")
  @js.native
  def defaultOptions(rule: Device): Unit = js.native
  
  @JSImport("devextreme", "default.DOMComponent.getInstance")
  @js.native
  def getInstance(element: JQuery): typings.devextreme.mod.DevExpress.DOMComponent = js.native
  /**
    * [descr:DOMComponent.getInstance(element)]
    */
  @JSImport("devextreme", "default.DOMComponent.getInstance")
  @js.native
  def getInstance(element: Element): typings.devextreme.mod.DevExpress.DOMComponent = js.native
}
