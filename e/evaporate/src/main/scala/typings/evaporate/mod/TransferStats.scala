package typings.evaporate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferStats extends js.Object {
  var fileSize: Double
  var loaded: Double
  var readableSpeed: String
  var remainingSize: Double
  var secondsLeft: Double
  var speed: Double
  var totalUploaded: Double
}

object TransferStats {
  @scala.inline
  def apply(
    fileSize: Double,
    loaded: Double,
    readableSpeed: String,
    remainingSize: Double,
    secondsLeft: Double,
    speed: Double,
    totalUploaded: Double
  ): TransferStats = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readableSpeed = readableSpeed.asInstanceOf[js.Any], remainingSize = remainingSize.asInstanceOf[js.Any], secondsLeft = secondsLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], totalUploaded = totalUploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferStats]
  }
}

