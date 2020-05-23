package typings.ftp.mod

import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * How long (in milliseconds) to wait for the control connection to be established. Default: 10000
    */
  var connTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Debug function to invoke to enable debug logging.
    */
  var debug: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  /**
    * The hostname or IP address of the FTP server. Default: 'localhost'
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * How often (in milliseconds) to send a 'dummy' (NOOP) command to keep the connection alive. Default: 10000
    */
  var keepalive: js.UndefOr[Double] = js.undefined
  /**
    * Password for authentication. Default: 'anonymous@'
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * How long (in milliseconds) to wait for a PASV data connection to be established. Default: 10000
    */
  var pasvTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The port of the FTP server. Default: 21
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Set to true for both control and data connection encryption, 'control' for control connection encryption only, or 'implicit' for
    * implicitly encrypted control connection (this mode is deprecated in modern times, but usually uses port 990) Default: false
    */
  var secure: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Additional options to be passed to tls.connect(). Default: (none)
    */
  var secureOptions: js.UndefOr[ConnectionOptions] = js.undefined
  /**
    * Username for authentication. Default: 'anonymous'
    */
  var user: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    connTimeout: js.UndefOr[Double] = js.undefined,
    debug: /* message */ String => Unit = null,
    host: String = null,
    keepalive: js.UndefOr[Double] = js.undefined,
    password: String = null,
    pasvTimeout: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    secure: String | Boolean = null,
    secureOptions: ConnectionOptions = null,
    user: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connTimeout)) __obj.updateDynamic("connTimeout")(connTimeout.get.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(pasvTimeout)) __obj.updateDynamic("pasvTimeout")(pasvTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

