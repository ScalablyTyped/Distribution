package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsEmptyPointSettingsStyleBorder extends js.Object {
  /** Border color of the empty point.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the empty point.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsEmptyPointSettingsStyleBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): CommonSeriesOptionsEmptyPointSettingsStyleBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettingsStyleBorder]
  }
}

