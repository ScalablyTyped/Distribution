package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisMajorGridLines extends js.Object {
  /** Color of the major grid lines.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Pattern of dashes and gaps used to stroke the major grid lines.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Opacity of major grid lines.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Show/hides the major grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the major grid lines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PrimaryYAxisMajorGridLines {
  @scala.inline
  def apply(
    color: String = null,
    dashArray: String = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): PrimaryYAxisMajorGridLines = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisMajorGridLines]
  }
}

