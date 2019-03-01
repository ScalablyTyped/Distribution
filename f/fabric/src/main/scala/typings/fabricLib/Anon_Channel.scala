package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  /**
  			 * Rgb channel (0, 1, 2 or 3)
  			 * @default 0
  			 */
  var channel: scala.Double
  /** Mask image object */
  var mask: js.UndefOr[fabricLib.fabricDashImplMod.Image] = js.undefined
}

object Anon_Channel {
  @scala.inline
  def apply(channel: scala.Double, mask: fabricLib.fabricDashImplMod.Image = null): Anon_Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[Anon_Channel]
  }
}

