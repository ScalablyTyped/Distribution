package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

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
  def apply(x: Int | Double = null, y: Int | Double = null): CaptionSettingsIndicatorLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorLocation]
  }
}

