package typings.firebaseAdmin

import typings.firebaseAdmin.errorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object machineLearningUtilsMod {
  
  @JSImport("firebase-admin/lib/machine-learning/machine-learning-utils", "FirebaseMachineLearningError")
  @js.native
  open class FirebaseMachineLearningError protected () extends PrefixedFirebaseError {
    def this(code: MachineLearningErrorCode, message: String) = this()
  }
  /* static members */
  object FirebaseMachineLearningError {
    
    @JSImport("firebase-admin/lib/machine-learning/machine-learning-utils", "FirebaseMachineLearningError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromOperationError(code: Double, message: String): FirebaseMachineLearningError = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOperationError")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[FirebaseMachineLearningError]
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
    - typings.firebaseAdmin.firebaseAdminStrings.cancelled
    - typings.firebaseAdmin.firebaseAdminStrings.`deadline-exceeded`
    - typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition`
    - typings.firebaseAdmin.firebaseAdminStrings.aborted
    - typings.firebaseAdmin.firebaseAdminStrings.`out-of-range`
    - typings.firebaseAdmin.firebaseAdminStrings.`data-loss`
    - typings.firebaseAdmin.firebaseAdminStrings.unauthenticated
  */
  trait MachineLearningErrorCode extends StObject
  object MachineLearningErrorCode {
    
    inline def aborted: typings.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `already-exists`: typings.firebaseAdmin.firebaseAdminStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`already-exists`]
    
    inline def `authentication-error`: typings.firebaseAdmin.firebaseAdminStrings.`authentication-error` = "authentication-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`authentication-error`]
    
    inline def cancelled: typings.firebaseAdmin.firebaseAdminStrings.cancelled = "cancelled".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.cancelled]
    
    inline def `data-loss`: typings.firebaseAdmin.firebaseAdminStrings.`data-loss` = "data-loss".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typings.firebaseAdmin.firebaseAdminStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition`]
    
    inline def `internal-error`: typings.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-server-response`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-server-response` = "invalid-server-response".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-server-response`]
    
    inline def `not-found`: typings.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `out-of-range`: typings.firebaseAdmin.firebaseAdminStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`]
    
    inline def `service-unavailable`: typings.firebaseAdmin.firebaseAdminStrings.`service-unavailable` = "service-unavailable".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`service-unavailable`]
    
    inline def unauthenticated: typings.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typings.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
