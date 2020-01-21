package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragTooltip extends js.Object {
  /** Specifies whether to show tooltip while dragging a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Option to add field names whose corresponding values in the dragged row needs to be shown in the preview tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Custom template for that tooltip that is shown while dragging a row.
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
}

object DragTooltip {
  @scala.inline
  def apply(
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    tooltipItems: js.Array[_] = null,
    tooltipTemplate: String = null
  ): DragTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (tooltipItems != null) __obj.updateDynamic("tooltipItems")(tooltipItems.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragTooltip]
  }
}

