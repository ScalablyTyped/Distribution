package typings.expo

import typings.expo.buildUpdatesUpdatesMod.UpdateCheckResult
import typings.expo.buildUpdatesUpdatesMod.UpdateEvent
import typings.expo.buildUpdatesUpdatesMod.UpdateFetchResult
import typings.expoDashConstants.buildConstantsDotTypesMod.AppManifest
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Updates/Updates", JSImport.Namespace)
@js.native
object buildUpdatesUpdatesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expo.Anon_False
    - typings.expo.Anon_IsAvailable
  */
  trait UpdateCheckResult extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.Anon_DownloadProgress
    - typings.expo.Anon_DownloadFinished
    - typings.expo.Anon_ErrorMessage
  */
  trait UpdateEvent extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.Anon_FalseIsNew
    - typings.expo.Anon_IsNew
  */
  trait UpdateFetchResult extends js.Object
  
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
  
  type Manifest = AppManifest
  type UpdateEventListener = js.Function1[/* event */ UpdateEvent, Unit]
}

