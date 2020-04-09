package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartAxisObject extends js.Object {
  /** @name chartAxisObject.visualRange() */
  def visualRange(): VizRange = js.native
  /** @name chartAxisObject.visualRange(visualRange) */
  def visualRange(visualRange: js.Array[Double | String | Date]): Unit = js.native
  def visualRange(visualRange: VizRange): Unit = js.native
}

