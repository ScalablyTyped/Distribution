package typings
package ftpdLib.ftpdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ftpd", "FtpConnection")
@js.native
class FtpConnection ()
  extends nodeLib.eventsMod.EventEmitter {
  var cwd: java.lang.String = js.native
  var dataSocket: nodeLib.netMod.Socket = js.native
  var hasQuit: scala.Boolean = js.native
   // the actual data socket
  var mode: java.lang.String = js.native
  var pasv: nodeLib.netMod.Server = js.native
  var pbszReceived: scala.Boolean = js.native
  var root: java.lang.String = js.native
  // State for handling TLS upgrades.
  var secure: scala.Boolean = js.native
  var server: FtpServer = js.native
  var socket: nodeLib.netMod.Socket = js.native
  var username: java.lang.String = js.native
}

