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
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URLSearchParams
import typings.std.Error
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
    agent: Agent | Boolean | AgentOptions = null,
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
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    localAddress: String = null,
    map: /* file */ File => File = null,
    maxVersion: SecureVersion = null,
    method: String = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    plugins: js.Array[_] = null,
    port: Double | String = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
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
    sigalgs: String = null,
    socketPath: String = null,
    strip: Int | Double = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | TimeoutOptions = null,
    useElectronNet: js.UndefOr[Boolean] = js.undefined
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.asInstanceOf[js.Any])
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(extract)) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useElectronNet)) __obj.updateDynamic("useElectronNet")(useElectronNet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

