package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsSubTitleLocation extends js.Object {
  /** Specifies the horizontal position of the subtitle.
    * @Default {10}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the vertical position of the subtitle.
    * @Default {45}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object CaptionSettingsSubTitleLocation {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): CaptionSettingsSubTitleLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsSubTitleLocation]
  }
}

