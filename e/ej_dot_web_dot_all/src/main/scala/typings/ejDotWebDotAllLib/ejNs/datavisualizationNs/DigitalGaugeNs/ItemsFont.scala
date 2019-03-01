package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsFont extends js.Object {
  /** Set the font family value
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Set the font style for the font
    * @Default {italic}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Set the font size value
    * @Default {11px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object ItemsFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    size: java.lang.String = null
  ): ItemsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ItemsFont]
  }
}

