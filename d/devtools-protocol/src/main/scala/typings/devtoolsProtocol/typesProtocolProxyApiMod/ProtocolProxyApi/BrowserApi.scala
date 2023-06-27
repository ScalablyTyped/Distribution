package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.downloadProgress
import typings.devtoolsProtocol.devtoolsProtocolStrings.downloadWillBegin
import typings.devtoolsProtocol.mod.Protocol.Browser.AddPrivacySandboxEnrollmentOverrideRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.CancelDownloadRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.DownloadProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Browser.DownloadWillBeginEvent
import typings.devtoolsProtocol.mod.Protocol.Browser.ExecuteBrowserCommandRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetBrowserCommandLineResponse
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramResponse
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsResponse
import typings.devtoolsProtocol.mod.Protocol.Browser.GetVersionResponse
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsResponse
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetResponse
import typings.devtoolsProtocol.mod.Protocol.Browser.GrantPermissionsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.ResetPermissionsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.SetDockTileRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.SetPermissionRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.SetWindowBoundsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserApi extends StObject {
  
  /**
    * Allows a site to use privacy sandbox features that require enrollment
    * without the site actually being enrolled. Only supported on page targets.
    */
  def addPrivacySandboxEnrollmentOverride(params: AddPrivacySandboxEnrollmentOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Cancel a download if in progress
    */
  def cancelDownload(params: CancelDownloadRequest): js.Promise[Unit] = js.native
  
  /**
    * Close browser gracefully.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Crashes browser on the main thread.
    */
  def crash(): js.Promise[Unit] = js.native
  
  /**
    * Crashes GPU process.
    */
  def crashGpuProcess(): js.Promise[Unit] = js.native
  
  /**
    * Invoke custom browser commands used by telemetry.
    */
  def executeBrowserCommand(params: ExecuteBrowserCommandRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns the command line switches for the browser process if, and only if
    * --enable-automation is on the commandline.
    */
  def getBrowserCommandLine(): js.Promise[GetBrowserCommandLineResponse] = js.native
  
  /**
    * Get a Chrome histogram by name.
    */
  def getHistogram(params: GetHistogramRequest): js.Promise[GetHistogramResponse] = js.native
  
  /**
    * Get Chrome histograms.
    */
  def getHistograms(params: GetHistogramsRequest): js.Promise[GetHistogramsResponse] = js.native
  
  /**
    * Returns version information.
    */
  def getVersion(): js.Promise[GetVersionResponse] = js.native
  
  /**
    * Get position and size of the browser window.
    */
  def getWindowBounds(params: GetWindowBoundsRequest): js.Promise[GetWindowBoundsResponse] = js.native
  
  /**
    * Get the browser window that contains the devtools target.
    */
  def getWindowForTarget(params: GetWindowForTargetRequest): js.Promise[GetWindowForTargetResponse] = js.native
  
  /**
    * Grant specific permissions to the given origin and reject all others.
    */
  def grantPermissions(params: GrantPermissionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Fired when download makes progress. Last call has |done| == true.
    */
  @JSName("on")
  def on_downloadProgress(event: downloadProgress, listener: js.Function1[/* params */ DownloadProgressEvent, Unit]): Unit = js.native
  /**
    * Fired when page is about to start a download.
    */
  @JSName("on")
  def on_downloadWillBegin(event: downloadWillBegin, listener: js.Function1[/* params */ DownloadWillBeginEvent, Unit]): Unit = js.native
  
  /**
    * Reset all permission management for all origins.
    */
  def resetPermissions(params: ResetPermissionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Set dock tile details, platform-specific.
    */
  def setDockTile(params: SetDockTileRequest): js.Promise[Unit] = js.native
  
  /**
    * Set the behavior when downloading a file.
    */
  def setDownloadBehavior(params: SetDownloadBehaviorRequest): js.Promise[Unit] = js.native
  
  /**
    * Set permission settings for given origin.
    */
  def setPermission(params: SetPermissionRequest): js.Promise[Unit] = js.native
  
  /**
    * Set position and/or size of the browser window.
    */
  def setWindowBounds(params: SetWindowBoundsRequest): js.Promise[Unit] = js.native
}
