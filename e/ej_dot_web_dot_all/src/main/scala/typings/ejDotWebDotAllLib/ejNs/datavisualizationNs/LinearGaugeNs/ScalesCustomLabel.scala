package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabel extends js.Object {
  /** Specifies the label Color in customLabels
    * @Default {null}
    */
  var color: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the font in customLabels
    * @Default {null}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
  /** Specifies the opacity in customLabels
    * @Default {0}
    */
  var opacity: js.UndefOr[java.lang.String] = js.undefined
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
  var textAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label Value in customLabels
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ScalesCustomLabel {
  @scala.inline
  def apply(
    color: scala.Int | scala.Double = null,
    font: ScalesCustomLabelsFont = null,
    opacity: java.lang.String = null,
    position: ScalesCustomLabelsPosition = null,
    positionType: js.Any = null,
    textAngle: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): ScalesCustomLabel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (position != null) __obj.updateDynamic("position")(position)
    if (positionType != null) __obj.updateDynamic("positionType")(positionType)
    if (textAngle != null) __obj.updateDynamic("textAngle")(textAngle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ScalesCustomLabel]
  }
}

