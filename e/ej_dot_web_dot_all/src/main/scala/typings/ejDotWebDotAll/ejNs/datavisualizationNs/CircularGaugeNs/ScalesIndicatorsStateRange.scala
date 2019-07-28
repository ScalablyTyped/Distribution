package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsStateRange extends js.Object {
  /** Specify backgroundColor for indicator of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specify borderColor for indicator of circular gauge
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Specify end value for each specified state of circular gauge
    * @Default {0}
    */
  var endValue: js.UndefOr[Double] = js.undefined
  /** Specify value of the font as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
    * @Default {null}
    */
  var font: js.UndefOr[js.Any] = js.undefined
  /** Specify start value for each specified state of circular gauge
    * @Default {0}
    */
  var startValue: js.UndefOr[Double] = js.undefined
  /** Specify value of the text as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specify value of the textColor as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.undefined
}

object ScalesIndicatorsStateRange {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    endValue: Int | Double = null,
    font: js.Any = null,
    startValue: Int | Double = null,
    text: String = null,
    textColor: String = null
  ): ScalesIndicatorsStateRange = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[ScalesIndicatorsStateRange]
  }
}

