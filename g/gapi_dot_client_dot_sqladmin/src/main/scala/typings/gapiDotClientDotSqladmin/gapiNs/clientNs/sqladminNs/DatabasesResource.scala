package typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSqladmin.Anon_AltDatabase
import typings.gapiDotClientDotSqladmin.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: Anon_AltDatabase): Request[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: Anon_AltDatabase): Request[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: Anon_AltFields): Request[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: Anon_AltFields): Request[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: Anon_AltDatabase): Request[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: Anon_AltDatabase): Request[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: Anon_AltDatabase => Request[Operation],
    get: Anon_AltDatabase => Request[Database],
    insert: Anon_AltFields => Request[Operation],
    list: Anon_AltFields => Request[DatabasesListResponse],
    patch: Anon_AltDatabase => Request[Operation],
    update: Anon_AltDatabase => Request[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatabasesResource]
  }
}

