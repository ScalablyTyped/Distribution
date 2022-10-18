package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`indexed-db-unavailable`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("@firebase/remote-config/dist/src/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/remote-config/dist/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[ErrorCode, ErrorParams] = js.native
  
  inline def hasErrorCode(e: js.Error, errorCode: ErrorCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasErrorCode")(e.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`indexed-db-unavailable`
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def FETCH_NETWORK: `fetch-client-network` = "fetch-client-network".asInstanceOf[`fetch-client-network`]
    
    inline def FETCH_PARSE: `fetch-client-parse` = "fetch-client-parse".asInstanceOf[`fetch-client-parse`]
    
    inline def FETCH_STATUS: `fetch-status` = "fetch-status".asInstanceOf[`fetch-status`]
    
    inline def FETCH_THROTTLE: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
    
    inline def FETCH_TIMEOUT: `fetch-timeout` = "fetch-timeout".asInstanceOf[`fetch-timeout`]
    
    inline def INDEXED_DB_UNAVAILABLE: `indexed-db-unavailable` = "indexed-db-unavailable".asInstanceOf[`indexed-db-unavailable`]
    
    inline def REGISTRATION_API_KEY: `registration-api-key` = "registration-api-key".asInstanceOf[`registration-api-key`]
    
    inline def REGISTRATION_APP_ID: `registration-app-id` = "registration-app-id".asInstanceOf[`registration-app-id`]
    
    inline def REGISTRATION_PROJECT_ID: `registration-project-id` = "registration-project-id".asInstanceOf[`registration-project-id`]
    
    inline def REGISTRATION_WINDOW: `registration-window` = "registration-window".asInstanceOf[`registration-window`]
    
    inline def STORAGE_DELETE: `storage-delete` = "storage-delete".asInstanceOf[`storage-delete`]
    
    inline def STORAGE_GET: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
    
    inline def STORAGE_OPEN: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
    
    inline def STORAGE_SET: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
