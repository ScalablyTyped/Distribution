package typings
package findDashProcessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmd extends js.Object {
  var cmd: java.lang.String
  var gid: java.lang.String
  var name: java.lang.String
  var pid: java.lang.String
  var ppid: java.lang.String
  var uid: java.lang.String
}

object Anon_Cmd {
  @scala.inline
  def apply(
    cmd: java.lang.String,
    gid: java.lang.String,
    name: java.lang.String,
    pid: java.lang.String,
    ppid: java.lang.String,
    uid: java.lang.String
  ): Anon_Cmd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmd")(cmd)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("ppid")(ppid)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Anon_Cmd]
  }
}

