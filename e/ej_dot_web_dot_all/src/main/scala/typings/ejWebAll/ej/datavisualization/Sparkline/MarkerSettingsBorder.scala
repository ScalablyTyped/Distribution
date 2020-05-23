package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSettingsBorder extends js.Object {
  /** Border color of the marker shape.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Controls the opacity of the marker border.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Border width of the marker shape.
    * @Default {null}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object MarkerSettingsBorder {
  @scala.inline
  def apply(
    color: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): MarkerSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSettingsBorder]
  }
}

