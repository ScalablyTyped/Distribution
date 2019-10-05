package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.UserDeletion

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDeletionRequestCollection extends js.Object {
  // Insert or update a user deletion requests.
  def upsert(resource: UserDeletionRequest): UserDeletionRequest
}

object UserDeletionRequestCollection {
  @scala.inline
  def apply(upsert: UserDeletionRequest => UserDeletionRequest): UserDeletionRequestCollection = {
    val __obj = js.Dynamic.literal(upsert = js.Any.fromFunction1(upsert))
  
    __obj.asInstanceOf[UserDeletionRequestCollection]
  }
}

