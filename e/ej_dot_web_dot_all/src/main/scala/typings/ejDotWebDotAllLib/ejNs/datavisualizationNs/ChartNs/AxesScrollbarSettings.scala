package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesScrollbarSettings extends js.Object {
  /** Controls whether scrollbar has to be responsive in the chart.
    * @Default {false}
    */
  var canResize: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum number of points to be displayed in the scrollbar.
    * @Default {null}
    */
  var pointsLength: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the range for the scrollbar in the axis.
    */
  var range: js.UndefOr[AxesScrollbarSettingsRange] = js.undefined
  /** Specifies to enable or disable the scrollbar.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object AxesScrollbarSettings {
  @scala.inline
  def apply(
    canResize: js.UndefOr[scala.Boolean] = js.undefined,
    pointsLength: scala.Int | scala.Double = null,
    range: AxesScrollbarSettingsRange = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): AxesScrollbarSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canResize)) __obj.updateDynamic("canResize")(canResize)
    if (pointsLength != null) __obj.updateDynamic("pointsLength")(pointsLength.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AxesScrollbarSettings]
  }
}

