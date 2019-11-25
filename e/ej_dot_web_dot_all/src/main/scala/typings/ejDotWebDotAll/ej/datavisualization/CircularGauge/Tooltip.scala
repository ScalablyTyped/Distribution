package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  /** enable showCustomLabelTooltip of circular gauge
    * @Default {false}
    */
  var showCustomLabelTooltip: js.UndefOr[Boolean] = js.undefined
  /** enable showLabelTooltip of circular gauge
    * @Default {false}
    */
  var showLabelTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specify tooltip templateID of circular gauge
    * @Default {false}
    */
  var templateID: js.UndefOr[String] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(
    showCustomLabelTooltip: js.UndefOr[Boolean] = js.undefined,
    showLabelTooltip: js.UndefOr[Boolean] = js.undefined,
    templateID: String = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCustomLabelTooltip)) __obj.updateDynamic("showCustomLabelTooltip")(showCustomLabelTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabelTooltip)) __obj.updateDynamic("showLabelTooltip")(showLabelTooltip.asInstanceOf[js.Any])
    if (templateID != null) __obj.updateDynamic("templateID")(templateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

