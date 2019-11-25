package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabelsFont extends js.Object {
  /** Specifies the fontFamily in customLabels
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the fontStyle in customLabels. See
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the font size in customLabels
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ScalesCustomLabelsFont {
  @scala.inline
  def apply(fontFamily: String = null, fontStyle: FontStyle | String = null, size: String = null): ScalesCustomLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesCustomLabelsFont]
  }
}

