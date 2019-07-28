package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceTimeout extends js.Object {
  var force: Boolean
  var timeout: Double
}

object Anon_ForceTimeout {
  @scala.inline
  def apply(force: Boolean, timeout: Double): Anon_ForceTimeout = {
    val __obj = js.Dynamic.literal(force = force, timeout = timeout)
  
    __obj.asInstanceOf[Anon_ForceTimeout]
  }
}

