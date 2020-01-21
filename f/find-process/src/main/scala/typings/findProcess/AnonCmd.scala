package typings.findProcess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCmd extends js.Object {
  var cmd: String
  var gid: js.UndefOr[Double] = js.undefined
  var name: String
  var pid: Double
  var ppid: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object AnonCmd {
  @scala.inline
  def apply(
    cmd: String,
    name: String,
    pid: Double,
    gid: Int | Double = null,
    ppid: Int | Double = null,
    uid: Int | Double = null
  ): AnonCmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (ppid != null) __obj.updateDynamic("ppid")(ppid.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCmd]
  }
}

