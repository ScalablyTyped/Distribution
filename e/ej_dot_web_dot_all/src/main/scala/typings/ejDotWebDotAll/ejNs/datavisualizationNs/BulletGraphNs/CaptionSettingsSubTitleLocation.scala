package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsSubTitleLocation extends js.Object {
  /** Specifies the horizontal position of the subtitle.
    * @Default {10}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the vertical position of the subtitle.
    * @Default {45}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object CaptionSettingsSubTitleLocation {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): CaptionSettingsSubTitleLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsSubTitleLocation]
  }
}

