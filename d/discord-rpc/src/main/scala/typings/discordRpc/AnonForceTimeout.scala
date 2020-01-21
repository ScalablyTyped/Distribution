package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceTimeout extends js.Object {
  var force: Boolean
  var timeout: Double
}

object AnonForceTimeout {
  @scala.inline
  def apply(force: Boolean, timeout: Double): AnonForceTimeout = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForceTimeout]
  }
}

