package typings.findDashProcess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmd extends js.Object {
  var cmd: String
  var gid: String
  var name: String
  var pid: String
  var ppid: String
  var uid: String
}

object Anon_Cmd {
  @scala.inline
  def apply(cmd: String, gid: String, name: String, pid: String, ppid: String, uid: String): Anon_Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd, gid = gid, name = name, pid = pid, ppid = ppid, uid = uid)
  
    __obj.asInstanceOf[Anon_Cmd]
  }
}

