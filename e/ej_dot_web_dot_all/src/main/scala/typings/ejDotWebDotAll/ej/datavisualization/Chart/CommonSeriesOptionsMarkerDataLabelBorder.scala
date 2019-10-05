package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerDataLabelBorder extends js.Object {
  /** Border color of the data label.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the data label.
    * @Default {0.1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsMarkerDataLabelBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): CommonSeriesOptionsMarkerDataLabelBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelBorder]
  }
}

