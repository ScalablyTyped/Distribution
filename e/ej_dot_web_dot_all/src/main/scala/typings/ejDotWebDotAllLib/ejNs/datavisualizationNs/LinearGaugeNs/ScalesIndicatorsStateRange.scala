package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsStateRange extends js.Object {
  /** Specifies the backgroundColor in bar indicators state ranges
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the borderColor in bar indicators state ranges
    * @Default {null}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the endValue in bar indicators state ranges
    * @Default {60}
    */
  var endValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the startValue in bar indicators state ranges
    * @Default {50}
    */
  var startValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the text in bar indicators state ranges
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the textColor in bar indicators state ranges
    * @Default {null}
    */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object ScalesIndicatorsStateRange {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    endValue: scala.Int | scala.Double = null,
    startValue: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    textColor: java.lang.String = null
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

