package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesMajorGridLines extends js.Object {
  /** Color of the major grid line.
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

object AxesMajorGridLines {
  @scala.inline
  def apply(
    color: String = null,
    dashArray: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AxesMajorGridLines = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesMajorGridLines]
  }
}

