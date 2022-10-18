package typings.firebaseAdmin

import typings.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRemoteConfigRemoteConfigApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/remote-config/remote-config-api-client-internal", "FirebaseRemoteConfigError")
  @js.native
  open class FirebaseRemoteConfigError protected () extends PrefixedFirebaseError {
    def this(code: RemoteConfigErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.aborted
    - typings.firebaseAdmin.firebaseAdminStrings.`already-exists`
    - typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition`
    - typings.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typings.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typings.firebaseAdmin.firebaseAdminStrings.`out-of-range`
    - typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`
    - typings.firebaseAdmin.firebaseAdminStrings.unauthenticated
    - typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait RemoteConfigErrorCode extends StObject
  object RemoteConfigErrorCode {
    
    inline def aborted: typings.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `already-exists`: typings.firebaseAdmin.firebaseAdminStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`already-exists`]
    
    inline def `failed-precondition`: typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition`]
    
    inline def `internal-error`: typings.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `not-found`: typings.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `out-of-range`: typings.firebaseAdmin.firebaseAdminStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`]
    
    inline def unauthenticated: typings.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typings.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
