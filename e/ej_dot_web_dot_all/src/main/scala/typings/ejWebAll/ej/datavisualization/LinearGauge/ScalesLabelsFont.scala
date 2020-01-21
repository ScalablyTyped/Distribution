package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabelsFont extends js.Object {
  /** Specifies the fontFamily of font.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the fontStyle of font.See FontStyle
    * @Default {ej.datavisualization.LinearGauge.FontStyle.Bold}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the size of font.
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ScalesLabelsFont {
  @scala.inline
  def apply(fontFamily: String = null, fontStyle: FontStyle | String = null, size: String = null): ScalesLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabelsFont]
  }
}

