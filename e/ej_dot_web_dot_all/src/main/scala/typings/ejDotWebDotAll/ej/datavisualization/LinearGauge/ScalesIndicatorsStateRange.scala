package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsStateRange extends js.Object {
  /** Specifies the backgroundColor in bar indicators state ranges
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies the borderColor in bar indicators state ranges
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Specifies the endValue in bar indicators state ranges
    * @Default {60}
    */
  var endValue: js.UndefOr[Double] = js.undefined
  /** Specifies the startValue in bar indicators state ranges
    * @Default {50}
    */
  var startValue: js.UndefOr[Double] = js.undefined
  /** Specifies the text in bar indicators state ranges
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the textColor in bar indicators state ranges
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
    startValue: Int | Double = null,
    text: String = null,
    textColor: String = null
  ): ScalesIndicatorsStateRange = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[ScalesIndicatorsStateRange]
  }
}

