package typings.electron.Electron

import typings.electron.electronStrings.cancelled
import typings.electron.electronStrings.completed
import typings.electron.electronStrings.done
import typings.electron.electronStrings.interrupted
import typings.electron.electronStrings.progressing
import typings.electron.electronStrings.updated
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadItem extends EventEmitter {
  
  def addListener(
    event: done,
    listener: js.Function2[/* event */ Event, /* state */ completed | cancelled | interrupted, Unit]
  ): this.type = js.native
  def addListener(
    event: updated,
    listener: js.Function2[/* event */ Event, /* state */ progressing | interrupted, Unit]
  ): this.type = js.native
  
  /**
    * Whether the download can resume.
    */
  def canResume(): Boolean = js.native
  
  /**
    * Cancels the download operation.
    */
  def cancel(): Unit = js.native
  
  /**
    * The Content-Disposition field from the response header.
    */
  def getContentDisposition(): String = js.native
  
  /**
    * ETag header value.
    */
  def getETag(): String = js.native
  
  /**
    * The file name of the download item.
    *
    * **Note:** The file name is not always the same as the actual one saved in local
    * disk. If user changes the file name in a prompted download saving dialog, the
    * actual name of saved file will be different.
    */
  def getFilename(): String = js.native
  
  /**
    * Last-Modified header value.
    */
  def getLastModifiedTime(): String = js.native
  
  /**
    * The files mime type.
    */
  def getMimeType(): String = js.native
  
  /**
    * The received bytes of the download item.
    */
  def getReceivedBytes(): Double = js.native
  
  /**
    * Returns the object previously set by
    * `downloadItem.setSaveDialogOptions(options)`.
    */
  def getSaveDialogOptions(): SaveDialogOptions = js.native
  
  /**
    * The save path of the download item. This will be either the path set via
    * `downloadItem.setSavePath(path)` or the path selected from the shown save
    * dialog.
    */
  def getSavePath(): String = js.native
  
  /**
    * Number of seconds since the UNIX epoch when the download was started.
    */
  def getStartTime(): Double = js.native
  
  /**
    * The current state. Can be `progressing`, `completed`, `cancelled` or
    * `interrupted`.
    *
    * **Note:** The following methods are useful specifically to resume a `cancelled`
    * item when session is restarted.
    */
  def getState(): progressing | completed | cancelled | interrupted = js.native
  
  /**
    * The total size in bytes of the download item.
    * 
  If the size is unknown, it returns 0.
    */
  def getTotalBytes(): Double = js.native
  
  /**
    * The origin URL where the item is downloaded from.
    */
  def getURL(): String = js.native
  
  /**
    * The complete URL chain of the item including any redirects.
    */
  def getURLChain(): js.Array[String] = js.native
  
  /**
    * Whether the download has user gesture.
    */
  def hasUserGesture(): Boolean = js.native
  
  /**
    * Whether the download is paused.
    */
  def isPaused(): Boolean = js.native
  
  // Docs: https://electronjs.org/docs/api/download-item
  /**
    * Emitted when the download is in a terminal state. This includes a completed
    * download, a cancelled download (via `downloadItem.cancel()`), and interrupted
    * download that can't be resumed.
    *
    * The `state` can be one of following:
    *
    * * `completed` - The download completed successfully.
    * * `cancelled` - The download has been cancelled.
    * * `interrupted` - The download has interrupted and can not resume.
    */
  def on(
    event: done,
    listener: js.Function2[/* event */ Event, /* state */ completed | cancelled | interrupted, Unit]
  ): this.type = js.native
  /**
    * Emitted when the download has been updated and is not done.
    *
    * The `state` can be one of following:
    *
    * * `progressing` - The download is in-progress.
    * * `interrupted` - The download has interrupted and can be resumed.
    */
  def on(
    event: updated,
    listener: js.Function2[/* event */ Event, /* state */ progressing | interrupted, Unit]
  ): this.type = js.native
  
  def once(
    event: done,
    listener: js.Function2[/* event */ Event, /* state */ completed | cancelled | interrupted, Unit]
  ): this.type = js.native
  def once(
    event: updated,
    listener: js.Function2[/* event */ Event, /* state */ progressing | interrupted, Unit]
  ): this.type = js.native
  
  /**
    * Pauses the download.
    */
  def pause(): Unit = js.native
  
  def removeListener(
    event: done,
    listener: js.Function2[/* event */ Event, /* state */ completed | cancelled | interrupted, Unit]
  ): this.type = js.native
  def removeListener(
    event: updated,
    listener: js.Function2[/* event */ Event, /* state */ progressing | interrupted, Unit]
  ): this.type = js.native
  
  /**
    * Resumes the download that has been paused.
    *
    * **Note:** To enable resumable downloads the server you are downloading from must
    * support range requests and provide both `Last-Modified` and `ETag` header
    * values. Otherwise `resume()` will dismiss previously received bytes and restart
    * the download from the beginning.
    */
  def resume(): Unit = js.native
  
  var savePath: String = js.native
  
  /**
    * This API allows the user to set custom options for the save dialog that opens
    * for the download item by default. The API is only available in session's
    * `will-download` callback function.
    */
  def setSaveDialogOptions(options: SaveDialogOptions): Unit = js.native
  
  /**
    * The API is only available in session's `will-download` callback function. If
    * user doesn't set the save path via the API, Electron will use the original
    * routine to determine the save path; this usually prompts a save dialog.
    */
  def setSavePath(path: String): Unit = js.native
}
