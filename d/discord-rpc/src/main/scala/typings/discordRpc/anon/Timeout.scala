package typings.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends js.Object {
  var force: Boolean
  var timeout: Double
}

object Timeout {
  @scala.inline
  def apply(force: Boolean, timeout: Double): Timeout = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

