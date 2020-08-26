package typings.gapiClientDatastore.gapi.client.datastore

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDatastore.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var operations: OperationsResource = js.native
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: Bearertoken): Request[AllocateIdsResponse] = js.native
  /** Begins a new transaction. */
  def beginTransaction(request: Bearertoken): Request[BeginTransactionResponse] = js.native
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: Bearertoken): Request[CommitResponse] = js.native
  /** Looks up entities by key. */
  def lookup(request: Bearertoken): Request[LookupResponse] = js.native
  /** Rolls back a transaction. */
  def rollback(request: Bearertoken): Request[js.Object] = js.native
  /** Queries for entities. */
  def runQuery(request: Bearertoken): Request[RunQueryResponse] = js.native
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
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllocateIds(value: Bearertoken => Request[AllocateIdsResponse]): Self = this.set("allocateIds", js.Any.fromFunction1(value))
    @scala.inline
    def setBeginTransaction(value: Bearertoken => Request[BeginTransactionResponse]): Self = this.set("beginTransaction", js.Any.fromFunction1(value))
    @scala.inline
    def setCommit(value: Bearertoken => Request[CommitResponse]): Self = this.set("commit", js.Any.fromFunction1(value))
    @scala.inline
    def setLookup(value: Bearertoken => Request[LookupResponse]): Self = this.set("lookup", js.Any.fromFunction1(value))
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setRollback(value: Bearertoken => Request[js.Object]): Self = this.set("rollback", js.Any.fromFunction1(value))
    @scala.inline
    def setRunQuery(value: Bearertoken => Request[RunQueryResponse]): Self = this.set("runQuery", js.Any.fromFunction1(value))
  }
  
}

