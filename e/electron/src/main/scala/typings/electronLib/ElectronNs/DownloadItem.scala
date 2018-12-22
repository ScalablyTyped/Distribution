package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.DownloadItem")
@js.native
class DownloadItem () extends EventEmitter {
  def addListener(
    event: electronLib.electronLibStrings.done,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.completed | electronLib.electronLibStrings.cancelled | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  def addListener(
    event: electronLib.electronLibStrings.updated,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.progressing | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  def canResume(): scala.Boolean = js.native
  /**
       * Cancels the download operation.
       */
  def cancel(): scala.Unit = js.native
  def getContentDisposition(): java.lang.String = js.native
  def getETag(): java.lang.String = js.native
  /**
       * Note: The file name is not always the same as the actual one saved in local
       * disk. If user changes the file name in a prompted download saving dialog, the
       * actual name of saved file will be different.
       */
  def getFilename(): java.lang.String = js.native
  def getLastModifiedTime(): java.lang.String = js.native
  def getMimeType(): java.lang.String = js.native
  def getReceivedBytes(): scala.Double = js.native
  def getSavePath(): java.lang.String = js.native
  def getStartTime(): scala.Double = js.native
  /**
       * Note: The following methods are useful specifically to resume a cancelled item
       * when session is restarted.
       */
  def getState(): electronLib.electronLibStrings.progressing | electronLib.electronLibStrings.completed | electronLib.electronLibStrings.cancelled | electronLib.electronLibStrings.interrupted = js.native
  /**
       * If the size is unknown, it returns 0.
       */
  def getTotalBytes(): scala.Double = js.native
  def getURL(): java.lang.String = js.native
  def getURLChain(): js.Array[java.lang.String] = js.native
  def hasUserGesture(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  // Docs: http://electronjs.org/docs/api/download-item
  /**
       * Emitted when the download is in a terminal state. This includes a completed
       * download, a cancelled download (via downloadItem.cancel()), and interrupted
       * download that can't be resumed. The state can be one of following:
       */
  def on(
    event: electronLib.electronLibStrings.done,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.completed | electronLib.electronLibStrings.cancelled | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the download has been updated and is not done. The state can be one
       * of following:
       */
  def on(
    event: electronLib.electronLibStrings.updated,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.progressing | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(
    event: electronLib.electronLibStrings.done,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.completed | electronLib.electronLibStrings.cancelled | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(
    event: electronLib.electronLibStrings.updated,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.progressing | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Pauses the download.
       */
  def pause(): scala.Unit = js.native
  def removeListener(
    event: electronLib.electronLibStrings.done,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.completed | electronLib.electronLibStrings.cancelled | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  def removeListener(
    event: electronLib.electronLibStrings.updated,
    listener: js.Function2[
      /* event */ Event, 
      /* state */ electronLib.electronLibStrings.progressing | electronLib.electronLibStrings.interrupted, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Resumes the download that has been paused. Note: To enable resumable downloads
       * the server you are downloading from must support range requests and provide both
       * Last-Modified and ETag header values. Otherwise resume() will dismiss previously
       * received bytes and restart the download from the beginning.
       */
  def resume(): scala.Unit = js.native
  /**
       * The API is only available in session's will-download callback function. If user
       * doesn't set the save path via the API, Electron will use the original routine to
       * determine the save path(Usually prompts a save dialog).
       */
  def setSavePath(path: java.lang.String): scala.Unit = js.native
}

