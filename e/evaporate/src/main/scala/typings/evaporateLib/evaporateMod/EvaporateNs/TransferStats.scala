package typings
package evaporateLib.evaporateMod.EvaporateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferStats extends js.Object {
  var fileSize: scala.Double
  var loaded: scala.Double
  var readableSpeed: java.lang.String
  var remainingSize: scala.Double
  var secondsLeft: scala.Double
  var speed: scala.Double
  var totalUploaded: scala.Double
}

object TransferStats {
  @scala.inline
  def apply(
    fileSize: scala.Double,
    loaded: scala.Double,
    readableSpeed: java.lang.String,
    remainingSize: scala.Double,
    secondsLeft: scala.Double,
    speed: scala.Double,
    totalUploaded: scala.Double
  ): TransferStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("readableSpeed")(readableSpeed)
    __obj.updateDynamic("remainingSize")(remainingSize)
    __obj.updateDynamic("secondsLeft")(secondsLeft)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("totalUploaded")(totalUploaded)
    __obj.asInstanceOf[TransferStats]
  }
}

