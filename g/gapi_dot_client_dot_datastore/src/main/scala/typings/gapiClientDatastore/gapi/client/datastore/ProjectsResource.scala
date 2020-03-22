package typings.gapiClientDatastore.gapi.client.datastore

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDatastore.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var operations: OperationsResource
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: AnonBearertoken): Request_[AllocateIdsResponse]
  /** Begins a new transaction. */
  def beginTransaction(request: AnonBearertoken): Request_[BeginTransactionResponse]
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: AnonBearertoken): Request_[CommitResponse]
  /** Looks up entities by key. */
  def lookup(request: AnonBearertoken): Request_[LookupResponse]
  /** Rolls back a transaction. */
  def rollback(request: AnonBearertoken): Request_[js.Object]
  /** Queries for entities. */
  def runQuery(request: AnonBearertoken): Request_[RunQueryResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: AnonBearertoken => Request_[AllocateIdsResponse],
    beginTransaction: AnonBearertoken => Request_[BeginTransactionResponse],
    commit: AnonBearertoken => Request_[CommitResponse],
    lookup: AnonBearertoken => Request_[LookupResponse],
    operations: OperationsResource,
    rollback: AnonBearertoken => Request_[js.Object],
    runQuery: AnonBearertoken => Request_[RunQueryResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = js.Any.fromFunction1(allocateIds), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), lookup = js.Any.fromFunction1(lookup), operations = operations.asInstanceOf[js.Any], rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

