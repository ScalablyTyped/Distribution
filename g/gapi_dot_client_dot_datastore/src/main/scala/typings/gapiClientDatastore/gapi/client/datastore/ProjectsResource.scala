package typings.gapiClientDatastore.gapi.client.datastore

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDatastore.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var operations: OperationsResource
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: AnonAccesstokenAltBearertoken): Request_[AllocateIdsResponse]
  /** Begins a new transaction. */
  def beginTransaction(request: AnonAccesstokenAltBearertoken): Request_[BeginTransactionResponse]
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: AnonAccesstokenAltBearertoken): Request_[CommitResponse]
  /** Looks up entities by key. */
  def lookup(request: AnonAccesstokenAltBearertoken): Request_[LookupResponse]
  /** Rolls back a transaction. */
  def rollback(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /** Queries for entities. */
  def runQuery(request: AnonAccesstokenAltBearertoken): Request_[RunQueryResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: AnonAccesstokenAltBearertoken => Request_[AllocateIdsResponse],
    beginTransaction: AnonAccesstokenAltBearertoken => Request_[BeginTransactionResponse],
    commit: AnonAccesstokenAltBearertoken => Request_[CommitResponse],
    lookup: AnonAccesstokenAltBearertoken => Request_[LookupResponse],
    operations: OperationsResource,
    rollback: AnonAccesstokenAltBearertoken => Request_[js.Object],
    runQuery: AnonAccesstokenAltBearertoken => Request_[RunQueryResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = js.Any.fromFunction1(allocateIds), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), lookup = js.Any.fromFunction1(lookup), operations = operations.asInstanceOf[js.Any], rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

