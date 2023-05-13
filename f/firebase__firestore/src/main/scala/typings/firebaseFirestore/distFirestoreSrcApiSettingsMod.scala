package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcApiCacheConfigMod.FirestoreLocalCache
import typings.firebaseFirestore.distFirestoreSrcApiLongPollingOptionsMod.ExperimentalLongPollingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcApiSettingsMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/settings", "DEFAULT_HOST")
  @js.native
  val DEFAULT_HOST: /* "firestore.googleapis.com" */ String = js.native
  
  trait FirestoreSettings
    extends StObject
       with typings.firebaseFirestore.distFirestoreSrcLiteApiSettingsMod.FirestoreSettings {
    
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
      * After having had a default value of `false` since its inception in 2019,
      * the default value of this setting was changed in mid-2023 to `true`. That
      * is, auto-detection of long polling is now enabled by default. To disable
      * it, set this setting to `false`, and please open a GitHub issue to share
      * the problems that motivated you disabling long-polling auto-detection.
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
      * Options that configure the SDK’s underlying network transport (WebChannel)
      * when long-polling is used.
      *
      * These options are only used if `experimentalForceLongPolling` is true or if
      * `experimentalAutoDetectLongPolling` is true and the auto-detection
      * determined that long-polling was needed. Otherwise, these options have no
      * effect.
      */
    var experimentalLongPollingOptions: js.UndefOr[ExperimentalLongPollingOptions] = js.undefined
    
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
      
      inline def setExperimentalLongPollingOptions(value: ExperimentalLongPollingOptions): Self = StObject.set(x, "experimentalLongPollingOptions", value.asInstanceOf[js.Any])
      
      inline def setExperimentalLongPollingOptionsUndefined: Self = StObject.set(x, "experimentalLongPollingOptions", js.undefined)
      
      inline def setLocalCache(value: FirestoreLocalCache): Self = StObject.set(x, "localCache", value.asInstanceOf[js.Any])
      
      inline def setLocalCacheUndefined: Self = StObject.set(x, "localCache", js.undefined)
    }
  }
  
  trait PersistenceSettings extends StObject {
    
    /**
      * Whether to force enable persistence for the client. This cannot be used
      * with multi-tab synchronization and is primarily intended for use with Web
      * Workers. Setting this to `true` will enable persistence, but cause other
      * tabs using persistence to fail.
      */
    var forceOwnership: js.UndefOr[Boolean] = js.undefined
  }
  object PersistenceSettings {
    
    inline def apply(): PersistenceSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistenceSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistenceSettings] (val x: Self) extends AnyVal {
      
      inline def setForceOwnership(value: Boolean): Self = StObject.set(x, "forceOwnership", value.asInstanceOf[js.Any])
      
      inline def setForceOwnershipUndefined: Self = StObject.set(x, "forceOwnership", js.undefined)
    }
  }
}
