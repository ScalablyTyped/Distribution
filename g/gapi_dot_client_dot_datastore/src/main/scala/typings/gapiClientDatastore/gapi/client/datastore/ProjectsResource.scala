package typings.gapiClientDatastore.gapi.client.datastore

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDatastore.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var operations: OperationsResource
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: Bearertoken): Request[AllocateIdsResponse]
  /** Begins a new transaction. */
  def beginTransaction(request: Bearertoken): Request[BeginTransactionResponse]
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: Bearertoken): Request[CommitResponse]
  /** Looks up entities by key. */
  def lookup(request: Bearertoken): Request[LookupResponse]
  /** Rolls back a transaction. */
  def rollback(request: Bearertoken): Request[js.Object]
  /** Queries for entities. */
  def runQuery(request: Bearertoken): Request[RunQueryResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: Bearertoken => Request[AllocateIdsResponse],
    beginTransaction: Bearertoken => Request[BeginTransactionResponse],
    commit: Bearertoken => Request[CommitResponse],
    lookup: Bearertoken => Request[LookupResponse],
    operations: OperationsResource,
    rollback: Bearertoken => Request[js.Object],
    runQuery: Bearertoken => Request[RunQueryResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = js.Any.fromFunction1(allocateIds), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), lookup = js.Any.fromFunction1(lookup), operations = operations.asInstanceOf[js.Any], rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery))
    __obj.asInstanceOf[ProjectsResource]
  }
}

