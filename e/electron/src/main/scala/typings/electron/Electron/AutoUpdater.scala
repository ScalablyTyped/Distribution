package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoUpdater
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_beforequitforupdate")
  def addListener(event: "before-quit-for-update", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_updateavailable")
  def addListener(event: "update-available", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_updatenotavailable")
  def addListener(event: "update-not-available", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_checkingforupdate")
  def addListener(event: "checking-for-update", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_updatedownloaded")
  def addListener(
    event: "update-downloaded",
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Asks the server whether there is an update. You must call `setFeedURL` before
    * using this API.
    *
    * **Note:** If an update is available it will be downloaded automatically. Calling
    * `autoUpdater.checkForUpdates()` twice will download the update two times.
    */
  def checkForUpdates(): Unit = js.native
  
  /**
    * The current update feed URL.
    */
  def getFeedURL(): String = js.native
  
  /**
    * Emitted when checking if an update has started.
    */
  @JSName("on")
  @scala.annotation.targetName("on_checkingforupdate")
  def on(event: "checking-for-update", listener: js.Function): this.type = js.native
  /**
    * Emitted when there is an available update. The update is downloaded
    * automatically.
    */
  @JSName("on")
  @scala.annotation.targetName("on_updateavailable")
  def on(event: "update-available", listener: js.Function): this.type = js.native
  /**
    * Emitted when there is no available update.
    */
  @JSName("on")
  @scala.annotation.targetName("on_updatenotavailable")
  def on(event: "update-not-available", listener: js.Function): this.type = js.native
  // Docs: https://electronjs.org/docs/api/auto-updater
  /**
    * This event is emitted after a user calls `quitAndInstall()`.
    *
    * When this API is called, the `before-quit` event is not emitted before all
    * windows are closed. As a result you should listen to this event if you wish to
    * perform actions before the windows are closed while a process is quitting, as
    * well as listening to `before-quit`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_beforequitforupdate")
  def on(event: "before-quit-for-update", listener: js.Function): this.type = js.native
  /**
    * Emitted when there is an error while updating.
    */
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  /**
    * Emitted when an update has been downloaded.
    *
    * On Windows only `releaseName` is available.
    *
    * **Note:** It is not strictly necessary to handle this event. A successfully
    * downloaded update will still be applied the next time the application starts.
    */
  @JSName("on")
  @scala.annotation.targetName("on_updatedownloaded")
  def on(
    event: "update-downloaded",
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_updateavailable")
  def once(event: "update-available", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_checkingforupdate")
  def once(event: "checking-for-update", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_updatenotavailable")
  def once(event: "update-not-available", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_beforequitforupdate")
  def once(event: "before-quit-for-update", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_updatedownloaded")
  def once(
    event: "update-downloaded",
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Restarts the app and installs the update after it has been downloaded. It should
    * only be called after `update-downloaded` has been emitted.
    *
    * Under the hood calling `autoUpdater.quitAndInstall()` will close all application
    * windows first, and automatically call `app.quit()` after all windows have been
    * closed.
    *
    * **Note:** It is not strictly necessary to call this function to apply an update,
    * as a successfully downloaded update will always be applied the next time the
    * application starts.
    */
  def quitAndInstall(): Unit = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_checkingforupdate")
  def removeListener(event: "checking-for-update", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_updatenotavailable")
  def removeListener(event: "update-not-available", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_updateavailable")
  def removeListener(event: "update-available", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_beforequitforupdate")
  def removeListener(event: "before-quit-for-update", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_error")
  def removeListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_updatedownloaded")
  def removeListener(
    event: "update-downloaded",
    listener: js.Function5[
      /* event */ Event, 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Sets the `url` and initialize the auto updater.
    */
  def setFeedURL(options: FeedURLOptions): Unit = js.native
}
