package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var operations: OperationsResource
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[AllocateIdsResponse]
  /** Begins a new transaction. */
  def beginTransaction(request: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse]
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse]
  /** Looks up entities by key. */
  def lookup(request: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[LookupResponse]
  /** Rolls back a transaction. */
  def rollback(request: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Queries for entities. */
  def runQuery(request: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[AllocateIdsResponse],
    beginTransaction: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse],
    commit: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse],
    lookup: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[LookupResponse],
    operations: OperationsResource,
    rollback: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    runQuery: gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = js.Any.fromFunction1(allocateIds), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), lookup = js.Any.fromFunction1(lookup), operations = operations, rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

