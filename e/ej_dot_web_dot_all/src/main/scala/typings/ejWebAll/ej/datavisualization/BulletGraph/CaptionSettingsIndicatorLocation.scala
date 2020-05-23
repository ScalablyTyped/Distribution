package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorLocation extends js.Object {
  /** Specifies the horizontal position of the indicator.
    * @Default {10}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the vertical position of the indicator.
    * @Default {60}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object CaptionSettingsIndicatorLocation {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): CaptionSettingsIndicatorLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorLocation]
  }
}

