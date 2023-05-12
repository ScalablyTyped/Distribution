package typings.firebaseFirestore

import typings.firebaseFirestore.anon.CacheSizeBytes
import typings.firebaseFirestore.anon.OmitPersistentCacheSettin
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreComponentProviderMod.MemoryOfflineComponentProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreComponentProviderMod.OfflineComponentProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreComponentProviderMod.OnlineComponentProvider
import typings.firebaseFirestore.firebaseFirestoreStrings.PersistentMultipleTab
import typings.firebaseFirestore.firebaseFirestoreStrings.memory
import typings.firebaseFirestore.firebaseFirestoreStrings.memoryEager
import typings.firebaseFirestore.firebaseFirestoreStrings.memoryLru
import typings.firebaseFirestore.firebaseFirestoreStrings.persistent
import typings.firebaseFirestore.firebaseFirestoreStrings.persistentSingleTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiCacheConfigMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/cache_config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoryEagerGarbageCollector(): MemoryEagerGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryEagerGarbageCollector")().asInstanceOf[MemoryEagerGarbageCollector_]
  
  inline def memoryLocalCache(): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")().asInstanceOf[MemoryLocalCache_]
  inline def memoryLocalCache(settings: MemoryCacheSettings): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLocalCache_]
  
  inline def memoryLruGarbageCollector(): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")().asInstanceOf[MemoryLruGarbageCollector_]
  inline def memoryLruGarbageCollector(settings: CacheSizeBytes): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLruGarbageCollector_]
  
  inline def persistentLocalCache(): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")().asInstanceOf[PersistentLocalCache_]
  inline def persistentLocalCache(settings: PersistentCacheSettings): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentLocalCache_]
  
  inline def persistentMultipleTabManager(): PersistentMultipleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentMultipleTabManager")().asInstanceOf[PersistentMultipleTabManager_]
  
  inline def persistentSingleTabManager(): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")().asInstanceOf[PersistentSingleTabManager_]
  inline def persistentSingleTabManager(settings: PersistentSingleTabManagerSettings): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentSingleTabManager_]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryLocalCache_
    - typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.PersistentLocalCache_
  */
  trait FirestoreLocalCache extends StObject
  object FirestoreLocalCache {
    
    inline def MemoryLocalCache_(
      _offlineComponentProvider: MemoryOfflineComponentProvider,
      _onlineComponentProvider: OnlineComponentProvider
    ): typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryLocalCache_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "memory")
      __obj.asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryLocalCache_]
    }
    
    inline def PersistentLocalCache_(
      _offlineComponentProvider: OfflineComponentProvider,
      _onlineComponentProvider: OnlineComponentProvider
    ): typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.PersistentLocalCache_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "persistent")
      __obj.asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.PersistentLocalCache_]
    }
  }
  
  trait MemoryCacheSettings extends StObject {
    
    /**
      * The garbage collector to use, for the memory cache layer.
      * A `MemoryEagerGarbageCollector` is used when this is undefined.
      */
    var garbageCollector: js.UndefOr[MemoryGarbageCollector] = js.undefined
  }
  object MemoryCacheSettings {
    
    inline def apply(): MemoryCacheSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryCacheSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryCacheSettings] (val x: Self) extends AnyVal {
      
      inline def setGarbageCollector(value: MemoryGarbageCollector): Self = StObject.set(x, "garbageCollector", value.asInstanceOf[js.Any])
      
      inline def setGarbageCollectorUndefined: Self = StObject.set(x, "garbageCollector", js.undefined)
    }
  }
  
  trait MemoryEagerGarbageCollector_
    extends StObject
       with MemoryGarbageCollector {
    
    /**
      * @internal
      */
    var _offlineComponentProvider: MemoryOfflineComponentProvider
    
    var kind: memoryEager
  }
  object MemoryEagerGarbageCollector_ {
    
    inline def apply(_offlineComponentProvider: MemoryOfflineComponentProvider): MemoryEagerGarbageCollector_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = "memoryEager")
      __obj.asInstanceOf[MemoryEagerGarbageCollector_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryEagerGarbageCollector_] (val x: Self) extends AnyVal {
      
      inline def setKind(value: memoryEager): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_offlineComponentProvider(value: MemoryOfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryEagerGarbageCollector_
    - typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryLruGarbageCollector_
  */
  trait MemoryGarbageCollector extends StObject
  object MemoryGarbageCollector {
    
    inline def MemoryEagerGarbageCollector_(_offlineComponentProvider: MemoryOfflineComponentProvider): typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryEagerGarbageCollector_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = "memoryEager")
      __obj.asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryEagerGarbageCollector_]
    }
    
    inline def MemoryLruGarbageCollector_(_offlineComponentProvider: MemoryOfflineComponentProvider): typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryLruGarbageCollector_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = "memoryLru")
      __obj.asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.MemoryLruGarbageCollector_]
    }
  }
  
  trait MemoryLocalCache_
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
  object MemoryLocalCache_ {
    
    inline def apply(
      _offlineComponentProvider: MemoryOfflineComponentProvider,
      _onlineComponentProvider: OnlineComponentProvider
    ): MemoryLocalCache_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "memory")
      __obj.asInstanceOf[MemoryLocalCache_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryLocalCache_] (val x: Self) extends AnyVal {
      
      inline def setKind(value: memory): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_offlineComponentProvider(value: MemoryOfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
      
      inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemoryLruGarbageCollector_
    extends StObject
       with MemoryGarbageCollector {
    
    /**
      * @internal
      */
    var _offlineComponentProvider: MemoryOfflineComponentProvider
    
    var kind: memoryLru
  }
  object MemoryLruGarbageCollector_ {
    
    inline def apply(_offlineComponentProvider: MemoryOfflineComponentProvider): MemoryLruGarbageCollector_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = "memoryLru")
      __obj.asInstanceOf[MemoryLruGarbageCollector_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryLruGarbageCollector_] (val x: Self) extends AnyVal {
      
      inline def setKind(value: memoryLru): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_offlineComponentProvider(value: MemoryOfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  trait PersistentLocalCache_
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
  object PersistentLocalCache_ {
    
    inline def apply(
      _offlineComponentProvider: OfflineComponentProvider,
      _onlineComponentProvider: OnlineComponentProvider
    ): PersistentLocalCache_ = {
      val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "persistent")
      __obj.asInstanceOf[PersistentLocalCache_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistentLocalCache_] (val x: Self) extends AnyVal {
      
      inline def setKind(value: persistent): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_offlineComponentProvider(value: OfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
      
      inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersistentMultipleTabManager_
    extends StObject
       with PersistentTabManager {
    
    /**
      * @internal
      */
    def _initialize(settings: OmitPersistentCacheSettin): Unit
    
    /**
      * @internal
      */
    var _offlineComponentProvider: js.UndefOr[OfflineComponentProvider] = js.undefined
    
    /**
      * @internal
      */
    var _onlineComponentProvider: js.UndefOr[OnlineComponentProvider] = js.undefined
    
    var kind: PersistentMultipleTab
  }
  object PersistentMultipleTabManager_ {
    
    inline def apply(_initialize: OmitPersistentCacheSettin => Unit): PersistentMultipleTabManager_ = {
      val __obj = js.Dynamic.literal(_initialize = js.Any.fromFunction1(_initialize), kind = "PersistentMultipleTab")
      __obj.asInstanceOf[PersistentMultipleTabManager_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistentMultipleTabManager_] (val x: Self) extends AnyVal {
      
      inline def setKind(value: PersistentMultipleTab): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_initialize(value: OmitPersistentCacheSettin => Unit): Self = StObject.set(x, "_initialize", js.Any.fromFunction1(value))
      
      inline def set_offlineComponentProvider(value: OfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
      
      inline def set_offlineComponentProviderUndefined: Self = StObject.set(x, "_offlineComponentProvider", js.undefined)
      
      inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
      
      inline def set_onlineComponentProviderUndefined: Self = StObject.set(x, "_onlineComponentProvider", js.undefined)
    }
  }
  
  trait PersistentSingleTabManagerSettings extends StObject {
    
    /**
      * Whether to force-enable persistent (IndexedDB) cache for the client. This
      * cannot be used with multi-tab synchronization and is primarily intended for
      * use with Web Workers. Setting this to `true` will enable IndexedDB, but cause
      * other tabs using IndexedDB cache to fail.
      */
    var forceOwnership: js.UndefOr[Boolean] = js.undefined
  }
  object PersistentSingleTabManagerSettings {
    
    inline def apply(): PersistentSingleTabManagerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistentSingleTabManagerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistentSingleTabManagerSettings] (val x: Self) extends AnyVal {
      
      inline def setForceOwnership(value: Boolean): Self = StObject.set(x, "forceOwnership", value.asInstanceOf[js.Any])
      
      inline def setForceOwnershipUndefined: Self = StObject.set(x, "forceOwnership", js.undefined)
    }
  }
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.PersistentSingleTabManager_
    - typings.firebaseFirestore.distPackagesFirestoreSrcApiCacheConfigMod.PersistentMultipleTabManager_
  */
  trait PersistentTabManager extends StObject
}
