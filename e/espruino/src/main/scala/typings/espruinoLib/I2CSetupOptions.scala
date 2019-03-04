package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I2CSetupOptions extends js.Object {
  var bitrate: js.UndefOr[scala.Double] = js.undefined
  var scl: Pin
  var sda: Pin
}

object I2CSetupOptions {
  @scala.inline
  def apply(scl: Pin, sda: Pin, bitrate: scala.Int | scala.Double = null): I2CSetupOptions = {
    val __obj = js.Dynamic.literal(scl = scl, sda = sda)
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2CSetupOptions]
  }
}

