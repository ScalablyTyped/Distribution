package typings.firebaseAdmin.admin.auth

import typings.firebaseAdmin.authMod.admin.auth.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of the {@link admin.auth.getUsers()} API. */
trait GetUsersResult extends js.Object {
  /** Set of identifiers that were requested, but not found. */
  var notFound: js.Array[UserIdentifier]
  /**
    * Set of user records, corresponding to the set of users that were
    * requested. Only users that were found are listed here. The result set is
    * unordered.
    */
  var users: js.Array[typings.firebaseAdmin.authMod.admin.auth.UserRecord]
}

object GetUsersResult {
  @scala.inline
  def apply(
    notFound: js.Array[UserIdentifier],
    users: js.Array[typings.firebaseAdmin.authMod.admin.auth.UserRecord]
  ): GetUsersResult = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersResult]
  }
}

