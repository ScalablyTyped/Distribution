package typings.devextreme.mod.default

import typings.devextreme.AnonDevice
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "DOMComponent")
@js.native
class DOMComponent protected ()
  extends typings.devextreme.mod.DevExpress.DOMComponent {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: DOMComponentOptions[typings.devextreme.mod.DevExpress.DOMComponent]) = this()
  def this(element: Element, options: DOMComponentOptions[typings.devextreme.mod.DevExpress.DOMComponent]) = this()
}

/* static members */
@JSImport("devextreme", "DOMComponent")
@js.native
object DOMComponent extends js.Object {
  /** Specifies the device-dependent default configuration options for this component. */
  def defaultOptions(rule: AnonDevice): Unit = js.native
  def getInstance(element: JQuery): typings.devextreme.mod.DevExpress.DOMComponent = js.native
  /** Gets the instance of a widget found using its DOM node. */
  def getInstance(element: Element): typings.devextreme.mod.DevExpress.DOMComponent = js.native
}

