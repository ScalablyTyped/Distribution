package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  /** Specify showCustomLabelTooltip value of linear gauge
    * @Default {false}
    */
  var showCustomLabelTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify showLabelTooltip value of linear gauge
    * @Default {false}
    */
  var showLabelTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify templateID value of linear gauge
    * @Default {false}
    */
  var templateID: js.UndefOr[java.lang.String] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(
    showCustomLabelTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    showLabelTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    templateID: java.lang.String = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCustomLabelTooltip)) __obj.updateDynamic("showCustomLabelTooltip")(showCustomLabelTooltip)
    if (!js.isUndefined(showLabelTooltip)) __obj.updateDynamic("showLabelTooltip")(showLabelTooltip)
    if (templateID != null) __obj.updateDynamic("templateID")(templateID)
    __obj.asInstanceOf[Tooltip]
  }
}

