package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I2CSetupOptions extends js.Object {
  var bitrate: js.UndefOr[Double] = js.undefined
  var scl: Pin
  var sda: Pin
}

object I2CSetupOptions {
  @scala.inline
  def apply(scl: Pin, sda: Pin, bitrate: Int | Double = null): I2CSetupOptions = {
    val __obj = js.Dynamic.literal(scl = scl.asInstanceOf[js.Any], sda = sda.asInstanceOf[js.Any])
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2CSetupOptions]
  }
}

