package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distInternalMod.MemoryLocalCache_
  - typings.firebaseFirestore.distInternalMod.PersistentLocalCache_
*/
trait FirestoreLocalCache extends StObject
object FirestoreLocalCache {
  
  inline def MemoryLocalCache_(
    _offlineComponentProvider: MemoryOfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): typings.firebaseFirestore.distInternalMod.MemoryLocalCache_ = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "memory")
    __obj.asInstanceOf[typings.firebaseFirestore.distInternalMod.MemoryLocalCache_]
  }
  
  inline def PersistentLocalCache_(
    _offlineComponentProvider: OfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): typings.firebaseFirestore.distInternalMod.PersistentLocalCache_ = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "persistent")
    __obj.asInstanceOf[typings.firebaseFirestore.distInternalMod.PersistentLocalCache_]
  }
}
