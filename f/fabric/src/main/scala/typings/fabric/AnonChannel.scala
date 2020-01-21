package typings.fabric

import typings.fabric.fabricImplMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  /**
  			 * Rgb channel (0, 1, 2 or 3)
  			 * @default 0
  			 */
  var channel: Double
  /** Mask image object */
  var mask: js.UndefOr[Image] = js.undefined
}

object AnonChannel {
  @scala.inline
  def apply(channel: Double, mask: Image = null): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

