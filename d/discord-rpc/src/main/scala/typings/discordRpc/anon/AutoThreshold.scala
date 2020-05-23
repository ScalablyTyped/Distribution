package typings.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoThreshold extends js.Object {
  var autoThreshold: Boolean
  var delay: Double
  var shortcut: js.Array[Code]
  var threshold: Double
}

object AutoThreshold {
  @scala.inline
  def apply(autoThreshold: Boolean, delay: Double, shortcut: js.Array[Code], threshold: Double): AutoThreshold = {
    val __obj = js.Dynamic.literal(autoThreshold = autoThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoThreshold]
  }
}

