package typings
package ftpLib.ftpMod.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * How long (in milliseconds) to wait for the control connection to be established. Default: 10000
    */
  var connTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The hostname or IP address of the FTP server. Default: 'localhost'
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How often (in milliseconds) to send a 'dummy' (NOOP) command to keep the connection alive. Default: 10000
    */
  var keepalive: js.UndefOr[scala.Double] = js.undefined
  /**
    * Password for authentication. Default: 'anonymous@'
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How long (in milliseconds) to wait for a PASV data connection to be established. Default: 10000
    */
  var pasvTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The port of the FTP server. Default: 21
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set to true for both control and data connection encryption, 'control' for control connection encryption only, or 'implicit' for
    * implicitly encrypted control connection (this mode is deprecated in modern times, but usually uses port 990) Default: false
    */
  var secure: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Additional options to be passed to tls.connect(). Default: (none)
    */
  var secureOptions: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  /**
    * Username for authentication. Default: 'anonymous'
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    connTimeout: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    keepalive: scala.Int | scala.Double = null,
    password: java.lang.String = null,
    pasvTimeout: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    secure: java.lang.String | scala.Boolean = null,
    secureOptions: nodeLib.tlsMod.ConnectionOptions = null,
    user: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (connTimeout != null) __obj.updateDynamic("connTimeout")(connTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (pasvTimeout != null) __obj.updateDynamic("pasvTimeout")(pasvTimeout.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Options]
  }
}

