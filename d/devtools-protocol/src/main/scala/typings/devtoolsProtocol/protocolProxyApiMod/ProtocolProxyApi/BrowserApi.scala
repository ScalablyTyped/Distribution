package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

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

trait BrowserApi extends StObject {
  
  /**
    * Close browser gracefully.
    */
  def close(): js.Promise[Unit]
  
  /**
    * Crashes browser on the main thread.
    */
  def crash(): js.Promise[Unit]
  
  /**
    * Crashes GPU process.
    */
  def crashGpuProcess(): js.Promise[Unit]
  
  /**
    * Returns the command line switches for the browser process if, and only if
    * --enable-automation is on the commandline.
    */
  def getBrowserCommandLine(): js.Promise[GetBrowserCommandLineResponse]
  
  /**
    * Get a Chrome histogram by name.
    */
  def getHistogram(params: GetHistogramRequest): js.Promise[GetHistogramResponse]
  
  /**
    * Get Chrome histograms.
    */
  def getHistograms(params: GetHistogramsRequest): js.Promise[GetHistogramsResponse]
  
  /**
    * Returns version information.
    */
  def getVersion(): js.Promise[GetVersionResponse]
  
  /**
    * Get position and size of the browser window.
    */
  def getWindowBounds(params: GetWindowBoundsRequest): js.Promise[GetWindowBoundsResponse]
  
  /**
    * Get the browser window that contains the devtools target.
    */
  def getWindowForTarget(params: GetWindowForTargetRequest): js.Promise[GetWindowForTargetResponse]
  
  /**
    * Grant specific permissions to the given origin and reject all others.
    */
  def grantPermissions(params: GrantPermissionsRequest): js.Promise[Unit]
  
  /**
    * Reset all permission management for all origins.
    */
  def resetPermissions(params: ResetPermissionsRequest): js.Promise[Unit]
  
  /**
    * Set dock tile details, platform-specific.
    */
  def setDockTile(params: SetDockTileRequest): js.Promise[Unit]
  
  /**
    * Set the behavior when downloading a file.
    */
  def setDownloadBehavior(params: SetDownloadBehaviorRequest): js.Promise[Unit]
  
  /**
    * Set permission settings for given origin.
    */
  def setPermission(params: SetPermissionRequest): js.Promise[Unit]
  
  /**
    * Set position and/or size of the browser window.
    */
  def setWindowBounds(params: SetWindowBoundsRequest): js.Promise[Unit]
}
object BrowserApi {
  
  inline def apply(
    close: () => js.Promise[Unit],
    crash: () => js.Promise[Unit],
    crashGpuProcess: () => js.Promise[Unit],
    getBrowserCommandLine: () => js.Promise[GetBrowserCommandLineResponse],
    getHistogram: GetHistogramRequest => js.Promise[GetHistogramResponse],
    getHistograms: GetHistogramsRequest => js.Promise[GetHistogramsResponse],
    getVersion: () => js.Promise[GetVersionResponse],
    getWindowBounds: GetWindowBoundsRequest => js.Promise[GetWindowBoundsResponse],
    getWindowForTarget: GetWindowForTargetRequest => js.Promise[GetWindowForTargetResponse],
    grantPermissions: GrantPermissionsRequest => js.Promise[Unit],
    resetPermissions: ResetPermissionsRequest => js.Promise[Unit],
    setDockTile: SetDockTileRequest => js.Promise[Unit],
    setDownloadBehavior: SetDownloadBehaviorRequest => js.Promise[Unit],
    setPermission: SetPermissionRequest => js.Promise[Unit],
    setWindowBounds: SetWindowBoundsRequest => js.Promise[Unit]
  ): BrowserApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), crash = js.Any.fromFunction0(crash), crashGpuProcess = js.Any.fromFunction0(crashGpuProcess), getBrowserCommandLine = js.Any.fromFunction0(getBrowserCommandLine), getHistogram = js.Any.fromFunction1(getHistogram), getHistograms = js.Any.fromFunction1(getHistograms), getVersion = js.Any.fromFunction0(getVersion), getWindowBounds = js.Any.fromFunction1(getWindowBounds), getWindowForTarget = js.Any.fromFunction1(getWindowForTarget), grantPermissions = js.Any.fromFunction1(grantPermissions), resetPermissions = js.Any.fromFunction1(resetPermissions), setDockTile = js.Any.fromFunction1(setDockTile), setDownloadBehavior = js.Any.fromFunction1(setDownloadBehavior), setPermission = js.Any.fromFunction1(setPermission), setWindowBounds = js.Any.fromFunction1(setWindowBounds))
    __obj.asInstanceOf[BrowserApi]
  }
  
  extension [Self <: BrowserApi](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCrash(value: () => js.Promise[Unit]): Self = StObject.set(x, "crash", js.Any.fromFunction0(value))
    
    inline def setCrashGpuProcess(value: () => js.Promise[Unit]): Self = StObject.set(x, "crashGpuProcess", js.Any.fromFunction0(value))
    
    inline def setGetBrowserCommandLine(value: () => js.Promise[GetBrowserCommandLineResponse]): Self = StObject.set(x, "getBrowserCommandLine", js.Any.fromFunction0(value))
    
    inline def setGetHistogram(value: GetHistogramRequest => js.Promise[GetHistogramResponse]): Self = StObject.set(x, "getHistogram", js.Any.fromFunction1(value))
    
    inline def setGetHistograms(value: GetHistogramsRequest => js.Promise[GetHistogramsResponse]): Self = StObject.set(x, "getHistograms", js.Any.fromFunction1(value))
    
    inline def setGetVersion(value: () => js.Promise[GetVersionResponse]): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    inline def setGetWindowBounds(value: GetWindowBoundsRequest => js.Promise[GetWindowBoundsResponse]): Self = StObject.set(x, "getWindowBounds", js.Any.fromFunction1(value))
    
    inline def setGetWindowForTarget(value: GetWindowForTargetRequest => js.Promise[GetWindowForTargetResponse]): Self = StObject.set(x, "getWindowForTarget", js.Any.fromFunction1(value))
    
    inline def setGrantPermissions(value: GrantPermissionsRequest => js.Promise[Unit]): Self = StObject.set(x, "grantPermissions", js.Any.fromFunction1(value))
    
    inline def setResetPermissions(value: ResetPermissionsRequest => js.Promise[Unit]): Self = StObject.set(x, "resetPermissions", js.Any.fromFunction1(value))
    
    inline def setSetDockTile(value: SetDockTileRequest => js.Promise[Unit]): Self = StObject.set(x, "setDockTile", js.Any.fromFunction1(value))
    
    inline def setSetDownloadBehavior(value: SetDownloadBehaviorRequest => js.Promise[Unit]): Self = StObject.set(x, "setDownloadBehavior", js.Any.fromFunction1(value))
    
    inline def setSetPermission(value: SetPermissionRequest => js.Promise[Unit]): Self = StObject.set(x, "setPermission", js.Any.fromFunction1(value))
    
    inline def setSetWindowBounds(value: SetWindowBoundsRequest => js.Promise[Unit]): Self = StObject.set(x, "setWindowBounds", js.Any.fromFunction1(value))
  }
}
