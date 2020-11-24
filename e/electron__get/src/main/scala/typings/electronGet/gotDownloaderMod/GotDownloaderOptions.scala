package typings.electronGet.gotDownloaderMod

import typings.got.mod.AgentOptions
import typings.got.mod.Cache
import typings.got.mod.Progress
import typings.got.mod.RequestFunction
import typings.got.mod.RetryOptions
import typings.got.mod.TimeoutOptions
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URLSearchParams
import typings.std.Error
import typings.std.Record
import typings.toughCookie.mod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined got.got.GotOptions<string | null> & {  getProgressCallback :(progress : got.got.Progress): std.Promise<void> | undefined,   quiet :boolean | undefined} */
@js.native
trait GotDownloaderOptions extends js.Object {
  
  var _defaultAgent: js.UndefOr[Agent] = js.native
  
  var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.native
  
  var auth: js.UndefOr[String | Null] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Optionally override the trusted CA certificates. Default is to trust
    * the well-known CAs curated by Mozilla. Mozilla's CAs are completely
    * replaced when CAs are explicitly specified using this option.
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var cache: js.UndefOr[Cache] = js.native
  
  /**
    *  Cert chains in PEM format. One cert chain should be provided per
    *  private key. Each cert chain should consist of the PEM formatted
    *  certificate for a provided private key, followed by the PEM
    *  formatted intermediate certificates (if any), in order, and not
    *  including the root CA (the root CA must be pre-known to the peer,
    *  see ca). When providing multiple cert chains, they do not have to
    *  be in the same order as their private keys in key. If the
    *  intermediate certificates are not provided, the peer will not be
    *  able to validate the certificate, and the handshake will fail.
    */
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  /**
    * Cipher suite specification, replacing the default. For more
    * information, see modifying the default cipher suite. Permitted
    * ciphers can be obtained via tls.getCiphers(). Cipher names must be
    * uppercased in order for OpenSSL to accept them.
    */
  var ciphers: js.UndefOr[String] = js.native
  
  /**
    * Name of an OpenSSL engine which can provide the client certificate.
    */
  var clientCertEngine: js.UndefOr[String] = js.native
  
  var cookieJar: js.UndefOr[CookieJar] = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.native
  
  /**
    * PEM formatted CRLs (Certificate Revocation Lists).
    */
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var decompress: js.UndefOr[Boolean] = js.native
  
  var defaultPort: js.UndefOr[Double | String] = js.native
  
  /**
    * Diffie Hellman parameters, required for Perfect Forward Secrecy. Use
    * openssl dhparam to create the parameters. The key length must be
    * greater than or equal to 1024 bits or else an error will be thrown.
    * Although 1024 bits is permissible, use 2048 bits or larger for
    * stronger security. If omitted or invalid, the parameters are
    * silently discarded and DHE ciphers will not be available.
    */
  var dhparam: js.UndefOr[String | Buffer] = js.native
  
  /**
    * A string describing a named curve or a colon separated list of curve
    * NIDs or names, for example P-521:P-384:P-256, to use for ECDH key
    * agreement. Set to auto to select the curve automatically. Use
    * crypto.getCurves() to obtain a list of available curve names. On
    * recent releases, openssl ecparam -list_curves will also display the
    * name and description of each available elliptic curve. Default:
    * tls.DEFAULT_ECDH_CURVE.
    */
  var ecdhCurve: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String | Null] = js.native
  
  var family: js.UndefOr[Double] = js.native
  
  var followRedirect: js.UndefOr[Boolean] = js.native
  
  /**
    * if defined, triggers every time `got`'s `downloadProgress` event callback is triggered.
    */
  var getProgressCallback: js.UndefOr[js.Function1[/* progress */ Progress, js.Promise[Unit]]] = js.native
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  /**
    * Attempt to use the server's cipher suite preferences instead of the
    * client's. When true, causes SSL_OP_CIPHER_SERVER_PREFERENCE to be
    * set in secureOptions
    */
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String | Null] = js.native
  
  var hostname: js.UndefOr[String | Null] = js.native
  
  /**
    * Private keys in PEM format. PEM allows the option of private keys
    * being encrypted. Encrypted keys will be decrypted with
    * options.passphrase. Multiple keys using different algorithms can be
    * provided either as an array of unencrypted key strings or buffers,
    * or an array of objects in the form {pem: <string|buffer>[,
    * passphrase: <string>]}. The object form can only occur in an array.
    * object.passphrase is optional. Encrypted keys will be decrypted with
    * object.passphrase if provided, or options.passphrase if it is not.
    */
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  /**
    * @default 8192
    */
  var maxHeaderSize: js.UndefOr[Double] = js.native
  
  /**
    * Optionally set the maximum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.
    * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
    * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
    * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
    */
  var maxVersion: js.UndefOr[SecureVersion] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  /**
    * Optionally set the minimum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.  It is not recommended to use
    * less than TLSv1.2, but it may be required for interoperability.
    * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
    * `--tls-v1.0` sets the default to `'TLSv1'`. Using `--tls-v1.1` sets the default to
    * `'TLSv1.1'`. Using `--tls-min-v1.3` sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the lowest minimum is used.
    */
  var minVersion: js.UndefOr[SecureVersion] = js.native
  
  /**
    * Shared passphrase used for a single private key and/or a PFX.
    */
  var passphrase: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String | Null] = js.native
  
  /**
    * PFX or PKCS12 encoded private key and certificate chain. pfx is an
    * alternative to providing key and cert individually. PFX is usually
    * encrypted, if it is, passphrase will be used to decrypt it. Multiple
    * PFX can be provided either as an array of unencrypted PFX buffers,
    * or an array of objects in the form {buf: <string|buffer>[,
    * passphrase: <string>]}. The object form can only occur in an array.
    * object.passphrase is optional. Encrypted PFX will be decrypted with
    * object.passphrase if provided, or options.passphrase if it is not.
    */
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
  
  var port: js.UndefOr[Double | String | Null] = js.native
  
  /**
    * Name of an OpenSSL engine to get private key from. Should be used
    * together with privateKeyIdentifier.
    */
  var privateKeyEngine: js.UndefOr[String] = js.native
  
  /**
    * Identifier of a private key managed by an OpenSSL engine. Should be
    * used together with privateKeyEngine. Should not be set together with
    * key, because both options define a private key in different ways.
    */
  var privateKeyIdentifier: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String | Null] = js.native
  
  var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.native
  
  /**
    * if `true`, disables the console progress bar (setting the `ELECTRON_GET_NO_PROGRESS`
    * environment variable to a non-empty value also does this).
    */
  var quiet: js.UndefOr[Boolean] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[RequestFunction] = js.native
  
  var retry: js.UndefOr[Double | RetryOptions] = js.native
  
  /**
    * Optionally affect the OpenSSL protocol behavior, which is not
    * usually necessary. This should be used carefully if at all! Value is
    * a numeric bitmask of the SSL_OP_* options from OpenSSL Options
    */
  var secureOptions: js.UndefOr[Double] = js.native
  
   // Value is a numeric bitmask of the `SSL_OP_*` options
  /**
    * Legacy mechanism to select the TLS protocol version to use, it does
    * not support independent control of the minimum and maximum version,
    * and does not support limiting the protocol to TLSv1.3. Use
    * minVersion and maxVersion instead. The possible values are listed as
    * SSL_METHODS, use the function names as strings. For example, use
    * 'TLSv1_1_method' to force TLS version 1.1, or 'TLS_method' to allow
    * any TLS protocol version up to TLSv1.3. It is not recommended to use
    * TLS versions less than 1.2, but it may be required for
    * interoperability. Default: none, see minVersion.
    */
  var secureProtocol: js.UndefOr[String] = js.native
  
   // Defaults to true
  var servername: js.UndefOr[String] = js.native
  
  /**
    * Opaque identifier used by servers to ensure session state is not
    * shared between applications. Unused by clients.
    */
  var sessionIdContext: js.UndefOr[String] = js.native
  
  /**
    * The number of seconds after which a TLS session created by the
    * server will no longer be resumable. See Session Resumption for more
    * information. Default: 300.
    */
  var sessionTimeout: js.UndefOr[Double] = js.native
  
  var setHost: js.UndefOr[Boolean] = js.native
  
  /**
    *  Colon-separated list of supported signature algorithms. The list
    *  can contain digest algorithms (SHA256, MD5 etc.), public key
    *  algorithms (RSA-PSS, ECDSA etc.), combination of both (e.g
    *  'RSA+SHA384') or TLS v1.3 scheme names (e.g. rsa_pss_pss_sha512).
    */
  var sigalgs: js.UndefOr[String] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var throwHttpErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * 48-bytes of cryptographically strong pseudo-random data.
    * See Session Resumption for more information.
    */
  var ticketKeys: js.UndefOr[Buffer] = js.native
  
  var timeout: js.UndefOr[Double | TimeoutOptions] = js.native
  
  var useElectronNet: js.UndefOr[Boolean] = js.native
}
object GotDownloaderOptions {
  
  @scala.inline
  def apply(): GotDownloaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GotDownloaderOptions]
  }
  
  @scala.inline
  implicit class GotDownloaderOptionsOps[Self <: GotDownloaderOptions] (val x: Self) extends AnyVal {
    
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
    def set_defaultAgent(value: Agent): Self = this.set("_defaultAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultAgent: Self = this.set("_defaultAgent", js.undefined)
    
    @scala.inline
    def setAgent(value: Agent | Boolean | AgentOptions): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCache(value: Cache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setClientCertEngine(value: String): Self = this.set("clientCertEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertEngine: Self = this.set("clientCertEngine", js.undefined)
    
    @scala.inline
    def setCookieJar(value: CookieJar): Self = this.set("cookieJar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieJar: Self = this.set("cookieJar", js.undefined)
    
    @scala.inline
    def setCreateConnection(
      value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
    ): Self = this.set("createConnection", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateConnection: Self = this.set("createConnection", js.undefined)
    
    @scala.inline
    def setCrlVarargs(value: (String | Buffer)*): Self = this.set("crl", js.Array(value :_*))
    
    @scala.inline
    def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrl: Self = this.set("crl", js.undefined)
    
    @scala.inline
    def setDecompress(value: Boolean): Self = this.set("decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompress: Self = this.set("decompress", js.undefined)
    
    @scala.inline
    def setDefaultPort(value: Double | String): Self = this.set("defaultPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPort: Self = this.set("defaultPort", js.undefined)
    
    @scala.inline
    def setDhparam(value: String | Buffer): Self = this.set("dhparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhparam: Self = this.set("dhparam", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = this.set("ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcdhCurve: Self = this.set("ecdhCurve", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    
    @scala.inline
    def setGetProgressCallback(value: /* progress */ Progress => js.Promise[Unit]): Self = this.set("getProgressCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetProgressCallback: Self = this.set("getProgressCallback", js.undefined)
    
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = this.set("honorCipherOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHonorCipherOrder: Self = this.set("honorCipherOrder", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | KeyObject)*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setMaxHeaderSize(value: Double): Self = this.set("maxHeaderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeaderSize: Self = this.set("maxHeaderSize", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: SecureVersion): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMinVersion(value: SecureVersion): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVersion: Self = this.set("minVersion", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = this.set("pfx", js.Array(value :_*))
    
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    
    @scala.inline
    def setPrivateKeyEngine(value: String): Self = this.set("privateKeyEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyEngine: Self = this.set("privateKeyEngine", js.undefined)
    
    @scala.inline
    def setPrivateKeyIdentifier(value: String): Self = this.set("privateKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyIdentifier: Self = this.set("privateKeyIdentifier", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    
    @scala.inline
    def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestFunction): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRetry(value: Double | RetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setSecureOptions(value: Double): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    
    @scala.inline
    def setSessionIdContext(value: String): Self = this.set("sessionIdContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionIdContext: Self = this.set("sessionIdContext", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    
    @scala.inline
    def setSetHost(value: Boolean): Self = this.set("setHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetHost: Self = this.set("setHost", js.undefined)
    
    @scala.inline
    def setSigalgs(value: String): Self = this.set("sigalgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigalgs: Self = this.set("sigalgs", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setThrowHttpErrors(value: Boolean): Self = this.set("throwHttpErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowHttpErrors: Self = this.set("throwHttpErrors", js.undefined)
    
    @scala.inline
    def setTicketKeys(value: Buffer): Self = this.set("ticketKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketKeys: Self = this.set("ticketKeys", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | TimeoutOptions): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUseElectronNet(value: Boolean): Self = this.set("useElectronNet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseElectronNet: Self = this.set("useElectronNet", js.undefined)
  }
}
