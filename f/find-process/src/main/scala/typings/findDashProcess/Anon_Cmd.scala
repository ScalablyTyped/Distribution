package typings.findDashProcess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmd extends js.Object {
  var cmd: String
  var gid: js.UndefOr[Double] = js.undefined
  var name: String
  var pid: Double
  var ppid: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object Anon_Cmd {
  @scala.inline
  def apply(
    cmd: String,
    name: String,
    pid: Double,
    gid: Int | Double = null,
    ppid: Int | Double = null,
    uid: Int | Double = null
  ): Anon_Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd, name = name, pid = pid)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (ppid != null) __obj.updateDynamic("ppid")(ppid.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cmd]
  }
}

