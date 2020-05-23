package typings.expo

import typings.expo.anon.EventListener
import typings.expoConstants.constantsTypesMod.AppManifest
import typings.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Updates/Updates", JSImport.Namespace)
@js.native
object updatesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expo.anon.IsAvailable
    - typings.expo.anon.Manifest
  */
  trait UpdateCheckResult extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.anon.`0`
    - typings.expo.anon.ManifestType
    - typings.expo.anon.Message
  */
  trait UpdateEvent extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.anon.IsNew
    - typings.expo.anon.IsNewManifest
  */
  trait UpdateFetchResult extends js.Object
  
  def addListener(listener: js.Function): EventSubscription = js.native
  def checkForUpdateAsync(): js.Promise[UpdateCheckResult] = js.native
  def clearUpdateCacheExperimentalAsync(abiVersion: String): js.Promise[Unit] = js.native
  def fetchUpdateAsync(): js.Promise[UpdateFetchResult] = js.native
  def fetchUpdateAsync(hasEventListener: EventListener): js.Promise[UpdateFetchResult] = js.native
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

