package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseLabelObject extends js.Object {
  /** Gets the parameters of the label's minimum bounding rectangle (MBR). */
  def getBoundingRect(): js.Any = js.native
  /** Hides the point label. */
  def hide(): Unit = js.native
  /** Hides the point label and keeps it invisible until the show() method is called. */
  def hide(holdInvisible: Boolean): Unit = js.native
  /** Checks whether the point label is visible. */
  def isVisible(): Boolean = js.native
  /** Shows the point label. */
  def show(): Unit = js.native
  /** Shows the point label and keeps it visible until the hide() method is called. */
  def show(holdVisible: Boolean): Unit = js.native
}

