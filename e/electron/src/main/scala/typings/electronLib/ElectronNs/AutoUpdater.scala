package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoUpdater extends EventEmitter {
  @JSName("addListener")
  def `addListener_before-quit-for-update`(event: electronLib.electronLibStrings.`before-quit-for-update`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_checking-for-update`(event: electronLib.electronLibStrings.`checking-for-update`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_update-available`(event: electronLib.electronLibStrings.`update-available`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_update-downloaded`(
    event: electronLib.electronLibStrings.`update-downloaded`,
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ java.lang.String, 
      /* releaseName */ java.lang.String, 
      /* releaseDate */ stdLib.Date, 
      /* updateURL */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_update-not-available`(event: electronLib.electronLibStrings.`update-not-available`, listener: js.Function): this.type = js.native
  /**
       * Asks the server whether there is an update. You must call setFeedURL before
       * using this API.
       */
  def checkForUpdates(): scala.Unit = js.native
  def getFeedURL(): java.lang.String = js.native
  // Docs: http://electron.atom.io/docs/api/auto-updater
  /**
       * This event is emitted after a user calls quitAndInstall(). When this API is
       * called, the before-quit event is not emitted before all windows are closed. As a
       * result you should listen to this event if you wish to perform actions before the
       * windows are closed while a process is quitting, as well as listening to
       * before-quit.
       */
  @JSName("on")
  def `on_before-quit-for-update`(event: electronLib.electronLibStrings.`before-quit-for-update`, listener: js.Function): this.type = js.native
  /**
       * Emitted when checking if an update has started.
       */
  @JSName("on")
  def `on_checking-for-update`(event: electronLib.electronLibStrings.`checking-for-update`, listener: js.Function): this.type = js.native
  /**
       * Emitted when there is an error while updating.
       */
  @JSName("on")
  def on_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /**
       * Emitted when there is an available update. The update is downloaded
       * automatically.
       */
  @JSName("on")
  def `on_update-available`(event: electronLib.electronLibStrings.`update-available`, listener: js.Function): this.type = js.native
  /**
       * Emitted when an update has been downloaded. On Windows only releaseName is
       * available.
       */
  @JSName("on")
  def `on_update-downloaded`(
    event: electronLib.electronLibStrings.`update-downloaded`,
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ java.lang.String, 
      /* releaseName */ java.lang.String, 
      /* releaseDate */ stdLib.Date, 
      /* updateURL */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when there is no available update.
       */
  @JSName("on")
  def `on_update-not-available`(event: electronLib.electronLibStrings.`update-not-available`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_before-quit-for-update`(event: electronLib.electronLibStrings.`before-quit-for-update`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_checking-for-update`(event: electronLib.electronLibStrings.`checking-for-update`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_update-available`(event: electronLib.electronLibStrings.`update-available`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_update-downloaded`(
    event: electronLib.electronLibStrings.`update-downloaded`,
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ java.lang.String, 
      /* releaseName */ java.lang.String, 
      /* releaseDate */ stdLib.Date, 
      /* updateURL */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_update-not-available`(event: electronLib.electronLibStrings.`update-not-available`, listener: js.Function): this.type = js.native
  /**
       * Restarts the app and installs the update after it has been downloaded. It should
       * only be called after update-downloaded has been emitted. Under the hood calling
       * autoUpdater.quitAndInstall() will close all application windows first, and
       * automatically call app.quit() after all windows have been closed. Note: If the
       * application is quit without calling this API after the update-downloaded event
       * has been emitted, the application will still be replaced by the updated one on
       * the next run.
       */
  def quitAndInstall(): scala.Unit = js.native
  @JSName("removeListener")
  def `removeListener_before-quit-for-update`(event: electronLib.electronLibStrings.`before-quit-for-update`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_checking-for-update`(event: electronLib.electronLibStrings.`checking-for-update`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_update-available`(event: electronLib.electronLibStrings.`update-available`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_update-downloaded`(
    event: electronLib.electronLibStrings.`update-downloaded`,
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ java.lang.String, 
      /* releaseName */ java.lang.String, 
      /* releaseDate */ stdLib.Date, 
      /* updateURL */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_update-not-available`(event: electronLib.electronLibStrings.`update-not-available`, listener: js.Function): this.type = js.native
  /**
       * Sets the url and initialize the auto updater.
       */
  def setFeedURL(options: FeedURLOptions): scala.Unit = js.native
}

