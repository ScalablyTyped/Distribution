package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonDatabase
import typings.gapiClientSqladmin.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: AnonDatabase): Request_[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: AnonDatabase): Request_[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: AnonFields): Request_[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: AnonFields): Request_[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: AnonDatabase): Request_[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: AnonDatabase): Request_[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: AnonDatabase => Request_[Operation],
    get: AnonDatabase => Request_[Database],
    insert: AnonFields => Request_[Operation],
    list: AnonFields => Request_[DatabasesListResponse],
    patch: AnonDatabase => Request_[Operation],
    update: AnonDatabase => Request_[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatabasesResource]
  }
}

