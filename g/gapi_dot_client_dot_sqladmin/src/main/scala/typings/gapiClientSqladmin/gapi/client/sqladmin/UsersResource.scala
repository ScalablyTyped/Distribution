package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonAltFields
import typings.gapiClientSqladmin.AnonAltFieldsHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: AnonAltFieldsHost): Request_[Operation]
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: AnonAltFields): Request_[UsersListResponse]
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: AnonAltFieldsHost): Request_[Operation]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsHost => Request_[Operation],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAltFields => Request_[UsersListResponse],
    update: AnonAltFieldsHost => Request_[Operation]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}

