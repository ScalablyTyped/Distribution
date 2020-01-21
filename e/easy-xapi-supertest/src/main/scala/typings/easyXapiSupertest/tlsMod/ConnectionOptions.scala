package typings.easyXapiSupertest.tlsMod

import typings.easyXapiSupertest.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var NPNProtocols: js.UndefOr[js.Any] = js.undefined
    //string | Buffer
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
     //string | Buffer
  var key: js.UndefOr[js.Any] = js.undefined
     //string | Buffer
  var passphrase: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
      //Array of string | Buffer
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    //Array of string | Buffer
  var servername: js.UndefOr[String] = js.undefined
  var socket: js.UndefOr[Socket] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    NPNProtocols: js.Any = null,
    ca: js.Any = null,
    cert: js.Any = null,
    host: String = null,
    key: js.Any = null,
    passphrase: String = null,
    pfx: js.Any = null,
    port: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    servername: String = null,
    socket: Socket = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

