package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirestoreSettings
  extends StObject
     with FirestoreSettings2 {
  
  /**
    * NOTE: This field will be deprecated in a future major release. Use `cache` field
    * instead to specify cache size, and other cache configurations.
    *
    * An approximate cache size threshold for the on-disk data. If the cache
    * grows beyond this size, Firestore will start removing data that hasn't been
    * recently used. The size is not a guarantee that the cache will stay below
    * that size, only that if the cache exceeds the given size, cleanup will be
    * attempted.
    *
    * The default value is 40 MB. The threshold must be set to at least 1 MB, and
    * can be set to `CACHE_SIZE_UNLIMITED` to disable garbage collection.
    */
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the SDK's underlying transport (WebChannel) to automatically
    * detect if long-polling should be used. This is very similar to
    * `experimentalForceLongPolling`, but only uses long-polling if required.
    *
    * This setting will likely be enabled by default in future releases and
    * cannot be combined with `experimentalForceLongPolling`.
    */
  var experimentalAutoDetectLongPolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces the SDK’s underlying network transport (WebChannel) to use
    * long-polling. Each response from the backend will be closed immediately
    * after the backend sends data (by default responses are kept open in
    * case the backend has more data to send). This avoids incompatibility
    * issues with certain proxies, antivirus software, etc. that incorrectly
    * buffer traffic indefinitely. Use of this option will cause some
    * performance degradation though.
    *
    * This setting cannot be used with `experimentalAutoDetectLongPolling` and
    * may be removed in a future release. If you find yourself using it to
    * work around a specific network reliability issue, please tell us about
    * it in https://github.com/firebase/firebase-js-sdk/issues/1674.
    */
  var experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the cache used by the SDK. Available options are `MemoryLocalCache`
    * and `IndexedDbLocalCache`, each with different configuration options.
    *
    * When unspecified, `MemoryLocalCache` will be used by default.
    *
    * NOTE: setting this field and `cacheSizeBytes` at the same time will throw
    * exception during SDK initialization. Instead, using the configuration in
    * the `FirestoreLocalCache` object to specify the cache size.
    */
  var localCache: js.UndefOr[FirestoreLocalCache] = js.undefined
}
object FirestoreSettings {
  
  inline def apply(): FirestoreSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirestoreSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirestoreSettings] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
    
    inline def setExperimentalAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "experimentalAutoDetectLongPolling", value.asInstanceOf[js.Any])
    
    inline def setExperimentalAutoDetectLongPollingUndefined: Self = StObject.set(x, "experimentalAutoDetectLongPolling", js.undefined)
    
    inline def setExperimentalForceLongPolling(value: Boolean): Self = StObject.set(x, "experimentalForceLongPolling", value.asInstanceOf[js.Any])
    
    inline def setExperimentalForceLongPollingUndefined: Self = StObject.set(x, "experimentalForceLongPolling", js.undefined)
    
    inline def setLocalCache(value: FirestoreLocalCache): Self = StObject.set(x, "localCache", value.asInstanceOf[js.Any])
    
    inline def setLocalCacheUndefined: Self = StObject.set(x, "localCache", js.undefined)
  }
}
