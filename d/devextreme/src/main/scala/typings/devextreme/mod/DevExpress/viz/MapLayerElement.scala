package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerElement extends js.Object {
  /** The parent layer of the layer element. */
  var layer: js.Any = js.native
  /** Applies the layer element settings and updates element appearance. */
  def applySettings(settings: js.Any): Unit = js.native
  /** Gets the value of an attribute. */
  def attribute(name: String): js.Any = js.native
  /** Sets the value of an attribute. */
  def attribute(name: String, value: js.Any): Unit = js.native
  /** Gets the layer element coordinates. */
  def coordinates(): js.Any = js.native
  /** Gets the selection state of the layer element. */
  def selected(): Boolean = js.native
  /** Sets the selection state of the layer element. */
  def selected(state: Boolean): Unit = js.native
}

