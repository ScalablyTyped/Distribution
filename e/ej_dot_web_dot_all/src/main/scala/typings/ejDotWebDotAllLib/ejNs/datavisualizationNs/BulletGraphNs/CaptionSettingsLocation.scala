package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsLocation extends js.Object {
  /** Specifies the position in horizontal direction
    * @Default {17}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position in horizontal direction
    * @Default {30}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object CaptionSettingsLocation {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): CaptionSettingsLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsLocation]
  }
}

