package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesBorder extends js.Object {
  /** Specify border color for scales of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify border width of circular gauge
    * @Default {1.5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScalesBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): ScalesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesBorder]
  }
}

