package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabelsFont extends js.Object {
  /** Specifies the fontFamily in customLabels
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the fontStyle in customLabels. See
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Specifies the font size in customLabels
    * @Default {11px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object ScalesCustomLabelsFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    size: java.lang.String = null
  ): ScalesCustomLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ScalesCustomLabelsFont]
  }
}

