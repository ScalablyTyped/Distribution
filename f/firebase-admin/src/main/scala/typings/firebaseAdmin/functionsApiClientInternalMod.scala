package typings.firebaseAdmin

import typings.firebaseAdmin.anon.Body
import typings.firebaseAdmin.errorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/functions/functions-api-client-internal", "FirebaseFunctionsError")
  @js.native
  open class FirebaseFunctionsError protected () extends PrefixedFirebaseError {
    def this(code: FunctionsErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.aborted
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typings.firebaseAdmin.firebaseAdminStrings.`invalid-credential`
    - typings.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition`
    - typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typings.firebaseAdmin.firebaseAdminStrings.unauthenticated
    - typings.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typings.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `failed-precondition`: typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`failed-precondition`]
    
    inline def `internal-error`: typings.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-credential`: typings.firebaseAdmin.firebaseAdminStrings.`invalid-credential` = "invalid-credential".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`invalid-credential`]
    
    inline def `not-found`: typings.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `permission-denied`: typings.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def unauthenticated: typings.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typings.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
  
  trait Task extends StObject {
    
    var dispatchDeadline: js.UndefOr[String] = js.undefined
    
    var httpRequest: Body
    
    var scheduleTime: js.UndefOr[String] = js.undefined
  }
  object Task {
    
    inline def apply(httpRequest: Body): Task = {
      val __obj = js.Dynamic.literal(httpRequest = httpRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setDispatchDeadline(value: String): Self = StObject.set(x, "dispatchDeadline", value.asInstanceOf[js.Any])
      
      inline def setDispatchDeadlineUndefined: Self = StObject.set(x, "dispatchDeadline", js.undefined)
      
      inline def setHttpRequest(value: Body): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
      
      inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
      
      inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    }
  }
}
