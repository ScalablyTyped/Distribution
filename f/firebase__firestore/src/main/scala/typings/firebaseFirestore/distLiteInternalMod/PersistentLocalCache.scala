package typings.firebaseFirestore.distLiteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a persistent cache backed by IndexedDb to the SDK.
  *
  * To use, create an instance using the factory function {@link persistentLocalCache()}, then
  * set the instance to `FirestoreSettings.cache` and call `initializeFirestore` using
  * the settings object.
  */
trait PersistentLocalCache
  extends StObject
     with FirestoreLocalCache {
  
  /**
    * @internal
    */
  var _offlineComponentProvider: OfflineComponentProvider
  
  /**
    * @internal
    */
  var _onlineComponentProvider: OnlineComponentProvider
  
  var kind: persistent
}
object PersistentLocalCache {
  
  inline def apply(
    _offlineComponentProvider: OfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): PersistentLocalCache = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "persistent")
    __obj.asInstanceOf[PersistentLocalCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentLocalCache] (val x: Self) extends AnyVal {
    
    inline def setKind(value: persistent): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def set_offlineComponentProvider(value: OfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
  }
}
