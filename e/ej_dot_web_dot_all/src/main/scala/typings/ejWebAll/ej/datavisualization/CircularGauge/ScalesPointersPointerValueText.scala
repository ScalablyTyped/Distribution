package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPointersPointerValueText extends js.Object {
  /** Specify pointer text angle of circular gauge.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Specify pointer text auto angle of circular gauge.
    * @Default {false}
    */
  var autoAngle: js.UndefOr[Boolean] = js.undefined
  /** Specify pointer value text color of circular gauge.
    * @Default {#8c8c8c}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify pointer value text distance from pointer of circular gauge.
    * @Default {20}
    */
  var distance: js.UndefOr[Double] = js.undefined
  /** Specify pointer value text font option of circular gauge.
    * @Default {object}
    */
  var font: js.UndefOr[ScalesPointersPointerValueTextFont] = js.undefined
  /** Specify pointer value text opacity of circular gauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** enable pointer value text visibility of circular gauge.
    * @Default {false}
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
}

object ScalesPointersPointerValueText {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    autoAngle: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    distance: js.UndefOr[Double] = js.undefined,
    font: ScalesPointersPointerValueTextFont = null,
    opacity: js.UndefOr[Double] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined
  ): ScalesPointersPointerValueText = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAngle)) __obj.updateDynamic("autoAngle")(autoAngle.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPointersPointerValueText]
  }
}

