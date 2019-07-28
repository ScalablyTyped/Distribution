package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabelsDistanceFromScale extends js.Object {
  /** Specifies the xDistanceFromScale of labels.
    * @Default {-10}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the yDistanceFromScale of labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesLabelsDistanceFromScale {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): ScalesLabelsDistanceFromScale = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabelsDistanceFromScale]
  }
}

