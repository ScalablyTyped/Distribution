package typings.foreverDashMonitor.foreverDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnWith extends js.Object {
  var customFds: js.Array[Double]
  var gid: Double
  var setsid: Boolean
  var uid: Double
}

object SpawnWith {
  @scala.inline
  def apply(customFds: js.Array[Double], gid: Double, setsid: Boolean, uid: Double): SpawnWith = {
    val __obj = js.Dynamic.literal(customFds = customFds, gid = gid, setsid = setsid, uid = uid)
  
    __obj.asInstanceOf[SpawnWith]
  }
}

