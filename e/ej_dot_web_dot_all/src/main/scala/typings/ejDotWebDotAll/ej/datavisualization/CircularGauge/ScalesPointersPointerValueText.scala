package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

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
    angle: Int | Double = null,
    autoAngle: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    distance: Int | Double = null,
    font: ScalesPointersPointerValueTextFont = null,
    opacity: Int | Double = null,
    showValue: js.UndefOr[Boolean] = js.undefined
  ): ScalesPointersPointerValueText = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAngle)) __obj.updateDynamic("autoAngle")(autoAngle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPointersPointerValueText]
  }
}

