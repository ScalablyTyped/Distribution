package typings.firebaseAdmin.admin.auth

import typings.firebaseAdmin.admin.FirebaseArrayIndexError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method for batch
  * importing users to Firebase Auth.
  */
trait UserImportResult extends js.Object {
  /**
    * An array of errors corresponding to the provided users to import. The
    * length of this array is equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError]
  /**
    * The number of user records that failed to import to Firebase Auth.
    */
  var failureCount: Double
  /**
    * The number of user records that successfully imported to Firebase Auth.
    */
  var successCount: Double
}

object UserImportResult {
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): UserImportResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportResult]
  }
}

