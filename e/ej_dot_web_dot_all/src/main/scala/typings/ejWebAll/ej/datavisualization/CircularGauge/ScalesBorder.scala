package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesBorder extends js.Object {
  /** Specify border color for scales of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify border width of circular gauge
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): ScalesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesBorder]
  }
}

