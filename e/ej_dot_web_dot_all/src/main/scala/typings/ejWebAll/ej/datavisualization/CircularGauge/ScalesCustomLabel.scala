package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabel extends js.Object {
  /** Color of the custom labels.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify font for custom labels
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
  /** Specify position of custom labels
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.undefined
  /** Specifies the position of the  custom labels. See
    * @Default {inner}
    */
  var positionType: js.UndefOr[CustomLabelPositionType | String] = js.undefined
  /** Specify angle for the rotation of the custom labels in degrees.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.undefined
  /** Value of the custom labels.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ScalesCustomLabel {
  @scala.inline
  def apply(
    color: String = null,
    font: ScalesCustomLabelsFont = null,
    position: ScalesCustomLabelsPosition = null,
    positionType: CustomLabelPositionType | String = null,
    textAngle: js.UndefOr[Double] = js.undefined,
    value: String = null
  ): ScalesCustomLabel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionType != null) __obj.updateDynamic("positionType")(positionType.asInstanceOf[js.Any])
    if (!js.isUndefined(textAngle)) __obj.updateDynamic("textAngle")(textAngle.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesCustomLabel]
  }
}

