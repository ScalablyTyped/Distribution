package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Union type from all supported SDK cache layer.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.distLiteInternalMod.MemoryLocalCache
  - typings.firebaseFirestore.distLiteInternalMod.PersistentLocalCache
*/
trait FirestoreLocalCache extends StObject
object FirestoreLocalCache {
  
  inline def MemoryLocalCache(
    _offlineComponentProvider: MemoryOfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): typings.firebaseFirestore.distLiteInternalMod.MemoryLocalCache = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "memory")
    __obj.asInstanceOf[typings.firebaseFirestore.distLiteInternalMod.MemoryLocalCache]
  }
  
  inline def PersistentLocalCache(
    _offlineComponentProvider: OfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): typings.firebaseFirestore.distLiteInternalMod.PersistentLocalCache = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "persistent")
    __obj.asInstanceOf[typings.firebaseFirestore.distLiteInternalMod.PersistentLocalCache]
  }
}
