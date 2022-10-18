package typings.firebaseAdmin

import typings.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityRulesSecurityRulesInternalMod {
  
  @JSImport("firebase-admin/lib/security-rules/security-rules-internal", "FirebaseSecurityRulesError")
  @js.native
  open class FirebaseSecurityRulesError protected () extends PrefixedFirebaseError {
    def this(code: SecurityRulesErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.`already-exists`
    - typings.firebaseAdmin.firebaseAdminStrings.`authentication-error`
    - typings.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-server-response`
    - typings.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`
    - typings.firebaseAdmin.firebaseAdminStrings.`service-unavailable`
    - typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait SecurityRulesErrorCode extends StObject
  object SecurityRulesErrorCode {
    
    inline def `already-exists`: typings.firebaseAdmin.firebaseAdminStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`already-exists`]
    
    inline def `authentication-error`: typings.firebaseAdmin.firebaseAdminStrings.`authentication-error` = "authentication-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`authentication-error`]
    
    inline def `internal-error`: typings.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-server-response`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-server-response` = "invalid-server-response".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-server-response`]
    
    inline def `not-found`: typings.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `resource-exhausted`: typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`]
    
    inline def `service-unavailable`: typings.firebaseAdmin.firebaseAdminStrings.`service-unavailable` = "service-unavailable".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`service-unavailable`]
    
    inline def `unknown-error`: typings.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
