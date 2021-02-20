package typings.electronGet

import typings.electronGet.downloaderMod.Downloader
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gotDownloaderMod {
  
  @JSImport("@electron/get/dist/cjs/GotDownloader", "GotDownloader")
  @js.native
  class GotDownloader () extends Downloader[GotDownloaderOptions] {
    
    def download(url: String, targetFilePath: String): js.Promise[Unit] = js.native
  }
  
  /* Inlined got.got.GotOptions<string | null> & {  getProgressCallback :(progress : got.got.Progress): std.Promise<void> | undefined,   quiet :boolean | undefined} */
  @js.native
  trait GotDownloaderOptions extends StObject {
    
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
    implicit class GotDownloaderOptionsMutableBuilder[Self <: GotDownloaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | Boolean | AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      @scala.inline
      def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setGetProgressCallback(value: /* progress */ Progress => js.Promise[Unit]): Self = StObject.set(x, "getProgressCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetProgressCallbackUndefined: Self = StObject.set(x, "getProgressCallback", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      @scala.inline
      def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: (Record[String, _]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      @scala.inline
      def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
}
