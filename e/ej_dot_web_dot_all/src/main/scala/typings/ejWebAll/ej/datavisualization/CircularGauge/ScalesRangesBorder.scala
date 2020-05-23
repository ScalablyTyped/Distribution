package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesRangesBorder extends js.Object {
  /** Specify border color for ranges of circular gauge
    * @Default {#32b3c6}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specify border width for ranges of circular gauge
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesRangesBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): ScalesRangesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesRangesBorder]
  }
}

