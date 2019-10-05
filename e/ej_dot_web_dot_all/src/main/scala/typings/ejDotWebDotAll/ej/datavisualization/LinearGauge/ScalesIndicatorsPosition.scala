package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsPosition extends js.Object {
  /** Specifies the x position in bar indicators
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the y position in bar indicators
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesIndicatorsPosition {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): ScalesIndicatorsPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicatorsPosition]
  }
}

