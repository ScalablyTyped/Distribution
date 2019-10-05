package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesMarkerPointersBorder extends js.Object {
  /** Specifies the border color of marker pointer
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the border of marker pointer
    * @Default {number}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesMarkerPointersBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): ScalesMarkerPointersBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesMarkerPointersBorder]
  }
}

