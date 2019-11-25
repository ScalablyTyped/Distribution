package typings.firebird.firebirdMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents SQL transaction.
  *
  * @desc
  * To get instance of this object call @see startNewTransactionSync or @see startNewTransaction methods of @see Connection object.
  * Transaction objects may be reused after commit or rollback.
  */
trait Transaction extends js.Object {
  /*
    * A boolean readonly property indicating if this transaction is in started state.
    */
  var inTransaction: Boolean
  /**
    * Asynchronous commit transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def commit(callback: js.Function1[/* err */ Error | Null, Unit]): Unit
  /**
    * Synchronously commits this transaction.
    *
    * @desc
    * Notes:
    * Transacation is automatically started before any query in context of this object
    * if this object does not have active transaction (check inTransaction property).
    * You also should note that DDL statements (altering database structure) are commited automatically.
    */
  def commitSync(): Unit
  /**
    * Synchronously prepares SQL statement
    *
    * @param sql an SQL query to prepare.
    * @returns object in context of this transaction.
    */
  def prepareSync(sql: String): FBStatement
  /**
    * Asynchronously executes query in context of this transaction.
    *
    * @param sql an SQL query to execute.
    * @param callback err - is error object or null, res - FBResult object.
    */
  def query(sql: String, callback: js.Function2[/* err */ Error | Null, /* res */ FBResult, Unit]): Unit
  /**
    * Executes SQL query in context of this transaction. Returns FBResult object in case of success. Raises error otherwise.
    *
    * @param sql an SQL query to execute.
    */
  def querySync(sql: String): Unit
  /**
    * Asynchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def rollback(callback: js.Function1[/* err */ Error | Null, Unit]): Unit
  /**
    * Synchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    */
  def rollbackSync(): Unit
  /**
    * Asynchronously starts new transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def start(callback: js.Function1[/* err */ Error | Null, Unit]): Unit
  /**
    * Synchronously starts transaction.
    *
    * @desc
    * The transaction should be not in started state before call to this method.
    * Read notes in @see commitSync() .
    * See @see inTransaction property.
    */
  def startSync(): Unit
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
}

