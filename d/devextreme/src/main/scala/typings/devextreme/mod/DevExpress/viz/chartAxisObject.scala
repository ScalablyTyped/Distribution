package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartAxisObject extends js.Object {
  /** Gets the axis' displayed range. */
  def visualRange(): VizRange = js.native
  /** Sets the axis's displayed range. */
  def visualRange(visualRange: js.Array[Double | String | Date]): Unit = js.native
  def visualRange(visualRange: VizRange): Unit = js.native
}

