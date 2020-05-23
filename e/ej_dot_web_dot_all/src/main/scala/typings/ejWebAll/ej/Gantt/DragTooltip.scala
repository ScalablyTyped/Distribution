package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragTooltip extends js.Object {
  /** Specifies option to enable/disable tooltip while drag and drop a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the data source fields to be displayed in the drag tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the custom template for drag tooltip.
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
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.get.asInstanceOf[js.Any])
    if (tooltipItems != null) __obj.updateDynamic("tooltipItems")(tooltipItems.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragTooltip]
  }
}

