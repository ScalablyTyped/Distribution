package typings.ejWebAll.ej.datavisualization.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentBorder extends js.Object {
  /** Segment Border color of the sunburst.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Width of the Sunburst segment border.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SegmentBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): SegmentBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentBorder]
  }
}

