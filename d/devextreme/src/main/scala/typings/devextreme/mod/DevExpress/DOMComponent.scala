package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMComponent extends Component {
  /** Disposes of all the resources allocated to the widget instance. */
  def dispose(): Unit = js.native
  /** Gets the root widget element. */
  def element(): dxElement = js.native
}

