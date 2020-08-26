package typings.gapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSpanner.anon.Accesstoken
import typings.gapiClientSpanner.anon.Callback
import typings.gapiClientSpanner.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsResource extends js.Object {
  /**
    * Begins a new transaction. This step can often be skipped:
    * Read, ExecuteSql and
    * Commit can begin a new transaction as a
    * side-effect.
    */
  def beginTransaction(request: Callback): Request[Transaction] = js.native
  /**
    * Commits a transaction. The request includes the mutations to be
    * applied to rows in the database.
    *
    * `Commit` might return an `ABORTED` error. This can occur at any time;
    * commonly, the cause is conflicts with concurrent
    * transactions. However, it can also happen for a variety of other
    * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
    * the transaction from the beginning, re-using the same session.
    */
  def commit(request: Callback): Request[CommitResponse] = js.native
  /**
    * Creates a new session. A session can be used to perform
    * transactions that read and/or modify data in a Cloud Spanner database.
    * Sessions are meant to be reused for many consecutive
    * transactions.
    *
    * Sessions can only execute one transaction at a time. To execute
    * multiple concurrent read-write/write-only transactions, create
    * multiple sessions. Note that standalone reads and queries use a
    * transaction internally, and count toward the one transaction
    * limit.
    *
    * Cloud Spanner limits the number of sessions that can exist at any given
    * time; thus, it is a good idea to delete idle and/or unneeded sessions.
    * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
    * operations are sent for more than an hour. If a session is deleted,
    * requests to it return `NOT_FOUND`.
    *
    * Idle sessions can be kept alive by sending a trivial SQL query
    * periodically, e.g., `"SELECT 1"`.
    */
  def create(request: typings.gapiClientSpanner.anon.Database): Request[Session] = js.native
  /** Ends a session, releasing server resources associated with it. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /**
    * Executes an SQL query, returning all rows in a single reply. This
    * method cannot be used to return a result set larger than 10 MiB;
    * if the query yields more data than that, the query fails with
    * a `FAILED_PRECONDITION` error.
    *
    * Queries inside read-write transactions might return `ABORTED`. If
    * this occurs, the application should restart the transaction from
    * the beginning. See Transaction for more details.
    *
    * Larger result sets can be fetched in streaming fashion by calling
    * ExecuteStreamingSql instead.
    */
  def executeSql(request: Callback): Request[ResultSet] = js.native
  /**
    * Like ExecuteSql, except returns the result
    * set as a stream. Unlike ExecuteSql, there
    * is no limit on the size of the returned result set. However, no
    * individual row in the result set can exceed 100 MiB, and no
    * column value can exceed 10 MiB.
    */
  def executeStreamingSql(request: Callback): Request[PartialResultSet] = js.native
  /**
    * Gets a session. Returns `NOT_FOUND` if the session does not exist.
    * This is mainly useful for determining whether a session is still
    * alive.
    */
  def get(request: Accesstoken): Request[Session] = js.native
  /** Lists all sessions in a given database. */
  def list(request: Fields): Request[ListSessionsResponse] = js.native
  /**
    * Reads rows from the database using key lookups and scans, as a
    * simple key/value style alternative to
    * ExecuteSql.  This method cannot be used to
    * return a result set larger than 10 MiB; if the read matches more
    * data than that, the read fails with a `FAILED_PRECONDITION`
    * error.
    *
    * Reads inside read-write transactions might return `ABORTED`. If
    * this occurs, the application should restart the transaction from
    * the beginning. See Transaction for more details.
    *
    * Larger result sets can be yielded in streaming fashion by calling
    * StreamingRead instead.
    */
  def read(request: Callback): Request[ResultSet] = js.native
  /**
    * Rolls back a transaction, releasing any locks it holds. It is a good
    * idea to call this for any transaction that includes one or more
    * Read or ExecuteSql requests and
    * ultimately decides not to commit.
    *
    * `Rollback` returns `OK` if it successfully aborts the transaction, the
    * transaction was already aborted, or the transaction is not
    * found. `Rollback` never returns `ABORTED`.
    */
  def rollback(request: Callback): Request[js.Object] = js.native
  /**
    * Like Read, except returns the result set as a
    * stream. Unlike Read, there is no limit on the
    * size of the returned result set. However, no individual row in
    * the result set can exceed 100 MiB, and no column value can exceed
    * 10 MiB.
    */
  def streamingRead(request: Callback): Request[PartialResultSet] = js.native
}

object SessionsResource {
  @scala.inline
  def apply(
    beginTransaction: Callback => Request[Transaction],
    commit: Callback => Request[CommitResponse],
    create: typings.gapiClientSpanner.anon.Database => Request[Session],
    delete: Accesstoken => Request[js.Object],
    executeSql: Callback => Request[ResultSet],
    executeStreamingSql: Callback => Request[PartialResultSet],
    get: Accesstoken => Request[Session],
    list: Fields => Request[ListSessionsResponse],
    read: Callback => Request[ResultSet],
    rollback: Callback => Request[js.Object],
    streamingRead: Callback => Request[PartialResultSet]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), executeSql = js.Any.fromFunction1(executeSql), executeStreamingSql = js.Any.fromFunction1(executeStreamingSql), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), read = js.Any.fromFunction1(read), rollback = js.Any.fromFunction1(rollback), streamingRead = js.Any.fromFunction1(streamingRead))
    __obj.asInstanceOf[SessionsResource]
  }
  @scala.inline
  implicit class SessionsResourceOps[Self <: SessionsResource] (val x: Self) extends AnyVal {
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
    def setBeginTransaction(value: Callback => Request[Transaction]): Self = this.set("beginTransaction", js.Any.fromFunction1(value))
    @scala.inline
    def setCommit(value: Callback => Request[CommitResponse]): Self = this.set("commit", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: typings.gapiClientSpanner.anon.Database => Request[Session]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setExecuteSql(value: Callback => Request[ResultSet]): Self = this.set("executeSql", js.Any.fromFunction1(value))
    @scala.inline
    def setExecuteStreamingSql(value: Callback => Request[PartialResultSet]): Self = this.set("executeStreamingSql", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[Session]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[ListSessionsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: Callback => Request[ResultSet]): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setRollback(value: Callback => Request[js.Object]): Self = this.set("rollback", js.Any.fromFunction1(value))
    @scala.inline
    def setStreamingRead(value: Callback => Request[PartialResultSet]): Self = this.set("streamingRead", js.Any.fromFunction1(value))
  }
  
}

