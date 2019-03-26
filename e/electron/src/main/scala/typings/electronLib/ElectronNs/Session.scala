package typings
package electronLib.ElectronNs

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
  def `addListener_will-download`(
    event: electronLib.electronLibStrings.`will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, scala.Unit]
  ): this.type = js.native
  /**
    * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
    * authentication.
    */
  def allowNTLMCredentialsForDomains(domains: java.lang.String): scala.Unit = js.native
  def clearAuthCache(options: RemoveClientCertificate): scala.Unit = js.native
  def clearAuthCache(options: RemoveClientCertificate, callback: js.Function): scala.Unit = js.native
  /**
    * Clears the session’s HTTP authentication cache.
    */
  def clearAuthCache(options: RemovePassword): scala.Unit = js.native
  def clearAuthCache(options: RemovePassword, callback: js.Function): scala.Unit = js.native
  /**
    * Clears the session’s HTTP cache.
    */
  def clearCache(callback: js.Function): scala.Unit = js.native
  /**
    * Clears the host resolver cache.
    */
  def clearHostResolverCache(): scala.Unit = js.native
  def clearHostResolverCache(callback: js.Function): scala.Unit = js.native
  /**
    * Clears the data of web storages.
    */
  def clearStorageData(): scala.Unit = js.native
  def clearStorageData(options: ClearStorageDataOptions): scala.Unit = js.native
  def clearStorageData(options: ClearStorageDataOptions, callback: js.Function): scala.Unit = js.native
  /**
    * Allows resuming cancelled or interrupted downloads from previous Session. The
    * API will generate a DownloadItem that can be accessed with the will-download
    * event. The DownloadItem will not have any WebContents associated with it and the
    * initial state will be interrupted. The download will start only when the resume
    * API is called on the DownloadItem.
    */
  def createInterruptedDownload(options: CreateInterruptedDownloadOptions): scala.Unit = js.native
  /**
    * Disables any network emulation already active for the session. Resets to the
    * original network configuration.
    */
  def disableNetworkEmulation(): scala.Unit = js.native
  /**
    * Emulates network with the given configuration for the session.
    */
  def enableNetworkEmulation(options: EnableNetworkEmulationOptions): scala.Unit = js.native
  /**
    * Writes any unwritten DOMStorage data to disk.
    */
  def flushStorageData(): scala.Unit = js.native
  def getBlobData(identifier: java.lang.String, callback: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  /**
    * Callback is invoked with the session's current cache size.
    */
  def getCacheSize(callback: js.Function1[/* size */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getPreloads(): js.Array[java.lang.String] = js.native
  def getUserAgent(): java.lang.String = js.native
  /**
    * Emitted when Electron is about to download item in webContents. Calling
    * event.preventDefault() will cancel the download and item will not be available
    * from next tick of the process.
    */
  @JSName("on")
  def `on_will-download`(
    event: electronLib.electronLibStrings.`will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_will-download`(
    event: electronLib.electronLibStrings.`will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-download`(
    event: electronLib.electronLibStrings.`will-download`,
    listener: js.Function3[/* event */ Event, /* item */ DownloadItem, /* webContents */ WebContents, scala.Unit]
  ): this.type = js.native
  /**
    * Resolves the proxy information for url. The callback will be called with
    * callback(proxy) when the request is performed.
    */
  def resolveProxy(url: java.lang.String, callback: js.Function1[/* proxy */ java.lang.String, scala.Unit]): scala.Unit = js.native
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
      /* callback */ js.Function1[/* verificationResult */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Sets download saving directory. By default, the download directory will be the
    * Downloads under the respective app folder.
    */
  def setDownloadPath(path: java.lang.String): scala.Unit = js.native
  def setPermissionCheckHandler(): scala.Unit = js.native
  /**
    * Sets the handler which can be used to respond to permission checks for the
    * session. Returning true will allow the permission and false will reject it. To
    * clear the handler, call setPermissionCheckHandler(null).
    */
  def setPermissionCheckHandler(
    handler: js.Function4[
      /* webContents */ WebContents, 
      /* permission */ java.lang.String, 
      /* requestingOrigin */ java.lang.String, 
      /* details */ PermissionCheckHandlerDetails, 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def setPermissionRequestHandler(): scala.Unit = js.native
  /**
    * Sets the handler which can be used to respond to permission requests for the
    * session. Calling callback(true) will allow the permission and callback(false)
    * will reject it. To clear the handler, call setPermissionRequestHandler(null).
    */
  def setPermissionRequestHandler(
    handler: js.Function4[
      /* webContents */ WebContents, 
      /* permission */ java.lang.String, 
      /* callback */ js.Function1[/* permissionGranted */ scala.Boolean, scala.Unit], 
      /* details */ PermissionRequestHandlerDetails, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Adds scripts that will be executed on ALL web contents that are associated with
    * this session just before normal preload scripts run.
    */
  def setPreloads(preloads: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Sets the proxy settings. When pacScript and proxyRules are provided together,
    * the proxyRules option is ignored and pacScript configuration is applied. The
    * proxyRules has to follow the rules below: For example: The proxyBypassRules is a
    * comma separated list of rules described below:
    */
  def setProxy(config: Config, callback: js.Function): scala.Unit = js.native
  /**
    * Overrides the userAgent and acceptLanguages for this session. The
    * acceptLanguages must a comma separated ordered list of language codes, for
    * example "en-US,fr,de,ko,zh-CN,ja". This doesn't affect existing WebContents, and
    * each WebContents can use webContents.setUserAgent to override the session-wide
    * user agent.
    */
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
  def setUserAgent(userAgent: java.lang.String, acceptLanguages: java.lang.String): scala.Unit = js.native
}

@JSGlobal("Electron.session")
@js.native
class sessionCls () extends Session

/* static members */
@JSGlobal("Electron.Session")
@js.native
object Session extends js.Object {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[electronLib.ElectronNs.Session] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: java.lang.String): electronLib.ElectronNs.Session = js.native
  def fromPartition(partition: java.lang.String, options: electronLib.ElectronNs.FromPartitionOptions): electronLib.ElectronNs.Session = js.native
}

