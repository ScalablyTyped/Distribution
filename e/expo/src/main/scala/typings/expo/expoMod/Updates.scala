package typings.expo.expoMod

import typings.expo.Anon_EventListener
import typings.expo.buildUpdatesUpdatesMod.UpdateCheckResult
import typings.expo.buildUpdatesUpdatesMod.UpdateFetchResult
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Updates")
@js.native
object Updates extends js.Object {
  def addListener(listener: js.Function): EventSubscription = js.native
  def checkForUpdateAsync(): js.Promise[UpdateCheckResult] = js.native
  def clearUpdateCacheExperimentalAsync(abiVersion: String): js.Promise[Unit] = js.native
  def fetchUpdateAsync(): js.Promise[UpdateFetchResult] = js.native
  def fetchUpdateAsync(hasEventListener: Anon_EventListener): js.Promise[UpdateFetchResult] = js.native
  def reload(): js.Promise[Unit] = js.native
  def reloadFromCache(): js.Promise[Unit] = js.native
  @js.native
  object EventType extends js.Object {
    var DOWNLOAD_FINISHED: String = js.native
    var DOWNLOAD_PROGRESS: String = js.native
    var DOWNLOAD_STARTED: String = js.native
    var ERROR: String = js.native
    var NO_UPDATE_AVAILABLE: String = js.native
  }
  
}

