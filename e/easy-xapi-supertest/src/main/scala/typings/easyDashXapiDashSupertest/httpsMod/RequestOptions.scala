package typings.easyDashXapiDashSupertest.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: js.UndefOr[js.Any] = js.undefined
  var auth: js.UndefOr[String] = js.undefined
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: js.Any = null,
    auth: String = null,
    ca: js.Any = null,
    cert: js.Any = null,
    ciphers: String = null,
    headers: js.Any = null,
    host: String = null,
    hostname: String = null,
    key: js.Any = null,
    method: String = null,
    passphrase: String = null,
    path: String = null,
    pfx: js.Any = null,
    port: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (key != null) __obj.updateDynamic("key")(key)
    if (method != null) __obj.updateDynamic("method")(method)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[RequestOptions]
  }
}

