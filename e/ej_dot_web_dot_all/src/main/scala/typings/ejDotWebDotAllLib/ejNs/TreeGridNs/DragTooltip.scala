package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragTooltip extends js.Object {
  /** Specifies whether to show tooltip while dragging a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Option to add field names whose corresponding values in the dragged row needs to be shown in the preview tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Custom template for that tooltip that is shown while dragging a row.
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object DragTooltip {
  @scala.inline
  def apply(
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipItems: js.Array[_] = null,
    tooltipTemplate: java.lang.String = null
  ): DragTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (tooltipItems != null) __obj.updateDynamic("tooltipItems")(tooltipItems)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    __obj.asInstanceOf[DragTooltip]
  }
}

