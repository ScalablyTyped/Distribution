package typings.firebaseAppCheck

import typings.firebaseAppCheck.firebaseAppCheckStrings.`already-initialized`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`fetch-network-error`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`fetch-parse-error`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`fetch-status-error`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`recaptcha-error`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`storage-get`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`storage-open`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`storage-set`
import typings.firebaseAppCheck.firebaseAppCheckStrings.`use-before-activation`
import typings.firebaseAppCheck.firebaseAppCheckStrings.throttled
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppCheckError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`already-initialized`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`use-before-activation`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`fetch-network-error`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`fetch-parse-error`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`fetch-status-error`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`storage-open`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`storage-get`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`storage-set`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.`recaptcha-error`
    - typings.firebaseAppCheck.firebaseAppCheckStrings.throttled
  */
  trait AppCheckError extends StObject
  object AppCheckError {
    
    inline def ALREADY_INITIALIZED: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
    
    inline def FETCH_NETWORK_ERROR: `fetch-network-error` = "fetch-network-error".asInstanceOf[`fetch-network-error`]
    
    inline def FETCH_PARSE_ERROR: `fetch-parse-error` = "fetch-parse-error".asInstanceOf[`fetch-parse-error`]
    
    inline def FETCH_STATUS_ERROR: `fetch-status-error` = "fetch-status-error".asInstanceOf[`fetch-status-error`]
    
    inline def RECAPTCHA_ERROR: `recaptcha-error` = "recaptcha-error".asInstanceOf[`recaptcha-error`]
    
    inline def STORAGE_GET: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
    
    inline def STORAGE_OPEN: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
    
    inline def STORAGE_WRITE: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
    
    inline def THROTTLED: throttled = "throttled".asInstanceOf[throttled]
    
    inline def USE_BEFORE_ACTIVATION: `use-before-activation` = "use-before-activation".asInstanceOf[`use-before-activation`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
