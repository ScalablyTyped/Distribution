package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSqladmin.Anon_AltFields
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: Anon_AltFieldsHost): Request[Operation]
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: Anon_AltFields): Request[Operation]
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: Anon_AltFields): Request[UsersListResponse]
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: Anon_AltFieldsHost): Request[Operation]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsHost => Request[Operation],
    insert: Anon_AltFields => Request[Operation],
    list: Anon_AltFields => Request[UsersListResponse],
    update: Anon_AltFieldsHost => Request[Operation]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}

