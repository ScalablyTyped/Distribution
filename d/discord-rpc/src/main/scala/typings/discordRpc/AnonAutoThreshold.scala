package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoThreshold extends js.Object {
  var autoThreshold: Boolean
  var delay: Double
  var shortcut: js.Array[AnonCode]
  var threshold: Double
}

object AnonAutoThreshold {
  @scala.inline
  def apply(autoThreshold: Boolean, delay: Double, shortcut: js.Array[AnonCode], threshold: Double): AnonAutoThreshold = {
    val __obj = js.Dynamic.literal(autoThreshold = autoThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoThreshold]
  }
}

