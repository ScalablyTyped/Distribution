package typings.firebird.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents SQL transaction.
  *
  * @desc
  * To get instance of this object call @see startNewTransactionSync or @see startNewTransaction methods of @see Connection object.
  * Transaction objects may be reused after commit or rollback.
  */
@js.native
trait Transaction extends js.Object {
  
  /**
    * Asynchronous commit transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def commit(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /**
    * Synchronously commits this transaction.
    *
    * @desc
    * Notes:
    * Transacation is automatically started before any query in context of this object
    * if this object does not have active transaction (check inTransaction property).
    * You also should note that DDL statements (altering database structure) are commited automatically.
    */
  def commitSync(): Unit = js.native
  
  /*
    * A boolean readonly property indicating if this transaction is in started state.
    */
  var inTransaction: Boolean = js.native
  
  /**
    * Synchronously prepares SQL statement
    *
    * @param sql an SQL query to prepare.
    * @returns object in context of this transaction.
    */
  def prepareSync(sql: String): FBStatement = js.native
  
  /**
    * Asynchronously executes query in context of this transaction.
    *
    * @param sql an SQL query to execute.
    * @param callback err - is error object or null, res - FBResult object.
    */
  def query(sql: String, callback: js.Function2[/* err */ Error | Null, /* res */ FBResult, Unit]): Unit = js.native
  
  /**
    * Executes SQL query in context of this transaction. Returns FBResult object in case of success. Raises error otherwise.
    *
    * @param sql an SQL query to execute.
    */
  def querySync(sql: String): Unit = js.native
  
  /**
    * Asynchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def rollback(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /**
    * Synchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    */
  def rollbackSync(): Unit = js.native
  
  /**
    * Asynchronously starts new transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def start(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /**
    * Synchronously starts transaction.
    *
    * @desc
    * The transaction should be not in started state before call to this method.
    * Read notes in @see commitSync() .
    * See @see inTransaction property.
    */
  def startSync(): Unit = js.native
}
object Transaction {
  
  @scala.inline
  def apply(
    commit: js.Function1[/* err */ Error | Null, Unit] => Unit,
    commitSync: () => Unit,
    inTransaction: Boolean,
    prepareSync: String => FBStatement,
    query: (String, js.Function2[/* err */ Error | Null, /* res */ FBResult, Unit]) => Unit,
    querySync: String => Unit,
    rollback: js.Function1[/* err */ Error | Null, Unit] => Unit,
    rollbackSync: () => Unit,
    start: js.Function1[/* err */ Error | Null, Unit] => Unit,
    startSync: () => Unit
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), commitSync = js.Any.fromFunction0(commitSync), inTransaction = inTransaction.asInstanceOf[js.Any], prepareSync = js.Any.fromFunction1(prepareSync), query = js.Any.fromFunction2(query), querySync = js.Any.fromFunction1(querySync), rollback = js.Any.fromFunction1(rollback), rollbackSync = js.Any.fromFunction0(rollbackSync), start = js.Any.fromFunction1(start), startSync = js.Any.fromFunction0(startSync))
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
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
    def setCommit(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = this.set("commit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommitSync(value: () => Unit): Self = this.set("commitSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInTransaction(value: Boolean): Self = this.set("inTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareSync(value: String => FBStatement): Self = this.set("prepareSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuery(value: (String, js.Function2[/* err */ Error | Null, /* res */ FBResult, Unit]) => Unit): Self = this.set("query", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQuerySync(value: String => Unit): Self = this.set("querySync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRollback(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = this.set("rollback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRollbackSync(value: () => Unit): Self = this.set("rollbackSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartSync(value: () => Unit): Self = this.set("startSync", js.Any.fromFunction0(value))
  }
}
