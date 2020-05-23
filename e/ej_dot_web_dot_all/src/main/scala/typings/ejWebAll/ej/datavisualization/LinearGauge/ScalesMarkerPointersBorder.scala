package typings.ejWebAll.ej.datavisualization.LinearGauge

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
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): ScalesMarkerPointersBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesMarkerPointersBorder]
  }
}

