package typings.findProcess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cmd extends js.Object {
  var cmd: String
  var gid: js.UndefOr[Double] = js.undefined
  var name: String
  var pid: Double
  var ppid: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object Cmd {
  @scala.inline
  def apply(
    cmd: String,
    name: String,
    pid: Double,
    gid: js.UndefOr[Double] = js.undefined,
    ppid: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined
  ): Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ppid)) __obj.updateDynamic("ppid")(ppid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmd]
  }
}

