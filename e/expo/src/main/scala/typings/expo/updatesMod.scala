package typings.expo

import typings.expoConstants.constantsTypesMod.AppManifest
import typings.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Updates/Updates", JSImport.Namespace)
@js.native
object updatesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expo.AnonIsAvailable
    - typings.expo.AnonManifest
  */
  trait UpdateCheckResult extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.Anon0
    - typings.expo.AnonManifestType
    - typings.expo.AnonMessage
  */
  trait UpdateEvent extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.AnonIsNew
    - typings.expo.AnonIsNewManifest
  */
  trait UpdateFetchResult extends js.Object
  
  def addListener(listener: js.Function): EventSubscription = js.native
  def checkForUpdateAsync(): js.Promise[UpdateCheckResult] = js.native
  def clearUpdateCacheExperimentalAsync(abiVersion: String): js.Promise[Unit] = js.native
  def fetchUpdateAsync(): js.Promise[UpdateFetchResult] = js.native
  def fetchUpdateAsync(hasEventListener: AnonEventListener): js.Promise[UpdateFetchResult] = js.native
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

