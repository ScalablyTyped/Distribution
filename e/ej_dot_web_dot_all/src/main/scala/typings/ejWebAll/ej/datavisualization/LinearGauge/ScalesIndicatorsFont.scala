package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsFont extends js.Object {
  /** Specifies the fontFamily of font in bar indicators
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the fontStyle of font in bar indicators. See FontStyle
    * @Default {ej.datavisualization.LinearGauge.FontStyle.Bold}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the size of font in bar indicators
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ScalesIndicatorsFont {
  @scala.inline
  def apply(fontFamily: String = null, fontStyle: FontStyle | String = null, size: String = null): ScalesIndicatorsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicatorsFont]
  }
}

