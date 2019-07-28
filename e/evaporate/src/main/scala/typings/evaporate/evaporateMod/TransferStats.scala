package typings.evaporate.evaporateMod

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
    val __obj = js.Dynamic.literal(fileSize = fileSize, loaded = loaded, readableSpeed = readableSpeed, remainingSize = remainingSize, secondsLeft = secondsLeft, speed = speed, totalUploaded = totalUploaded)
  
    __obj.asInstanceOf[TransferStats]
  }
}

