package typings.ftp.mod

import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * How long (in milliseconds) to wait for the control connection to be established. Default: 10000
    */
  var connTimeout: js.UndefOr[Double] = js.native
  /**
    * Debug function to invoke to enable debug logging.
    */
  var debug: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  /**
    * The hostname or IP address of the FTP server. Default: 'localhost'
    */
  var host: js.UndefOr[String] = js.native
  /**
    * How often (in milliseconds) to send a 'dummy' (NOOP) command to keep the connection alive. Default: 10000
    */
  var keepalive: js.UndefOr[Double] = js.native
  /**
    * Password for authentication. Default: 'anonymous@'
    */
  var password: js.UndefOr[String] = js.native
  /**
    * How long (in milliseconds) to wait for a PASV data connection to be established. Default: 10000
    */
  var pasvTimeout: js.UndefOr[Double] = js.native
  /**
    * The port of the FTP server. Default: 21
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Set to true for both control and data connection encryption, 'control' for control connection encryption only, or 'implicit' for
    * implicitly encrypted control connection (this mode is deprecated in modern times, but usually uses port 990) Default: false
    */
  var secure: js.UndefOr[String | Boolean] = js.native
  /**
    * Additional options to be passed to tls.connect(). Default: (none)
    */
  var secureOptions: js.UndefOr[ConnectionOptions] = js.native
  /**
    * Username for authentication. Default: 'anonymous'
    */
  var user: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnTimeout(value: Double): Self = this.set("connTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnTimeout: Self = this.set("connTimeout", js.undefined)
    @scala.inline
    def setDebug(value: /* message */ String => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setKeepalive(value: Double): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPasvTimeout(value: Double): Self = this.set("pasvTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasvTimeout: Self = this.set("pasvTimeout", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSecure(value: String | Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSecureOptions(value: ConnectionOptions): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

