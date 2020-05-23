package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: Host): Request[Operation]
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: Fields): Request[Operation]
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: Fields): Request[UsersListResponse]
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: Host): Request[Operation]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: Host => Request[Operation],
    insert: Fields => Request[Operation],
    list: Fields => Request[UsersListResponse],
    update: Host => Request[Operation]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UsersResource]
  }
}

