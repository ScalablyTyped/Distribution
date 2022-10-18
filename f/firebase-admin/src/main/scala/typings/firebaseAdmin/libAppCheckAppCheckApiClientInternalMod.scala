package typings.firebaseAdmin

import typings.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppCheckAppCheckApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/app-check/app-check-api-client-internal", "FirebaseAppCheckError")
  @js.native
  open class FirebaseAppCheckError protected () extends PrefixedFirebaseError {
    def this(code: AppCheckErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.aborted
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-credential`
    - typings.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typings.firebaseAdmin.firebaseAdminStrings.unauthenticated
    - typings.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typings.firebaseAdmin.firebaseAdminStrings.`app-check-token-expired`
    - typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait AppCheckErrorCode extends StObject
  object AppCheckErrorCode {
    
    inline def aborted: typings.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `app-check-token-expired`: typings.firebaseAdmin.firebaseAdminStrings.`app-check-token-expired` = "app-check-token-expired".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`app-check-token-expired`]
    
    inline def `internal-error`: typings.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-credential`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-credential` = "invalid-credential".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-credential`]
    
    inline def `not-found`: typings.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `permission-denied`: typings.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def unauthenticated: typings.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typings.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
