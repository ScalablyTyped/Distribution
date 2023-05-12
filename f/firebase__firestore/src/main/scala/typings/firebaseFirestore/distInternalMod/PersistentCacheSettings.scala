package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentCacheSettings extends StObject {
  
  /**
    * An approximate cache size threshold for the on-disk data. If the cache
    * grows beyond this size, Firestore will start removing data that hasn't been
    * recently used. The SDK does not guarantee that the cache will stay below
    * that size, only that if the cache exceeds the given size, cleanup will be
    * attempted.
    *
    * The default value is 40 MB. The threshold must be set to at least 1 MB, and
    * can be set to `CACHE_SIZE_UNLIMITED` to disable garbage collection.
    */
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how multiple tabs/windows will be managed by the SDK.
    */
  var tabManager: js.UndefOr[PersistentTabManager] = js.undefined
}
object PersistentCacheSettings {
  
  inline def apply(): PersistentCacheSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentCacheSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentCacheSettings] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
    
    inline def setTabManager(value: PersistentTabManager): Self = StObject.set(x, "tabManager", value.asInstanceOf[js.Any])
    
    inline def setTabManagerUndefined: Self = StObject.set(x, "tabManager", js.undefined)
  }
}
