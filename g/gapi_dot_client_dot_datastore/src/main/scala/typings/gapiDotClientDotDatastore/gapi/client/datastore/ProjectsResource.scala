package typings.gapiDotClientDotDatastore.gapi.client.datastore

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDatastore.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var operations: OperationsResource
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: Anon_AccesstokenAltBearertoken): Request[AllocateIdsResponse]
  /** Begins a new transaction. */
  def beginTransaction(request: Anon_AccesstokenAltBearertoken): Request[BeginTransactionResponse]
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: Anon_AccesstokenAltBearertoken): Request[CommitResponse]
  /** Looks up entities by key. */
  def lookup(request: Anon_AccesstokenAltBearertoken): Request[LookupResponse]
  /** Rolls back a transaction. */
  def rollback(request: Anon_AccesstokenAltBearertoken): Request[js.Object]
  /** Queries for entities. */
  def runQuery(request: Anon_AccesstokenAltBearertoken): Request[RunQueryResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: Anon_AccesstokenAltBearertoken => Request[AllocateIdsResponse],
    beginTransaction: Anon_AccesstokenAltBearertoken => Request[BeginTransactionResponse],
    commit: Anon_AccesstokenAltBearertoken => Request[CommitResponse],
    lookup: Anon_AccesstokenAltBearertoken => Request[LookupResponse],
    operations: OperationsResource,
    rollback: Anon_AccesstokenAltBearertoken => Request[js.Object],
    runQuery: Anon_AccesstokenAltBearertoken => Request[RunQueryResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = js.Any.fromFunction1(allocateIds), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), lookup = js.Any.fromFunction1(lookup), operations = operations.asInstanceOf[js.Any], rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

