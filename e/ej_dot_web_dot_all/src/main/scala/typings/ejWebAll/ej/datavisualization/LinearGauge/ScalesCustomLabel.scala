package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabel extends js.Object {
  /** Specifies the label Color in customLabels
    * @Default {null}
    */
  var color: js.UndefOr[Double] = js.undefined
  /** Specifies the font in customLabels
    * @Default {null}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
  /** Specifies the opacity in customLabels
    * @Default {0}
    */
  var opacity: js.UndefOr[String] = js.undefined
  /** Specifies the position in customLabels
    * @Default {null}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.undefined
  /** Specifies the positionType in customLabels.See CustomLabelPositionType
    * @Default {null}
    */
  var positionType: js.UndefOr[js.Any] = js.undefined
  /** Specifies the textAngle in customLabels
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.undefined
  /** Specifies the label Value in customLabels
    */
  var value: js.UndefOr[String] = js.undefined
}

object ScalesCustomLabel {
  @scala.inline
  def apply(
    color: js.UndefOr[Double] = js.undefined,
    font: ScalesCustomLabelsFont = null,
    opacity: String = null,
    position: ScalesCustomLabelsPosition = null,
    positionType: js.Any = null,
    textAngle: js.UndefOr[Double] = js.undefined,
    value: String = null
  ): ScalesCustomLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionType != null) __obj.updateDynamic("positionType")(positionType.asInstanceOf[js.Any])
    if (!js.isUndefined(textAngle)) __obj.updateDynamic("textAngle")(textAngle.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesCustomLabel]
  }
}

