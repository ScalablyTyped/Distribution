package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoThreshold extends js.Object {
  var autoThreshold: Boolean
  var delay: Double
  var shortcut: js.Array[Anon_Code]
  var threshold: Double
}

object Anon_AutoThreshold {
  @scala.inline
  def apply(autoThreshold: Boolean, delay: Double, shortcut: js.Array[Anon_Code], threshold: Double): Anon_AutoThreshold = {
    val __obj = js.Dynamic.literal(autoThreshold = autoThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoThreshold]
  }
}

