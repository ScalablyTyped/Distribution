package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceTimeout extends js.Object {
  var force: scala.Boolean
  var timeout: scala.Double
}

object Anon_ForceTimeout {
  @scala.inline
  def apply(force: scala.Boolean, timeout: scala.Double): Anon_ForceTimeout = {
    val __obj = js.Dynamic.literal(force = force, timeout = timeout)
  
    __obj.asInstanceOf[Anon_ForceTimeout]
  }
}

