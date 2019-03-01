package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsLabelSettingsFont extends js.Object {
  /** Specifies the fontFamily of labels in bullet graph. Labels render with this fontFamily.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the fontStyle of labels in bullet graph. Labels render with this fontStyle. See FontStyle
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Specifies the fontWeight of labels in bullet graph. Labels render with this fontWeight. See FontWeight
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[FontWeight | java.lang.String] = js.undefined
  /** Specifies the opacity of labels in bullet graph. Labels render with this opacity
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object QuantitativeScaleSettingsLabelSettingsFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    fontWeight: FontWeight | java.lang.String = null,
    opacity: scala.Int | scala.Double = null
  ): QuantitativeScaleSettingsLabelSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettingsFont]
  }
}

