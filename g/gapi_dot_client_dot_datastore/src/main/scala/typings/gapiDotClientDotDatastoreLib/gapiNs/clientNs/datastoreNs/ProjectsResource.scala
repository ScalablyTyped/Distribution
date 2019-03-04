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
    allocateIds: js.Function1[
      gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AllocateIdsResponse]
    ],
    beginTransaction: js.Function1[
      gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse]
    ],
    commit: js.Function1[
      gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse]
    ],
    lookup: js.Function1[
      gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[LookupResponse]
    ],
    operations: OperationsResource,
    rollback: js.Function1[
      gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    runQuery: js.Function1[
      gapiDotClientDotDatastoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse]
    ]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = allocateIds, beginTransaction = beginTransaction, commit = commit, lookup = lookup, operations = operations, rollback = rollback, runQuery = runQuery)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

