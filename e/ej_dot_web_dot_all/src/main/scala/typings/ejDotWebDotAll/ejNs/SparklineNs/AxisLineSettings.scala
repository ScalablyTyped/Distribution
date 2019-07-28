package typings.ejDotWebDotAll.ejNs.SparklineNs

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
    dashArray: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AxisLineSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLineSettings]
  }
}

