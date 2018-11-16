package typings
package firebirdLib.firebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Handles database connection and queries. Supports Synchronous and Asynchronous operation.
     */
@JSImport("firebird", "Connection")
@js.native
class Connection () extends js.Object {
  /**
           * A boolean readonly property indicating if Connection object is connected to database
           */
  var connected: scala.Boolean = js.native
  /**
           * A boolean readonly property indicating if connection is in started transaction state.
           */
  var inTransaction: scala.Boolean = js.native
  /**
           * Registers connection to listen for firebird event name, called from PL\SQL (in stored procedures or triggers) with post_event 'name'.
           *
           * @desc
           * You may set callback for event with
           * @code connection.on('fbevent', function(name, count){ <your code>));.
           * Where name is event name, and count is number of times event were posted.
           *
           * @param name Firebird Event Name.
           */
  def addFBevent(name: java.lang.String): scala.Unit = js.native
  /**
           * Asynchronous commit transaction.
           *
           * @desc
           * Read notes in @see commitSync() .
           *
           * @param callback function(err), where err is error object in case of error.
           */
  def commit(callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  /**
           * @summary
           * Synchronously commits current transaction.
           *
           * @desc
           * Notes:
           * There is only one transaction associated with connection.
           * Transacation is automatically started before any query if connection does not have active transaction (check @see inTransaction property).
           * You also should note that DDL statements (altering database structure) are commited automatically.
           * To run quieries in context of other transaction use @see Transaction object.
           */
  def commitSync(): scala.Unit = js.native
  /**
           * Asynchronously connects you to Database.
           *
           * @param database a database name in Firebird notation, i.e. <hostname>:<path to database file | alias>
           * @param callback function(err), where err is error object in case of error.
           */
  def connect(
    db: java.lang.String,
    user: java.lang.String,
    pass: java.lang.String,
    role: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Connects you to database,
           *
           * @param database a database name in Firebird notation, i.e. <hostname>:<path to database file | alias>
           * @throws raises exception on error (try to catch it).
           */
  def connectSync(db: java.lang.String, user: java.lang.String, pass: java.lang.String, role: java.lang.String): scala.Unit = js.native
  /**
           * Unsubscribes connection from getting events for name.
           *
           * @param name Firebird Event Name.
           */
  def deleteFBevent(name: java.lang.String): scala.Unit = js.native
  /**
           * Creates new FBblob object and opens it for write.
           * After finishing write operation and closing blob one may insert it in database passing as parameter to exec,
           * execSync methods of @see FBStatement object.
           */
  def newBlobSync(): FBBlob = js.native
  /**
           * Synchronously prepares SQL statement and returns FBStatement object.
           *
           * @param sql an SQL query to prepare.
           */
  def prepareSync(sql: java.lang.String): FBStatement = js.native
  /**
           * Asynchronously executes query.
           *
           * @param sql an SQL query to execute.
           * @param callback function(err,res), err - is error object or null, res - FBResult object.
           */
  def query(
    sql: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* res */ FBResult, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Executes SQL query.
           * @param sql an SQL query to execute.
           * @return object in case of success.
           * @throws Raises error otherwise.
           */
  def querySync(sql: java.lang.String): FBResult = js.native
  /**
           * Asynchronously rollbacks current transaction.
           *
           * @desc
           * Read notes in @see commitSync() .
           *
           * @param callback function(err), where err is error object in case of error.
           */
  def rollback(callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  /**
           * Synchronously rollbacks current transaction.
           *
           * @desc
           * Read notes in @see commitSync() .
           */
  def rollbackSync(): scala.Unit = js.native
  /**
           * Asynchronously starts new default transaction.
           *
           * @desc
           * Read notes in @see commitSync() .
           *
           * @param callback function(err), where err is error object in case of error.
           */
  def start(callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  /**
           * Creates new Transaction object and starts new transaction.
           *
           * @param callback function(err, transaction), where err is error object in case of error, transaction - newly created transaction.
           */
  def startNewTransaction(
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* transaction */ Transaction, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Creates new Transaction object and starts new transaction.
           * @returns created object.
           */
  def startNewTransactionSync(): Transaction = js.native
  /**
           * Synchronously starts new default transaction.
           *
           * @desc
           * The default transaction should be not in started state before call to this method.
           * Read notes in @see commitSync() .
           */
  def startSync(): scala.Unit = js.native
}

