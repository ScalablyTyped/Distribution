package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorFont extends js.Object {
  /** Specifies the color of the indicator's text.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the fontFamily of indicator. Indicator text render with this fontFamily.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the fontStyle of indicator. Indicator text render with this fontStyle. See FontStyle
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the fontWeight of indicator. Indicator text render with this fontWeight. See FontWeight
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Specifies the opacity of indicator text. Indicator text render with this Opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the size of indicator. Indicator text render with this size.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object CaptionSettingsIndicatorFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    size: String = null
  ): CaptionSettingsIndicatorFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorFont]
  }
}

