package typings.firebaseFirestore.distInternalMod

import typings.firebaseFirestore.anon.OmitPersistentCacheSettin
import typings.firebaseFirestore.firebaseFirestoreStrings.persistentSingleTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistentSingleTabManager_
  extends StObject
     with PersistentTabManager {
  
  /**
    * @internal
    */
  def _initialize(): Unit = js.native
  def _initialize(settings: OmitPersistentCacheSettin): Unit = js.native
  
  /**
    * @internal
    */
  var _offlineComponentProvider: js.UndefOr[OfflineComponentProvider] = js.native
  
  /**
    * @internal
    */
  var _onlineComponentProvider: js.UndefOr[OnlineComponentProvider] = js.native
  
  var kind: persistentSingleTab = js.native
}
