package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsLabelSettingsFont extends js.Object {
  /** Specifies the fontFamily of labels in bullet graph. Labels render with this fontFamily.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the fontStyle of labels in bullet graph. Labels render with this fontStyle. See FontStyle
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the fontWeight of labels in bullet graph. Labels render with this fontWeight. See FontWeight
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Specifies the opacity of labels in bullet graph. Labels render with this opacity
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsLabelSettingsFont {
  @scala.inline
  def apply(
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: Int | Double = null
  ): QuantitativeScaleSettingsLabelSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettingsFont]
  }
}

