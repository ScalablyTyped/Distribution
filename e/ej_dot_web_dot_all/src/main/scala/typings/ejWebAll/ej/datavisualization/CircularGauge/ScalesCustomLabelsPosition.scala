package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabelsPosition extends js.Object {
  /** Specify x-axis position of label
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specify y-axis  position of labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesCustomLabelsPosition {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): ScalesCustomLabelsPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesCustomLabelsPosition]
  }
}

