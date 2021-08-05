package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.downloads.DownloadItem
import typings.firefoxWebextBrowser.browser.downloads.DownloadOptions
import typings.firefoxWebextBrowser.browser.downloads.DownloadQuery
import typings.firefoxWebextBrowser.browser.downloads.GetFileIconOptions
import typings.firefoxWebextBrowser.browser.downloads.OnChangedDownloadDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `downloads`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object downloads {
  
  @JSGlobal("browser.downloads")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Prompt the user to either accept or cancel a dangerous download. `acceptDanger()` does not automatically accept dangerous downloads.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def acceptDanger(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptDanger")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Cancel a download. When `callback` is run, the download is cancelled, completed, interrupted or doesn't exist anymore.
    * @param downloadId The id of the download to cancel.
    */
  inline def cancel(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* downloads functions */
  /**
    * Download a URL. If the URL uses the HTTP[S] protocol, then the request will include all cookies currently set for its hostname. If both `filename` and `saveAs` are specified, then the Save As dialog will be displayed, pre-populated with the specified `filename`. If the download started successfully, `callback` will be called with the new DownloadItem's `downloadId`. If there was an error starting the download, then `callback` will be called with `downloadId=undefined` and browser.extension.lastError will contain a descriptive string. The error strings are not guaranteed to remain backwards compatible between releases. You must not parse it.
    * @param options What to download and how.
    */
  inline def download(options: DownloadOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  /**
    * Initiate dragging the file to another application.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def drag(downloadId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drag")(downloadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Erase matching DownloadItems from history */
  inline def erase(query: DownloadQuery): js.Promise[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double]]]
  
  /**
    * Retrieve an icon for the specified download. For new downloads, file icons are available after the onCreated event has been received. The image returned by this function while a download is in progress may be different from the image returned after the download is complete. Icon retrieval is done by querying the underlying operating system or toolkit depending on the platform. The icon that is returned will therefore depend on a number of factors including state of the download, platform, registered file types and visual theme. If a file icon cannot be determined, browser.extension.lastError will contain an error message.
    * @param downloadId The identifier for the download.
    */
  inline def getFileIcon(downloadId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getFileIcon(downloadId: Double, options: GetFileIconOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(downloadId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * When any of a DownloadItem's properties except `bytesReceived` changes, this event fires with the `downloadId` and an object containing the properties that changed.
    */
  @JSGlobal("browser.downloads.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function1[/* downloadDelta */ OnChangedDownloadDelta, Unit]] = js.native
  
  /* downloads events */
  /** This event fires with the DownloadItem object when a download begins. */
  @JSGlobal("browser.downloads.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* downloadItem */ DownloadItem, Unit]] = js.native
  
  /**
    * Fires with the `downloadId` when a download is erased from history.
    * @param downloadId The `id` of the DownloadItem that was erased.
    */
  @JSGlobal("browser.downloads.onErased")
  @js.native
  val onErased: WebExtEvent[js.Function1[/* downloadId */ Double, Unit]] = js.native
  
  /** Open the downloaded file. */
  inline def open(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Pause the download. If the request was successful the download is in a paused state. Otherwise browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to pause.
    */
  inline def pause(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeFile(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Resume a paused download. If the request was successful the download is in progress and unpaused. Otherwise browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to resume.
    */
  inline def resume(downloadId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Find DownloadItems. Set `query` to the empty object to get all DownloadItems. To get a specific DownloadItem, set only the `id` field.
    */
  inline def search(query: DownloadQuery): js.Promise[js.Array[DownloadItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DownloadItem]]]
  
  /** @deprecated Unsupported on Firefox at this time. */
  inline def setShelfEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShelfEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Show the downloaded file in its folder in a file manager. */
  inline def show(downloadId: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(downloadId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def showDefaultFolder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showDefaultFolder")().asInstanceOf[Unit]
}
