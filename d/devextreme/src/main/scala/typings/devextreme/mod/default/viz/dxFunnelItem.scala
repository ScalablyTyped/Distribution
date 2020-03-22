package typings.devextreme.mod.default.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz.dxFunnelItem")
@js.native
class dxFunnelItem ()
  extends typings.devextreme.mod.DevExpress.viz.dxFunnelItem {
  /** The item's argument. */
  /* CompleteClass */
  override var argument: String | Date | Double = js.native
  /** The item's original data object. */
  /* CompleteClass */
  override var data: js.Any = js.native
  /** The item's calculated percentage value. */
  /* CompleteClass */
  override var percent: Double = js.native
  /** The item's value. */
  /* CompleteClass */
  override var value: Double = js.native
  /** Gets the funnel item's color specified in the data source or palette. */
  /* CompleteClass */
  override def getColor(): String = js.native
  /** Changes the funnel item's hover state. */
  /* CompleteClass */
  override def hover(state: Boolean): Unit = js.native
  /** Indicates whether the funnel item is in the hover state. */
  /* CompleteClass */
  override def isHovered(): Boolean = js.native
  /** Indicates whether the funnel item is selected. */
  /* CompleteClass */
  override def isSelected(): Boolean = js.native
  /** Selects or cancels the funnel item's selection. */
  /* CompleteClass */
  override def select(state: Boolean): Unit = js.native
  /** Shows the funnel item's tooltip. */
  /* CompleteClass */
  override def showTooltip(): Unit = js.native
}

