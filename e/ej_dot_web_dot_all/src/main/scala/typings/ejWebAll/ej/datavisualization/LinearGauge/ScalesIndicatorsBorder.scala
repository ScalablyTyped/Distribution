package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsBorder extends js.Object {
  /** Specifies the border Color in bar indicators
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the border Width in bar indicators
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesIndicatorsBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): ScalesIndicatorsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicatorsBorder]
  }
}

