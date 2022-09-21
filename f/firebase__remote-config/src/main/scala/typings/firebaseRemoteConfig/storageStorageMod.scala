package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.clientRemoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.clientRemoteConfigFetchClientMod.FirebaseRemoteConfigObject
import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import typings.std.IDBDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageStorageMod {
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage", "APP_NAMESPACE_STORE")
  @js.native
  val APP_NAMESPACE_STORE: /* "app_namespace_store" */ String = js.native
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage", "Storage")
  @js.native
  open class Storage protected () extends StObject {
    /**
      * @param appId enables storage segmentation by app (ID + name).
      * @param appName enables storage segmentation by app (ID + name).
      * @param namespace enables storage segmentation by namespace.
      */
    def this(appId: String, appName: String, namespace: String) = this()
    def this(appId: String, appName: String, namespace: String, openDbPromise: js.Promise[IDBDatabase]) = this()
    
    /* private */ val appId: Any = js.native
    
    /* private */ val appName: Any = js.native
    
    def createCompositeKey(key: ProjectNamespaceKeyFieldValue): String = js.native
    
    def delete(key: ProjectNamespaceKeyFieldValue): js.Promise[Unit] = js.native
    
    def deleteThrottleMetadata(): js.Promise[Unit] = js.native
    
    def get[T](key: ProjectNamespaceKeyFieldValue): js.Promise[js.UndefOr[T]] = js.native
    
    def getActiveConfig(): js.Promise[js.UndefOr[FirebaseRemoteConfigObject]] = js.native
    
    def getActiveConfigEtag(): js.Promise[js.UndefOr[String]] = js.native
    
    def getLastFetchStatus(): js.Promise[js.UndefOr[FetchStatus]] = js.native
    
    def getLastSuccessfulFetchResponse(): js.Promise[js.UndefOr[FetchResponse]] = js.native
    
    def getLastSuccessfulFetchTimestampMillis(): js.Promise[js.UndefOr[Double]] = js.native
    
    def getThrottleMetadata(): js.Promise[js.UndefOr[ThrottleMetadata]] = js.native
    
    /* private */ val namespace: Any = js.native
    
    /* private */ val openDbPromise: Any = js.native
    
    def set[T](key: ProjectNamespaceKeyFieldValue, value: T): js.Promise[Unit] = js.native
    
    def setActiveConfig(config: FirebaseRemoteConfigObject): js.Promise[Unit] = js.native
    
    def setActiveConfigEtag(etag: String): js.Promise[Unit] = js.native
    
    def setLastFetchStatus(status: FetchStatus): js.Promise[Unit] = js.native
    
    def setLastSuccessfulFetchResponse(response: FetchResponse): js.Promise[Unit] = js.native
    
    def setLastSuccessfulFetchTimestampMillis(timestamp: Double): js.Promise[Unit] = js.native
    
    def setThrottleMetadata(metadata: ThrottleMetadata): js.Promise[Unit] = js.native
  }
  
  inline def openDatabase(): js.Promise[IDBDatabase] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")().asInstanceOf[js.Promise[IDBDatabase]]
  
  /**
    * Provides type-safety for the "key" field used by {@link APP_NAMESPACE_STORE}.
    *
    * <p>This seems like a small price to avoid potentially subtle bugs caused by a typo.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata
  */
  trait ProjectNamespaceKeyFieldValue extends StObject
  object ProjectNamespaceKeyFieldValue {
    
    inline def active_config: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config = "active_config".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config]
    
    inline def active_config_etag: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag = "active_config_etag".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag]
    
    inline def last_fetch_status: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status = "last_fetch_status".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status]
    
    inline def last_successful_fetch_response: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response = "last_successful_fetch_response".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response]
    
    inline def last_successful_fetch_timestamp_millis: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis = "last_successful_fetch_timestamp_millis".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis]
    
    inline def settings: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings = "settings".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings]
    
    inline def throttle_metadata: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata = "throttle_metadata".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata]
  }
  
  trait ThrottleMetadata extends StObject {
    
    var backoffCount: Double
    
    var throttleEndTimeMillis: Double
  }
  object ThrottleMetadata {
    
    inline def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
      val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleMetadata]
    }
    
    extension [Self <: ThrottleMetadata](x: Self) {
      
      inline def setBackoffCount(value: Double): Self = StObject.set(x, "backoffCount", value.asInstanceOf[js.Any])
      
      inline def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
