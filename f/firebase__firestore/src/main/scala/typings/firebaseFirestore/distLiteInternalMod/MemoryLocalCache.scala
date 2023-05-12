package typings.firebaseFirestore.distLiteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an in-memory cache to the SDK. This is the default cache unless explicitly
  * configured otherwise.
  *
  * To use, create an instance using the factory function {@link memoryLocalCache()}, then
  * set the instance to `FirestoreSettings.cache` and call `initializeFirestore` using
  * the settings object.
  */
trait MemoryLocalCache
  extends StObject
     with FirestoreLocalCache {
  
  /**
    * @internal
    */
  var _offlineComponentProvider: MemoryOfflineComponentProvider
  
  /**
    * @internal
    */
  var _onlineComponentProvider: OnlineComponentProvider
  
  var kind: memory
}
object MemoryLocalCache {
  
  inline def apply(
    _offlineComponentProvider: MemoryOfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): MemoryLocalCache = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "memory")
    __obj.asInstanceOf[MemoryLocalCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryLocalCache] (val x: Self) extends AnyVal {
    
    inline def setKind(value: memory): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def set_offlineComponentProvider(value: MemoryOfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
  }
}
