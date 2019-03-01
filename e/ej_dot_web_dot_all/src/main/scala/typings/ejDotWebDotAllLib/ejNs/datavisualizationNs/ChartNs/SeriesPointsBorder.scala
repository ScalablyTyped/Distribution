package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsBorder extends js.Object {
  /** Border color of the point.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Border width of the point.
    * @Default {null}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SeriesPointsBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): SeriesPointsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsBorder]
  }
}

