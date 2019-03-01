package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentBorder extends js.Object {
  /** Segment Border color of the sunburst.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the Sunburst segment border.
    * @Default {2}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SegmentBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): SegmentBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentBorder]
  }
}

