package typings.electron.Electron

import typings.electron.electronStrings.cancelled
import typings.electron.electronStrings.completed
import typings.electron.electronStrings.done
import typings.electron.electronStrings.interrupted
import typings.electron.electronStrings.progressing
import typings.electron.electronStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.DownloadItem")
@js.native
class DownloadItem () extends EventEmitter {
  def addListener(
    event: done,
    listener: js.Function2[/* event */ Event, /* state */ completed | cancelled | interrupted, Unit]
  ): this.type = js.native
  def addListener(
    event: updated,
    listener: js.Function2[/* event */ Event, /* state */ progressing | interrupted, Unit]
  ): this.type = js.native
  def canResume(): Boolean = js.native
  /**
    * Cancels the download operation.
    */
  def cancel(): Unit = js.native
  def getContentDisposition(): String = js.native
  def getETag(): String = js.native
  /**
    * Note: The file name is not always the same as the actual one saved in local
    * disk. If user changes the file name in a prompted download saving dialog, the
    * actual name of saved file will be different.
    */
  def getFilename(): String = js.native
  def getLastModifiedTime(): String = js.native
  def getMimeType(): String = js.native
  def getReceivedBytes(): Double = js.native
  def getSaveDialogOptions(): SaveDialogOptions = js.native
  def getSavePath(): String = js.native
  def getStartTime(): Double = js.native
  /**
    * Note: The following methods are useful specifically to resume a cancelled item
    * when session is restarted.
    */
  def getState(): progressing | completed | cancelled | interrupted = js.native
  /**
    * If the size is unknown, it returns 0.
    */
  def getTotalBytes(): Double = js.native
  def getURL(): String = js.native
  def getURLChain(): js.Array[String] = js.native
  def hasUserGesture(): Boolean = js.native
  def isPaused(): Boolean = js.native
  // Docs: http://electronjs.org/docs/api/download-item
  /**
    * Emitted when the download is in a terminal state. This includes a completed
    * download, a cancelled download (via downloadItem.cancel()), and interrupted
    * download that can't be resumed. The state can be one of following:
    */
  def on(
    event: done,
    listener: js.Function2[/* event */ Event, /* state */ completed | cancelled | interrupted, Unit]
  ): this.type = js.native
  /**
    * Emitted when the download has been updated and is not done. The state can be one
    * of following:
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
    * Resumes the download that has been paused. Note: To enable resumable downloads
    * the server you are downloading from must support range requests and provide both
    * Last-Modified and ETag header values. Otherwise resume() will dismiss previously
    * received bytes and restart the download from the beginning.
    */
  def resume(): Unit = js.native
  /**
    * This API allows the user to set custom options for the save dialog that opens
    * for the download item by default. The API is only available in session's
    * will-download callback function.
    */
  def setSaveDialogOptions(options: SaveDialogOptions): Unit = js.native
  /**
    * The API is only available in session's will-download callback function. If user
    * doesn't set the save path via the API, Electron will use the original routine to
    * determine the save path(Usually prompts a save dialog).
    */
  def setSavePath(path: String): Unit = js.native
}

