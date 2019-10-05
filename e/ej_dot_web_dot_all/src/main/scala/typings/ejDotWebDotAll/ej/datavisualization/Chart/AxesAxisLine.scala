package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesAxisLine extends js.Object {
  /** Color of axis line.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Pattern of dashes and gaps to be applied to the axis line.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
    * @Default {null}
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** Show/hides the axis line.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of axis line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AxesAxisLine {
  @scala.inline
  def apply(
    color: String = null,
    dashArray: String = null,
    offset: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AxesAxisLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesAxisLine]
  }
}

