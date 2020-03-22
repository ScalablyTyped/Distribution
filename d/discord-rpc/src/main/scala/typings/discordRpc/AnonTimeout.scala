package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends js.Object {
  var force: Boolean
  var timeout: Double
}

object AnonTimeout {
  @scala.inline
  def apply(force: Boolean, timeout: Double): AnonTimeout = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTimeout]
  }
}

