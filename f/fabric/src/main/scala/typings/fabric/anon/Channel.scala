package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /**
    * Rgb channel (0, 1, 2 or 3)
    * @default 0
    */
  var channel: Double
  /** Mask image object */
  var mask: js.UndefOr[typings.fabric.fabricImplMod.Image] = js.undefined
}

object Channel {
  @scala.inline
  def apply(channel: Double, mask: typings.fabric.fabricImplMod.Image = null): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

