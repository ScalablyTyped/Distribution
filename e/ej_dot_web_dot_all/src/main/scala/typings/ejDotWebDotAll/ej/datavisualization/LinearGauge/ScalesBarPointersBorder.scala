package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesBarPointersBorder extends js.Object {
  /** Specifies the border Color of bar pointer
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the border Width of bar pointer
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesBarPointersBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): ScalesBarPointersBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesBarPointersBorder]
  }
}

