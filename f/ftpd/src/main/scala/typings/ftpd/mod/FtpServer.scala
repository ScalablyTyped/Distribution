package typings.ftpd.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ftpd", "FtpServer")
@js.native
class FtpServer protected () extends EventEmitter {
  /**
    * @param host host is a string representation of the IP address clients use to connect to the FTP server.
    *             It's imperative that this actually reflects the remote IP the clients use to access the server,
    *             as this IP will be used in the establishment of PASV data connections. If this IP is not the one clients use to connect,
    *             you will see some strange behavior from the client side (hangs).
    * @param options See test.js for a simple example.
    */
  def this(host: String, options: FtpServerOptions) = this()
  /**
    * Change/Retrieve logLevel at runtime.
    */
  var debugging: LogLevel = js.native
  /**
    * Stop listening
    */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Start listening, see net.Server.listen()
    */
  def listen(port: Double): Unit = js.native
  def listen(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): Unit = js.native
  def listen(port: Double, host: js.UndefOr[scala.Nothing], backlog: Double): Unit = js.native
  def listen(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): Unit = js.native
  def listen(port: Double, host: String): Unit = js.native
  def listen(
    port: Double,
    host: String,
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): Unit = js.native
  def listen(port: Double, host: String, backlog: Double): Unit = js.native
  def listen(port: Double, host: String, backlog: Double, listeningListener: js.Function0[Unit]): Unit = js.native
}

