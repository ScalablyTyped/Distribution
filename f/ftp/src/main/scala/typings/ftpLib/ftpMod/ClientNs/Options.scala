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

