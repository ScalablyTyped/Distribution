package typings
package easyDashXapiDashSupertestLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var NPNProtocols: js.UndefOr[js.Any] = js.undefined
    //string | Buffer
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
     //string | Buffer
  var key: js.UndefOr[js.Any] = js.undefined
     //string | Buffer
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
      //Array of string | Buffer
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
    //Array of string | Buffer
  var servername: js.UndefOr[java.lang.String] = js.undefined
  var socket: js.UndefOr[easyDashXapiDashSupertestLib.netMod.Socket] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    NPNProtocols: js.Any = null,
    ca: js.Any = null,
    cert: js.Any = null,
    host: java.lang.String = null,
    key: js.Any = null,
    passphrase: java.lang.String = null,
    pfx: js.Any = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    servername: java.lang.String = null,
    socket: easyDashXapiDashSupertestLib.netMod.Socket = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

