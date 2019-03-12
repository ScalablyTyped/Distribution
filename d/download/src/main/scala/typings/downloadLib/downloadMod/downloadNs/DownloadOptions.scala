package typings
package downloadLib.downloadMod.downloadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions
  extends gotLib.gotMod.gotNs.GotBodyOptions[java.lang.String]
     with decompressLib.decompressMod.decompressNs.DecompressOptions {
  /**
    * If set to true, try extracting the file using decompress.
    */
  var extract: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the saved file.
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Request Headers
    */
  @JSName("headers")
  var headers_DownloadOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Proxy endpoint
    */
  var proxy: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    _defaultAgent: nodeLib.httpMod.Agent = null,
    agent: nodeLib.httpMod.Agent | scala.Boolean = null,
    agent_GotOptions: nodeLib.httpMod.Agent | scala.Boolean | gotLib.gotMod.gotNs.AgentOptions = null,
    agent_InternalRequestOptions: js.Any = null,
    auth: java.lang.String = null,
    baseUrl: java.lang.String = null,
    body: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cache: gotLib.gotMod.gotNs.Cache = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    cookieJar: toughDashCookieLib.toughDashCookieMod.CookieJar = null,
    createConnection: (/* options */ nodeLib.httpMod.ClientRequestArgs, /* oncreate */ js.Function2[/* err */ nodeLib.Error, /* socket */ nodeLib.netMod.Socket, scala.Unit]) => nodeLib.netMod.Socket = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    decompress: js.UndefOr[scala.Boolean] = js.undefined,
    defaultPort: scala.Double | java.lang.String = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    encoding: java.lang.String = null,
    extract: js.UndefOr[scala.Boolean] = js.undefined,
    family: scala.Int | scala.Double = null,
    filename: java.lang.String = null,
    filter: /* file */ decompressLib.decompressMod.decompressNs.File => scala.Boolean = null,
    followRedirect: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: gotLib.gotMod.gotNs.Hooks[
      gotLib.gotMod.gotNs.GotBodyOptions[java.lang.String], 
      java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable
    ] = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    localAddress: java.lang.String = null,
    map: /* file */ decompressLib.decompressMod.decompressNs.File => decompressLib.decompressMod.decompressNs.File = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    method: java.lang.String = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    plugins: js.Array[_] = null,
    port: scala.Double | java.lang.String = null,
    protocol: java.lang.String = null,
    proxy: java.lang.String = null,
    query: java.lang.String | js.Object = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    retry: scala.Double | gotLib.gotMod.gotNs.RetryOptions = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    sessionIdContext: java.lang.String = null,
    setHost: js.UndefOr[scala.Boolean] = js.undefined,
    socketPath: java.lang.String = null,
    strip: scala.Int | scala.Double = null,
    throwHttpErrors: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timeout_GotOptions: scala.Double | gotLib.gotMod.gotNs.TimeoutOptions = null,
    timeout_InternalRequestOptions: js.Any = null,
    useElectronNet: js.UndefOr[scala.Boolean] = js.undefined
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agent_GotOptions != null) __obj.updateDynamic("agent")(agent_GotOptions.asInstanceOf[js.Any])
    if (agent_InternalRequestOptions != null) __obj.updateDynamic("agent")(agent_InternalRequestOptions)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress)
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(extract)) __obj.updateDynamic("extract")(extract)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (method != null) __obj.updateDynamic("method")(method)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeout_GotOptions != null) __obj.updateDynamic("timeout")(timeout_GotOptions.asInstanceOf[js.Any])
    if (timeout_InternalRequestOptions != null) __obj.updateDynamic("timeout")(timeout_InternalRequestOptions)
    if (!js.isUndefined(useElectronNet)) __obj.updateDynamic("useElectronNet")(useElectronNet)
    __obj.asInstanceOf[DownloadOptions]
  }
}

