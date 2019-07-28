package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsPosition extends js.Object {
  /** Set the horizontal location for the text, where it needs to be placed within the gauge.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Set the vertical location for the text, where it needs to be placed within the gauge.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ItemsPosition {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): ItemsPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsPosition]
  }
}

