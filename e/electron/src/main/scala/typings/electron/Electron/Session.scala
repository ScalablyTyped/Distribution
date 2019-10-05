package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import typings.electron.electronStrings.`will-download`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Session")
@js.native
class Session () extends EventEmitter {
  var cookies: Cookies = js.native
  var netLog: NetLog = js.native
  var protocol: Protocol = js.native
  var webRequest: WebRequest = js.native
  @JSName("addListener")
  def addListener_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  /**
    * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
    * authentication.
    */
  def allowNTLMCredentialsForDomains(domains: String): Unit = js.native
  def clearAuthCache(): js.Promise[Unit] = js.native
  def clearAuthCache(options: RemoveClientCertificate): js.Promise[Unit] = js.native
  def clearAuthCache(options: RemoveClientCertificate, callback: js.Function): Unit = js.native
  def clearAuthCache(options: RemovePassword): js.Promise[Unit] = js.native
  /**
    * Clears the session’s HTTP authentication cache. Deprecated Soon
    */
  def clearAuthCache(options: RemovePassword, callback: js.Function): Unit = js.native
  /**
    * Clears the session’s HTTP cache.
    */
  def clearCache(): js.Promise[Unit] = js.native
  /**
    * Clears the session’s HTTP cache. Deprecated Soon
    */
  def clearCache(callback: js.Function1[/* error */ Double, Unit]): Unit = js.native
  /**
    * Clears the host resolver cache.
    */
  def clearHostResolverCache(): js.Promise[Unit] = js.native
  def clearHostResolverCache(callback: js.Function): Unit = js.native
  /**
    * Clears the host resolver cache. Deprecated Soon
    */
  @JSName("clearHostResolverCache")
  def clearHostResolverCache_Unit(): Unit = js.native
  def clearStorageData(): js.Promise[Unit] = js.native
  def clearStorageData(options: ClearStorageDataOptions): js.Promise[Unit] = js.native
  def clearStorageData(options: ClearStorageDataOptions, callback: js.Function): Unit = js.native
  /**
    * Clears the storage data for the current session. Deprecated Soon
    */
  @JSName("clearStorageData")
  def clearStorageData_Unit(): Unit = js.native
  @JSName("clearStorageData")
  def clearStorageData_Unit(options: ClearStorageDataOptions): Unit = js.native
  /**
    * Allows resuming cancelled or interrupted downloads from previous Session. The
    * API will generate a DownloadItem that can be accessed with the will-download
    * event. The DownloadItem will not have any WebContents associated with it and the
    * initial state will be interrupted. The download will start only when the resume
    * API is called on the DownloadItem.
    */
  def createInterruptedDownload(options: CreateInterruptedDownloadOptions): Unit = js.native
  /**
    * Disables any network emulation already active for the session. Resets to the
    * original network configuration.
    */
  def disableNetworkEmulation(): Unit = js.native
  /**
    * Emulates network with the given configuration for the session.
    */
  def enableNetworkEmulation(options: EnableNetworkEmulationOptions): Unit = js.native
  /**
    * Writes any unwritten DOMStorage data to disk.
    */
  def flushStorageData(): Unit = js.native
  def getBlobData(identifier: String): js.Promise[Buffer] = js.native
  /**
    * Deprecated Soon
    */
  def getBlobData(identifier: String, callback: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def getCacheSize(): js.Promise[Double] = js.native
  /**
    * Callback is invoked with the session's current cache size. Deprecated Soon
    */
  def getCacheSize(callback: js.Function2[/* size */ Double, /* error */ Double, Unit]): Unit = js.native
  def getPreloads(): js.Array[String] = js.native
  def getUserAgent(): String = js.native
  /**
    * Emitted when Electron is about to download item in webContents. Calling
    * event.preventDefault() will cancel the download and item will not be available
    * from next tick of the process.
    */
  @JSName("on")
  def on_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willdownload(
    event: `will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  def resolveProxy(url: String): js.Promise[String] = js.native
  /**
    * Resolves the proxy information for url. The callback will be called with
    * callback(proxy) when the request is performed. Deprecated Soon
    */
  def resolveProxy(url: String, callback: js.Function1[/* proxy */ String, Unit]): Unit = js.native
  /**
    * Sets the certificate verify proc for session, the proc will be called with
    * proc(request, callback) whenever a server certificate verification is requested.
    * Calling callback(0) accepts the certificate, calling callback(-2) rejects it.
    * Calling setCertificateVerifyProc(null) will revert back to default certificate
    * verify proc.
    */
  def setCertificateVerifyProc(
    proc: js.Function2[
      /* request */ CertificateVerifyProcRequest, 
      /* callback */ js.Function1[/* verificationResult */ Double, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Sets download saving directory. By default, the download directory will be the
    * Downloads under the respective app folder.
    */
  def setDownloadPath(path: String): Unit = js.native
  def setPermissionCheckHandler(): Unit = js.native
  /**
    * Sets the handler which can be used to respond to permission checks for the
    * session. Returning true will allow the permission and false will reject it. To
    * clear the handler, call setPermissionCheckHandler(null).
    */
  def setPermissionCheckHandler(
    handler: js.Function4[
      /* webContents */ WebContents, 
      /* permission */ String, 
      /* requestingOrigin */ String, 
      /* details */ PermissionCheckHandlerDetails, 
      Boolean
    ]
  ): Unit = js.native
  def setPermissionRequestHandler(): Unit = js.native
  /**
    * Sets the handler which can be used to respond to permission requests for the
    * session. Calling callback(true) will allow the permission and callback(false)
    * will reject it. To clear the handler, call setPermissionRequestHandler(null).
    */
  def setPermissionRequestHandler(
    handler: js.Function4[
      /* webContents */ WebContents, 
      /* permission */ String, 
      /* callback */ js.Function1[/* permissionGranted */ Boolean, Unit], 
      /* details */ PermissionRequestHandlerDetails, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Adds scripts that will be executed on ALL web contents that are associated with
    * this session just before normal preload scripts run.
    */
  def setPreloads(preloads: js.Array[String]): Unit = js.native
  /**
    * Sets the proxy settings. When pacScript and proxyRules are provided together,
    * the proxyRules option is ignored and pacScript configuration is applied. The
    * proxyRules has to follow the rules below: For example: The proxyBypassRules is a
    * comma separated list of rules described below:
    */
  def setProxy(config: Config): js.Promise[Unit] = js.native
  /**
    * Sets the proxy settings. When pacScript and proxyRules are provided together,
    * the proxyRules option is ignored and pacScript configuration is applied. The
    * proxyRules has to follow the rules below: For example: The proxyBypassRules is a
    * comma separated list of rules described below: Deprecated Soon
    */
  def setProxy(config: Config, callback: js.Function): Unit = js.native
  /**
    * Overrides the userAgent and acceptLanguages for this session. The
    * acceptLanguages must a comma separated ordered list of language codes, for
    * example "en-US,fr,de,ko,zh-CN,ja". This doesn't affect existing WebContents, and
    * each WebContents can use webContents.setUserAgent to override the session-wide
    * user agent.
    */
  def setUserAgent(userAgent: String): Unit = js.native
  def setUserAgent(userAgent: String, acceptLanguages: String): Unit = js.native
}

/* static members */
@JSGlobal("Electron.Session")
@js.native
object Session extends js.Object {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[Session] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): Session = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): Session = js.native
}

@JSGlobal("Electron.session")
@js.native
object session extends Instantiable0[Session] {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[Session] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): Session = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): Session = js.native
}

