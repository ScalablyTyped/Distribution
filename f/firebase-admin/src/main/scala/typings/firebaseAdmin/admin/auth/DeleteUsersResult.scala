package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#deleteUsers `deleteUsers()`}
  * API.
  */
trait DeleteUsersResult extends js.Object {
  /**
    * A list of `FirebaseArrayIndexError` instances describing the errors that
    * were encountered during the deletion. Length of this list is equal to
    * the return value of [`failureCount`](#failureCount).
    */
  var errors: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.FirebaseArrayIndexError */ _
  ]
  /**
    * The number of user records that failed to be deleted (possibly zero).
    */
  var failureCount: Double
  /**
    * The number of users that were deleted successfully (possibly zero).
    * Users that did not exist prior to calling `deleteUsers()` are
    * considered to be successfully deleted.
    */
  var successCount: Double
}

object DeleteUsersResult {
  @scala.inline
  def apply(
    errors: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.FirebaseArrayIndexError */ _
    ],
    failureCount: Double,
    successCount: Double
  ): DeleteUsersResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsersResult]
  }
}

