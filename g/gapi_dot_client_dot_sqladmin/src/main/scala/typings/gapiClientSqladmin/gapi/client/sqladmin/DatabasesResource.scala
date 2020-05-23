package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: typings.gapiClientSqladmin.anon.Database): Request[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: typings.gapiClientSqladmin.anon.Database): Request[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: Fields): Request[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: Fields): Request[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: typings.gapiClientSqladmin.anon.Database): Request[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: typings.gapiClientSqladmin.anon.Database): Request[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientSqladmin.anon.Database => Request[Operation],
    get: typings.gapiClientSqladmin.anon.Database => Request[Database],
    insert: Fields => Request[Operation],
    list: Fields => Request[DatabasesListResponse],
    patch: typings.gapiClientSqladmin.anon.Database => Request[Operation],
    update: typings.gapiClientSqladmin.anon.Database => Request[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatabasesResource]
  }
}

