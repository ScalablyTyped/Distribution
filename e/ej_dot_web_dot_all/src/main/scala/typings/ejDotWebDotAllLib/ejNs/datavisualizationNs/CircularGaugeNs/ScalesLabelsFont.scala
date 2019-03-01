package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabelsFont extends js.Object {
  /** Specify font fontFamily for labels of circular gauge
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Specify font Style for labels of circular gauge
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Specify font size for labels of circular gauge
    * @Default {11px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object ScalesLabelsFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: java.lang.String = null,
    size: java.lang.String = null
  ): ScalesLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ScalesLabelsFont]
  }
}

