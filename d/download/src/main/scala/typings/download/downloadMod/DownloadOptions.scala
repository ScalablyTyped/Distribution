package typings.download.downloadMod

import org.scalablytyped.runtime.StringDictionary
import typings.decompress.decompressMod.DecompressOptions
import typings.decompress.decompressMod.File
import typings.got.gotMod.AgentOptions
import typings.got.gotMod.Cache
import typings.got.gotMod.GotBodyOptions
import typings.got.gotMod.Hooks
import typings.got.gotMod.RequestFunction
import typings.got.gotMod.RetryOptions
import typings.got.gotMod.TimeoutOptions
import typings.node.Buffer
import typings.node.Error
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URLSearchParams
import typings.std.Record
import typings.toughDashCookie.toughDashCookieMod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions
  extends GotBodyOptions[String]
     with DecompressOptions {
  /**
    * If set to true, try extracting the file using decompress.
    */
  var extract: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the saved file.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Request Headers
    */
  @JSName("headers")
  var headers_DownloadOptions: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Proxy endpoint
    */
  var proxy: js.UndefOr[String] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    agent_GotOptions: Agent | Boolean | AgentOptions = null,
    agent_InternalRequestOptions: js.Any = null,
    auth: String = null,
    baseUrl: String = null,
    body: String | Buffer | Readable = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cache: Cache = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    cookieJar: CookieJar = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    decompress: js.UndefOr[Boolean] = js.undefined,
    defaultPort: Double | String = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    encoding: String = null,
    extract: js.UndefOr[Boolean] = js.undefined,
    family: Int | Double = null,
    filename: String = null,
    filter: /* file */ File => Boolean = null,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    hooks: Hooks[GotBodyOptions[String], String | Buffer | Readable] = null,
    host: String = null,
    hostname: String = null,
    key: String | Buffer | (js.Array[Buffer | js.Object]) = null,
    localAddress: String = null,
    map: /* file */ File => File = null,
    maxVersion: SecureVersion = null,
    method: String = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    plugins: js.Array[_] = null,
    port: Double | String = null,
    protocol: String = null,
    proxy: String = null,
    query: (Record[String, _]) | URLSearchParams | String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    request: RequestFunction = null,
    retry: Double | RetryOptions = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    sessionIdContext: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    strip: Int | Double = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timeout_GotOptions: Double | TimeoutOptions = null,
    timeout_InternalRequestOptions: js.Any = null,
    useElectronNet: js.UndefOr[Boolean] = js.undefined
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
    if (request != null) __obj.updateDynamic("request")(request)
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

