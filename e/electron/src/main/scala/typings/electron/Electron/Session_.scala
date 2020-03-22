package typings.electron.Electron

import typings.electron.electronStrings.`will-download`
import typings.electron.electronStrings.preconnect
import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Session")
@js.native
class Session_ () extends EventEmitter {
  val availableSpellCheckerLanguages: js.Array[String] = js.native
  val cookies: Cookies = js.native
  val netLog: NetLog_ = js.native
  val protocol: Protocol_ = js.native
  val webRequest: WebRequest = js.native
  @JSName("addListener")
  def addListener_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  /**
    * Whether the word was successfully written to the custom dictionary.
    *
    * **Note:** On macOS and Windows 10 this word will be written to the OS custom
    * dictionary as well
    */
  def addWordToSpellCheckerDictionary(word: String): Boolean = js.native
  /**
    * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
    * authentication.
    */
  def allowNTLMCredentialsForDomains(domains: String): Unit = js.native
  def clearAuthCache(options: RemoveClientCertificate): js.Promise[Unit] = js.native
  /**
    * resolves when the session’s HTTP authentication cache has been cleared.
    */
  def clearAuthCache(options: RemovePassword): js.Promise[Unit] = js.native
  /**
    * resolves when the cache clear operation is complete.
    * 
  Clears the session’s HTTP cache.
    */
  def clearCache(): js.Promise[Unit] = js.native
  /**
    * Resolves when the operation is complete.
  Clears the host resolver cache.
    */
  def clearHostResolverCache(): js.Promise[Unit] = js.native
  /**
    * resolves when the storage data has been cleared.
    */
  def clearStorageData(): js.Promise[Unit] = js.native
  def clearStorageData(options: ClearStorageDataOptions): js.Promise[Unit] = js.native
  /**
    * Allows resuming `cancelled` or `interrupted` downloads from previous `Session`.
    * The API will generate a DownloadItem that can be accessed with the will-download
    * event. The DownloadItem will not have any `WebContents` associated with it and
    * the initial state will be `interrupted`. The download will start only when the
    * `resume` API is called on the DownloadItem.
    */
  def createInterruptedDownload(options: CreateInterruptedDownloadOptions): Unit = js.native
  /**
    * Disables any network emulation already active for the `session`. Resets to the
    * original network configuration.
    */
  def disableNetworkEmulation(): Unit = js.native
  /**
    * Initiates a download of the resource at `url`. The API will generate a
    * DownloadItem that can be accessed with the will-download event.
    *
    * **Note:** This does not perform any security checks that relate to a page's
    * origin, unlike `webContents.downloadURL`.
    */
  def downloadURL(url: String): Unit = js.native
  /**
    * Emulates network with the given configuration for the `session`.
    */
  def enableNetworkEmulation(options: EnableNetworkEmulationOptions): Unit = js.native
  /**
    * Writes any unwritten DOMStorage data to disk.
    */
  def flushStorageData(): Unit = js.native
  /**
    * resolves with blob data.
    */
  def getBlobData(identifier: String): js.Promise[Buffer] = js.native
  /**
    * the session's current cache size, in bytes.
    */
  def getCacheSize(): js.Promise[Double] = js.native
  /**
    * an array of paths to preload scripts that have been registered.
    */
  def getPreloads(): js.Array[String] = js.native
  /**
    * An array of language codes the spellchecker is enabled for.  If this list is
    * empty the spellchecker will fallback to using `en-US`.  By default on launch if
    * this setting is an empty list Electron will try to populate this setting with
    * the current OS locale.  This setting is persisted across restarts.
    *
    * **Note:** On macOS the OS spellchecker is used and has it's own list of
    * languages.  This API is a no-op on macOS.
    */
  def getSpellCheckerLanguages(): js.Array[String] = js.native
  /**
    * The user agent for this session.
    */
  def getUserAgent(): String = js.native
  /**
    * Emitted when a render process requests preconnection to a URL, generally due to
    * a resource hint.
    */
  @JSName("on")
  def on_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when Electron is about to download `item` in `webContents`.
    *
    * Calling `event.preventDefault()` will cancel the download and `item` will not be
    * available from next tick of the process.
    */
  @JSName("on")
  def on_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  /**
    * Preconnects the given number of sockets to an origin.
    */
  def preconnect(options: PreconnectOptions): Unit = js.native
  @JSName("removeListener")
  def removeListener_preconnect(
    event: preconnect,
    listener: js.Function3[/* event */ Event, /* preconnectUrl */ String, /* allowCredentials */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  /**
    * Resolves with the proxy information for `url`.
    */
  def resolveProxy(url: String): js.Promise[String] = js.native
  def setCertificateVerifyProc(): Unit = js.native
  /**
    * Sets the certificate verify proc for `session`, the `proc` will be called with
    * `proc(request, callback)` whenever a server certificate verification is
    * requested. Calling `callback(0)` accepts the certificate, calling `callback(-2)`
    * rejects it.
    *
    * Calling `setCertificateVerifyProc(null)` will revert back to default certificate
    * verify proc.
    */
  def setCertificateVerifyProc(
    proc: js.Function2[
      /* request */ CertificateVerifyProcProcRequest, 
      /* callback */ js.Function1[/* verificationResult */ Double, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Sets download saving directory. By default, the download directory will be the
    * `Downloads` under the respective app folder.
    */
  def setDownloadPath(path: String): Unit = js.native
  def setPermissionCheckHandler(): Unit = js.native
  /**
    * Sets the handler which can be used to respond to permission checks for the
    * `session`. Returning `true` will allow the permission and `false` will reject
    * it. To clear the handler, call `setPermissionCheckHandler(null)`.
    */
  def setPermissionCheckHandler(
    handler: js.Function4[
      /* webContents */ WebContents_, 
      /* permission */ String, 
      /* requestingOrigin */ String, 
      /* details */ Details, 
      Boolean
    ]
  ): Unit = js.native
  def setPermissionRequestHandler(): Unit = js.native
  /**
    * Sets the handler which can be used to respond to permission requests for the
    * `session`. Calling `callback(true)` will allow the permission and
    * `callback(false)` will reject it. To clear the handler, call
    * `setPermissionRequestHandler(null)`.
    */
  def setPermissionRequestHandler(
    handler: js.Function4[
      /* webContents */ WebContents_, 
      /* permission */ String, 
      /* callback */ js.Function1[/* permissionGranted */ Boolean, Unit], 
      /* details */ PermissionRequestHandlerHandlerDetails, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Adds scripts that will be executed on ALL web contents that are associated with
    * this session just before normal `preload` scripts run.
    */
  def setPreloads(preloads: js.Array[String]): Unit = js.native
  /**
    * Resolves when the proxy setting process is complete.
    *
    * Sets the proxy settings.
    *
    * When `pacScript` and `proxyRules` are provided together, the `proxyRules` option
    * is ignored and `pacScript` configuration is applied.
    *
    * The `proxyRules` has to follow the rules below:
    *
    * For example:
    *
    * * `http=foopy:80;ftp=foopy2` - Use HTTP proxy `foopy:80` for `http://` URLs, and
    * HTTP proxy `foopy2:80` for `ftp://` URLs.
    * * `foopy:80` - Use HTTP proxy `foopy:80` for all URLs.
    * * `foopy:80,bar,direct://` - Use HTTP proxy `foopy:80` for all URLs, failing
    * over to `bar` if `foopy:80` is unavailable, and after that using no proxy.
    * * `socks4://foopy` - Use SOCKS v4 proxy `foopy:1080` for all URLs.
    * * `http=foopy,socks5://bar.com` - Use HTTP proxy `foopy` for http URLs, and fail
    * over to the SOCKS5 proxy `bar.com` if `foopy` is unavailable.
    * * `http=foopy,direct://` - Use HTTP proxy `foopy` for http URLs, and use no
    * proxy if `foopy` is unavailable.
    * * `http=foopy;socks=foopy2` - Use HTTP proxy `foopy` for http URLs, and use
    * `socks4://foopy2` for all other URLs.
    *
    * The `proxyBypassRules` is a comma separated list of rules described below:
    *
    * * `[ URL_SCHEME "://" ] HOSTNAME_PATTERN [ ":" <port> ]`
    *
    * Match all hostnames that match the pattern HOSTNAME_PATTERN.
    *
    * Examples: "foobar.com", "*foobar.com", "*.foobar.com", "*foobar.com:99",
    * "https://x.*.y.com:99"
    * * `"." HOSTNAME_SUFFIX_PATTERN [ ":" PORT ]`
    *
    * Match a particular domain suffix.
    *
    * Examples: ".google.com", ".com", "http://.google.com"
    * * `[ SCHEME "://" ] IP_LITERAL [ ":" PORT ]`
    *
    * Match URLs which are IP address literals.
    *
    * Examples: "127.0.1", "[0:0::1]", "[::1]", "http://[::1]:99"
    * * `IP_LITERAL "/" PREFIX_LENGTH_IN_BITS`
    *
    * Match any URL that is to an IP literal that falls between the given range. IP
    * range is specified using CIDR notation.
    *
    * Examples: "192.168.1.1/16", "fefe:13::abc/33".
    * * `<local>`
    *
    * Match local addresses. The meaning of `<local>` is whether the host matches one
    * of: "127.0.0.1", "::1", "localhost".
    */
  def setProxy(config: Config): js.Promise[Unit] = js.native
  /**
    * By default Electron will download hunspell dictionaries from the Chromium CDN.
    * If you want to override this behavior you can use this API to point the
    * dictionary downloader at your own hosted version of the hunspell dictionaries.
    * We publish a `hunspell_dictionaries.zip` file with each release which contains
    * the files you need to host here.
    *
    * **Note:** On macOS the OS spellchecker is used and therefore we do not download
    * any dictionary files.  This API is a no-op on macOS.
    */
  def setSpellCheckerDictionaryDownloadURL(url: String): Unit = js.native
  /**
    * The built in spellchecker does not automatically detect what language a user is
    * typing in.  In order for the spell checker to correctly check their words you
    * must call this API with an array of language codes.  You can get the list of
    * supported language codes with the `ses.availableSpellCheckerLanguages` property.
    *
    * **Note:** On macOS the OS spellchecker is used and will detect your language
    * automatically.  This API is a no-op on macOS.
    */
  def setSpellCheckerLanguages(languages: js.Array[String]): Unit = js.native
  /**
    * Overrides the `userAgent` and `acceptLanguages` for this session.
    *
    * The `acceptLanguages` must a comma separated ordered list of language codes, for
    * example `"en-US,fr,de,ko,zh-CN,ja"`.
    *
    * This doesn't affect existing `WebContents`, and each `WebContents` can use
    * `webContents.setUserAgent` to override the session-wide user agent.
    */
  def setUserAgent(userAgent: String): Unit = js.native
  def setUserAgent(userAgent: String, acceptLanguages: String): Unit = js.native
}

/* static members */
@JSGlobal("Electron.Session")
@js.native
object Session_ extends js.Object {
  /**
    * A `Session` object, the default session object of the app.
    */
  var defaultSession: Session_ = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * A session instance from `partition` string. When there is an existing `Session`
    * with the same `partition`, it will be returned; otherwise a new `Session`
    * instance will be created with `options`.
    *
    * If `partition` starts with `persist:`, the page will use a persistent session
    * available to all pages in the app with the same `partition`. if there is no
    * `persist:` prefix, the page will use an in-memory session. If the `partition` is
    * empty then default session of the app will be returned.
    *
    * To create a `Session` with `options`, you have to ensure the `Session` with the
    * `partition` has never been used before. There is no way to change the `options`
    * of an existing `Session` object.
    */
  def fromPartition(partition: String): Session_ = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): Session_ = js.native
}

