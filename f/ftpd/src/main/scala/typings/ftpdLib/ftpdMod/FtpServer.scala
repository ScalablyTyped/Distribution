package typings
package ftpdLib.ftpdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ftpd", "FtpServer")
@js.native
class FtpServer protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * @param host host is a string representation of the IP address clients use to connect to the FTP server.
    *             It's imperative that this actually reflects the remote IP the clients use to access the server,
    *             as this IP will be used in the establishment of PASV data connections. If this IP is not the one clients use to connect,
    *             you will see some strange behavior from the client side (hangs).
    * @param options See test.js for a simple example.
    */
  def this(host: java.lang.String, options: FtpServerOptions) = this()
  /**
    * Change/Retrieve logLevel at runtime.
    */
  var debugging: LogLevel = js.native
  /**
    * Stop listening
    */
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Start listening, see net.Server.listen()
    */
  def listen(port: scala.Double): scala.Unit = js.native
  def listen(port: scala.Double, host: java.lang.String): scala.Unit = js.native
  def listen(port: scala.Double, host: java.lang.String, backlog: scala.Double): scala.Unit = js.native
  def listen(
    port: scala.Double,
    host: java.lang.String,
    backlog: scala.Double,
    listeningListener: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

