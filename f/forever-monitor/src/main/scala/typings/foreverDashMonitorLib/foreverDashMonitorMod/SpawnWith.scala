package typings
package foreverDashMonitorLib.foreverDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnWith extends js.Object {
  var customFds: js.Array[scala.Double]
  var gid: scala.Double
  var setsid: scala.Boolean
  var uid: scala.Double
}

object SpawnWith {
  @scala.inline
  def apply(customFds: js.Array[scala.Double], gid: scala.Double, setsid: scala.Boolean, uid: scala.Double): SpawnWith = {
    val __obj = js.Dynamic.literal(customFds = customFds, gid = gid, setsid = setsid, uid = uid)
  
    __obj.asInstanceOf[SpawnWith]
  }
}

