package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FirebaseRemoteConfigObject
import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import typings.std.IDBDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage", "APP_NAMESPACE_STORE")
  @js.native
  val APP_NAMESPACE_STORE: /* "app_namespace_store" */ String = js.native
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage", "Storage")
  @js.native
  class Storage protected () extends StObject {
    /**
      * @param appId enables storage segmentation by app (ID + name).
      * @param appName enables storage segmentation by app (ID + name).
      * @param namespace enables storage segmentation by namespace.
      */
    def this(appId: String, appName: String, namespace: String) = this()
    def this(appId: String, appName: String, namespace: String, openDbPromise: js.Promise[IDBDatabase]) = this()
    
    val appId: js.Any = js.native
    
    val appName: js.Any = js.native
    
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
    
    val namespace: js.Any = js.native
    
    val openDbPromise: js.Any = js.native
    
    def set[T](key: ProjectNamespaceKeyFieldValue, value: T): js.Promise[Unit] = js.native
    
    def setActiveConfig(config: FirebaseRemoteConfigObject): js.Promise[Unit] = js.native
    
    def setActiveConfigEtag(etag: String): js.Promise[Unit] = js.native
    
    def setLastFetchStatus(status: FetchStatus): js.Promise[Unit] = js.native
    
    def setLastSuccessfulFetchResponse(response: FetchResponse): js.Promise[Unit] = js.native
    
    def setLastSuccessfulFetchTimestampMillis(timestamp: Double): js.Promise[Unit] = js.native
    
    def setThrottleMetadata(metadata: ThrottleMetadata): js.Promise[Unit] = js.native
  }
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage", "openDatabase")
  @js.native
  def openDatabase(): js.Promise[IDBDatabase] = js.native
  
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
    
    @scala.inline
    def active_config: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config = "active_config".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config]
    
    @scala.inline
    def active_config_etag: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag = "active_config_etag".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag]
    
    @scala.inline
    def last_fetch_status: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status = "last_fetch_status".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status]
    
    @scala.inline
    def last_successful_fetch_response: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response = "last_successful_fetch_response".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response]
    
    @scala.inline
    def last_successful_fetch_timestamp_millis: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis = "last_successful_fetch_timestamp_millis".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis]
    
    @scala.inline
    def settings: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings = "settings".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings]
    
    @scala.inline
    def throttle_metadata: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata = "throttle_metadata".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata]
  }
  
  @js.native
  trait ThrottleMetadata extends StObject {
    
    var backoffCount: Double = js.native
    
    var throttleEndTimeMillis: Double = js.native
  }
  object ThrottleMetadata {
    
    @scala.inline
    def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
      val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleMetadata]
    }
    
    @scala.inline
    implicit class ThrottleMetadataMutableBuilder[Self <: ThrottleMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoffCount(value: Double): Self = StObject.set(x, "backoffCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
