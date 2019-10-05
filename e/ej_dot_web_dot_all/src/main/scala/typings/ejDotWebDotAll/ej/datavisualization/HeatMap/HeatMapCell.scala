package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapCell extends js.Object {
  /** Specifies whether the cell color can be visible or not.
    * @Default {true}
    */
  var showColor: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the cell content can be visible or not.
    * @Default {ej.HeatMap.CellVisibility.Visible}
    */
  var showContent: js.UndefOr[CellVisibility | String] = js.undefined
}

object HeatMapCell {
  @scala.inline
  def apply(showColor: js.UndefOr[Boolean] = js.undefined, showContent: CellVisibility | String = null): HeatMapCell = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showColor)) __obj.updateDynamic("showColor")(showColor)
    if (showContent != null) __obj.updateDynamic("showContent")(showContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapCell]
  }
}

