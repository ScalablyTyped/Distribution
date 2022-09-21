package typings.firebaseApp

import typings.firebaseApp.firebaseAppStrings.`app-deleted`
import typings.firebaseApp.firebaseAppStrings.`bad-app-name`
import typings.firebaseApp.firebaseAppStrings.`duplicate-app`
import typings.firebaseApp.firebaseAppStrings.`idb-delete`
import typings.firebaseApp.firebaseAppStrings.`idb-get`
import typings.firebaseApp.firebaseAppStrings.`idb-open`
import typings.firebaseApp.firebaseAppStrings.`idb-set`
import typings.firebaseApp.firebaseAppStrings.`invalid-app-argument`
import typings.firebaseApp.firebaseAppStrings.`invalid-log-argument`
import typings.firebaseApp.firebaseAppStrings.`no-app`
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/app/dist/app/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseApp.firebaseAppStrings.`no-app`
    - typings.firebaseApp.firebaseAppStrings.`bad-app-name`
    - typings.firebaseApp.firebaseAppStrings.`duplicate-app`
    - typings.firebaseApp.firebaseAppStrings.`app-deleted`
    - typings.firebaseApp.firebaseAppStrings.`invalid-app-argument`
    - typings.firebaseApp.firebaseAppStrings.`invalid-log-argument`
    - typings.firebaseApp.firebaseAppStrings.`idb-open`
    - typings.firebaseApp.firebaseAppStrings.`idb-get`
    - typings.firebaseApp.firebaseAppStrings.`idb-set`
    - typings.firebaseApp.firebaseAppStrings.`idb-delete`
  */
  trait AppError extends StObject
  object AppError {
    
    inline def APP_DELETED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
    
    inline def BAD_APP_NAME: `bad-app-name` = "bad-app-name".asInstanceOf[`bad-app-name`]
    
    inline def DUPLICATE_APP: `duplicate-app` = "duplicate-app".asInstanceOf[`duplicate-app`]
    
    inline def IDB_DELETE: `idb-delete` = "idb-delete".asInstanceOf[`idb-delete`]
    
    inline def IDB_GET: `idb-get` = "idb-get".asInstanceOf[`idb-get`]
    
    inline def IDB_OPEN: `idb-open` = "idb-open".asInstanceOf[`idb-open`]
    
    inline def IDB_WRITE: `idb-set` = "idb-set".asInstanceOf[`idb-set`]
    
    inline def INVALID_APP_ARGUMENT: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
    
    inline def INVALID_LOG_ARGUMENT: `invalid-log-argument` = "invalid-log-argument".asInstanceOf[`invalid-log-argument`]
    
    inline def NO_APP: `no-app` = "no-app".asInstanceOf[`no-app`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
