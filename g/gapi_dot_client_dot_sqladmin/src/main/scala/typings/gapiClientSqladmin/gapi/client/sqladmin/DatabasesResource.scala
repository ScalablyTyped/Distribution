package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonAltDatabase
import typings.gapiClientSqladmin.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: AnonAltDatabase): Request_[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: AnonAltDatabase): Request_[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: AnonAltFields): Request_[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: AnonAltDatabase): Request_[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: AnonAltDatabase): Request_[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: AnonAltDatabase => Request_[Operation],
    get: AnonAltDatabase => Request_[Database],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAltFields => Request_[DatabasesListResponse],
    patch: AnonAltDatabase => Request_[Operation],
    update: AnonAltDatabase => Request_[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatabasesResource]
  }
}

