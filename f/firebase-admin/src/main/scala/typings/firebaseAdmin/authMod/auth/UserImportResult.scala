package typings.firebaseAdmin.authMod.auth

import typings.firebaseAdmin.firebaseNamespaceApiMod.FirebaseArrayIndexError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the response from the
  * {@link auth.Auth.importUsers `importUsers()`} method for batch
  * importing users to Firebase Auth.
  */
@js.native
trait UserImportResult extends StObject {
  
  /**
    * An array of errors corresponding to the provided users to import. The
    * length of this array is equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError] = js.native
  
  /**
    * The number of user records that failed to import to Firebase Auth.
    */
  var failureCount: Double = js.native
  
  /**
    * The number of user records that successfully imported to Firebase Auth.
    */
  var successCount: Double = js.native
}
object UserImportResult {
  
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): UserImportResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportResult]
  }
  
  @scala.inline
  implicit class UserImportResultMutableBuilder[Self <: UserImportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[FirebaseArrayIndexError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: FirebaseArrayIndexError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
