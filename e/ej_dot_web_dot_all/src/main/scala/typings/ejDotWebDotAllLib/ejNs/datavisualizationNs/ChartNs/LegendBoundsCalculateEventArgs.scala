package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendBoundsCalculateEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** legendBoundsHeight - Height of the legend    legendBoundsWidth - Width of the legend.    legendBoundsRows - Number of rows to display the legend items
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LegendBoundsCalculateEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): LegendBoundsCalculateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LegendBoundsCalculateEventArgs]
  }
}

