package typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsFont extends js.Object {
  /** Set the font family value
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Set the font style for the font
    * @Default {italic}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Set the font size value
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ItemsFont {
  @scala.inline
  def apply(fontFamily: String = null, fontStyle: FontStyle | String = null, size: String = null): ItemsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ItemsFont]
  }
}

