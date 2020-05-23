package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisLineSettings extends js.Object {
  /** Color of the axis line.
    * @Default {'#111111'}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Dash array of the axis line.
    * @Default {1}
    */
  var dashArray: js.UndefOr[Double] = js.undefined
  /** Controls the visibility of the axis.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the axis line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AxisLineSettings {
  @scala.inline
  def apply(
    color: String = null,
    dashArray: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AxisLineSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(dashArray)) __obj.updateDynamic("dashArray")(dashArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLineSettings]
  }
}

