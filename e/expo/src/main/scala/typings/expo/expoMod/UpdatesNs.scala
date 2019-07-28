package typings.expo.expoMod

import typings.expo.expoMod.ConstantsNs.Manifest
import typings.expo.expoMod.UpdatesNs.EventTypeNs.DownloadFinished
import typings.expo.expoMod.UpdatesNs.EventTypeNs.DownloadProgress
import typings.expo.expoMod.UpdatesNs.EventTypeNs.DownloadStart
import typings.expo.expoMod.UpdatesNs.EventTypeNs.Error
import typings.expo.expoMod.UpdatesNs.EventTypeNs.NoUpdateAvailable
import typings.expo.expoMod.UpdatesNs.FetchUpdateAsyncParams
import typings.expo.expoMod.UpdatesNs.UpdateBundle
import typings.expo.expoMod.UpdatesNs.UpdateCheck
import typings.expo.expoMod.UpdatesNs.UpdateEvent
import typings.expo.expoMod.UpdatesNs.UpdateEventListener
import typings.expo.expoStrings.downloadFinished
import typings.expo.expoStrings.downloadProgress
import typings.expo.expoStrings.downloadStart
import typings.expo.expoStrings.error
import typings.expo.expoStrings.noUpdateAvailable
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Updates")
@js.native
object UpdatesNs extends js.Object {
  /** An optional params object passed to fetchUpdateAsync. */
  trait FetchUpdateAsyncParams extends js.Object {
    var eventListener: UpdateEventListener
  }
  
  trait UpdateBundle extends js.Object {
    /** True if the fetched bundle is new (i.e. a different version that the what's currently running). */
    var isNew: Boolean
    /** Manifest of the fetched update. */
    var manifest: Manifest
  }
  
  trait UpdateCheck extends js.Object {
    /** True if an update is available, false if you're already running the most up-to-date JS bundle. */
    var isAvailable: Boolean
    /** If `isAvailable` is true, the manifest of the available update. Undefined otherwise. */
    var manifest: js.UndefOr[Manifest] = js.undefined
  }
  
  /** An object that is passed into each event listener when a new version is available. */
  trait UpdateEvent extends js.Object {
    /** If `type === Expo.Updates.EventType.DOWNLOAD_FINISHED`, the manifest of the newly downloaded update. Undefined otherwise. */
    var manifest: js.UndefOr[Manifest] = js.undefined
    /** If `type === Expo.Updates.EventType.ERROR`, the error message. Undefined otherwise. */
    var message: js.UndefOr[String] = js.undefined
    /** Type of the event */
    var `type`: DownloadStart | DownloadProgress | DownloadFinished | NoUpdateAvailable | Error
  }
  
  /**
    * Invokes a callback when updates-related events occur,
    * either on the initial app load or as a result of a call to `Expo.Updates.fetchUpdateAsync`.
    */
  def addListener(listener: UpdateEventListener): EventSubscription = js.native
  /**
    * Check if a new published version of your project is available.
    * Does not actually download the update.
    * Rejects if `updates.enabled` is `false` in app.json.
    */
  def checkForUpdateAsync(): js.Promise[UpdateCheck] = js.native
  /**
    * Downloads the most recent published version of your experience to the device's local cache.
    * Rejects if `updates.enabled` is `false` in app.json.
    */
  def fetchUpdateAsync(): js.Promise[UpdateBundle] = js.native
  def fetchUpdateAsync(params: FetchUpdateAsyncParams): js.Promise[UpdateBundle] = js.native
  /**
    * Immediately reloads the current experience.
    * This will use your app.json updates configuration to fetch and load the newest available JS supported by the device's Expo environment.
    * This is useful for triggering an update of your experience if you have published a new version.
    */
  def reload(): Unit = js.native
  /**
    * Immediately reloads the current experience using the most recent cached version.
    * This is useful for triggering an update of your experience if you have published and already downloaded a new version.
    */
  def reloadFromCache(): Unit = js.native
  @JSName("EventType")
  @js.native
  object EventTypeNs extends js.Object {
    /** A new update has finished downloading and is now stored in the device's cache. */
    val DOWNLOAD_FINISHED: DownloadFinished = js.native
    /** A new update is currently being downloaded and will be stored in the device's cache. */
    val DOWNLOAD_PROGRESS: DownloadProgress = js.native
    /** A new update is available and has started downloading. */
    val DOWNLOAD_STARTED: DownloadStart = js.native
    /** An error occurred trying to fetch the latest update. */
    val ERROR: Error = js.native
    /** No updates are available, and the most up-to-date bundle of this experience is already running. */
    val NO_UPDATE_AVAILABLE: NoUpdateAvailable = js.native
    /** A new update has finished downloading and is now stored in the device's cache. */
    type DownloadFinished = downloadFinished
    /** A new update is currently being downloaded and will be stored in the device's cache. */
    type DownloadProgress = downloadProgress
    /** A new update is available and has started downloading. */
    type DownloadStart = downloadStart
    /** An error occurred trying to fetch the latest update. */
    type Error = error
    /** No updates are available, and the most up-to-date bundle of this experience is already running. */
    type NoUpdateAvailable = noUpdateAvailable
  }
  
  type UpdateEventListener = js.Function1[/* event */ UpdateEvent, js.Any]
}

