package typings.firebird

import org.scalablytyped.runtime.StringDictionary
import typings.firebird.firebirdBooleans.`false`
import typings.firebird.firebirdBooleans.`true`
import typings.firebird.firebirdStrings.all
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a type declaration file for 'firebird' package.
  *
  * Original document is [here](https://www.npmjs.com/package/firebird).
  */
object mod {
  
  @JSImport("firebird", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Handles database connection and queries. Supports Synchronous and Asynchronous operation.
    */
  @JSImport("firebird", "Connection")
  @js.native
  class Connection () extends StObject {
    
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
    def addFBevent(name: String): Unit = js.native
    
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
    def commitSync(): Unit = js.native
    
    /**
      * Asynchronously connects you to Database.
      *
      * @param database a database name in Firebird notation, i.e. <hostname>:<path to database file | alias>
      * @param callback function(err), where err is error object in case of error.
      */
    def connect(
      db: String,
      user: String,
      pass: String,
      role: String,
      callback: js.Function1[/* err */ Error | Null, Unit]
    ): Unit = js.native
    
    /**
      * Connects you to database,
      *
      * @param database a database name in Firebird notation, i.e. <hostname>:<path to database file | alias>
      * @throws raises exception on error (try to catch it).
      */
    def connectSync(db: String, user: String, pass: String, role: String): Unit = js.native
    
    /**
      * A boolean readonly property indicating if Connection object is connected to database
      */
    var connected: Boolean = js.native
    
    /**
      * Unsubscribes connection from getting events for name.
      *
      * @param name Firebird Event Name.
      */
    def deleteFBevent(name: String): Unit = js.native
    
    /**
      * A boolean readonly property indicating if connection is in started transaction state.
      */
    var inTransaction: Boolean = js.native
    
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
    def prepareSync(sql: String): FBStatement = js.native
    
    /**
      * Asynchronously executes query.
      *
      * @param sql an SQL query to execute.
      * @param callback function(err,res), err - is error object or null, res - FBResult object.
      */
    def query(sql: String, callback: js.Function2[/* err */ Error | Null, /* res */ FBResult, Unit]): Unit = js.native
    
    /**
      * Executes SQL query.
      * @param sql an SQL query to execute.
      * @return object in case of success.
      * @throws Raises error otherwise.
      */
    def querySync(sql: String): FBResult = js.native
    
    /**
      * Asynchronously rollbacks current transaction.
      *
      * @desc
      * Read notes in @see commitSync() .
      *
      * @param callback function(err), where err is error object in case of error.
      */
    def rollback(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    /**
      * Synchronously rollbacks current transaction.
      *
      * @desc
      * Read notes in @see commitSync() .
      */
    def rollbackSync(): Unit = js.native
    
    /**
      * Asynchronously starts new default transaction.
      *
      * @desc
      * Read notes in @see commitSync() .
      *
      * @param callback function(err), where err is error object in case of error.
      */
    def start(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    /**
      * Creates new Transaction object and starts new transaction.
      *
      * @param callback function(err, transaction), where err is error object in case of error, transaction - newly created transaction.
      */
    def startNewTransaction(callback: js.Function2[/* err */ Error | Null, /* transaction */ Transaction, Unit]): Unit = js.native
    
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
    def startSync(): Unit = js.native
  }
  
  /**
    * Represents results of SQL query if any.
    * You should use this object to fetch rows from database.
    * Each row may be represented as array of field values or as object with named fields.
    *
    * @see DataType
    */
  @JSImport("firebird", "FBResult")
  @js.native
  class FBResult () extends StObject {
    
    /**
      * Asynchronously fetches rows one by one.
      *
      * @param rowCount number of rows to fetch from results
      * @param asObject format of returned rows. When false - methods returns array of array, when true - array of objects
      * @param rowCallback function(row), row - Array or Object (depends on asObject parameter) representing single row from result; called for each fetched row.
      * @param eofCallback function(err,eof), err - Error object in case of error, or null; eof - true | false. called when whole operation is complete.
      */
    def fetch(
      rowCount: Double,
      asObject: Boolean,
      rowCallback: js.Function1[/* row */ js.Array[DataType] | StringDictionary[DataType], Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    def fetch(
      rowCount: all,
      asObject: `false`,
      rowCallback: js.Function1[/* row */ js.Array[DataType], Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    def fetch(
      rowCount: all,
      asObject: `true`,
      rowCallback: js.Function1[/* row */ StringDictionary[DataType], Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * @summary
      * Synchronously fetches result rows.
      *
      * @desc
      * If you pass "all" as rowCount - it will fetch all result rows.
      * If you pass less rowCount than are actually in result, it will return specified number of rows.
      * You may call fetchSync multiple times until all rows will be fetched.
      * If you specify more rowCount than available it will return only actual number of rows.
      *
      * @param rowCount number of rows to fetch from results;
      * @param asObject format of returned rows. When false - methods returns array of array, when true - array of objects.
      */
    def fetchSync(rowCount: Double, asObject: Boolean): js.Array[js.Array[DataType] | StringDictionary[DataType]] = js.native
    def fetchSync(rowCount: all, asObject: `false`): js.Array[js.Array[DataType]] = js.native
    def fetchSync(rowCount: all, asObject: `true`): js.Array[StringDictionary[DataType]] = js.native
    @JSName("fetchSync")
    def fetchSync_T_Object[T /* <: js.Object */](rowCount: all, asObject: `true`): js.Array[T] = js.native
    @JSName("fetchSync")
    def fetchSync_all(rowCount: all, asObject: Boolean): js.Array[js.Array[DataType] | StringDictionary[DataType]] = js.native
    @JSName("fetchSync")
    def fetchSync_false(rowCount: Double, asObject: `false`): js.Array[js.Array[DataType]] = js.native
    @JSName("fetchSync")
    def fetchSync_true(rowCount: Double, asObject: `true`): js.Array[StringDictionary[DataType]] = js.native
    @JSName("fetchSync")
    def fetchSync_true_T_Object[T /* <: js.Object */](rowCount: Double, asObject: `true`): js.Array[T] = js.native
    
    @JSName("fetch")
    def fetch_T_Object[T /* <: js.Object */](
      rowCount: all,
      asObject: `true`,
      rowCallback: js.Function1[/* row */ T, Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    @JSName("fetch")
    def fetch_all(
      rowCount: all,
      asObject: Boolean,
      rowCallback: js.Function1[/* row */ js.Array[DataType] | StringDictionary[DataType], Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    @JSName("fetch")
    def fetch_false(
      rowCount: Double,
      asObject: `false`,
      rowCallback: js.Function1[/* row */ js.Array[DataType], Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    @JSName("fetch")
    def fetch_true(
      rowCount: Double,
      asObject: `true`,
      rowCallback: js.Function1[/* row */ StringDictionary[DataType], Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
    @JSName("fetch")
    def fetch_true_T_Object[T /* <: js.Object */](
      rowCount: Double,
      asObject: `true`,
      rowCallback: js.Function1[/* row */ T, Unit],
      eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
    ): Unit = js.native
  }
  
  /**
    * Represents prepared SQL query (returned by @see Connection.prepare() and @see Connection.prepareSync()).
    *
    * @see FBStatement is derived form @see FBResult class.
    * So it can fetch rows just like @see FBresult object after call to @see execSync, exec methods.
    */
  @JSImport("firebird", "FBStatement")
  @js.native
  class FBStatement () extends FBResult {
    
    /**
      * Asynchronously executes prepared statement with given parameters.
      *
      * @desc
      * @see FBStatement emits 'result' or 'error' event.
      * You may fetch rows with methods inherited from @see FBResult after 'result' event emitted.
      * Statement is executed in context of default connection transaction.
      *
      * @param params parameters of prepared statement in the same order as in SQL and with appropriate types.
      */
    def exec(params: DataType*): Unit = js.native
    
    /**
      * Same as @see exec but executes statement in context of given @see Transaction obejct.
      */
    def execInTrans(transaction: Transaction, params: DataType*): Unit = js.native
    
    /**
      * Same as @see execSync but executes statement in context of given @see Transaction obejct.
      */
    def execInTransSync(transaction: Transaction, params: DataType*): Unit = js.native
    
    /**
      * Synchronously executes prepared statement with given parameters.
      *
      * @desc
      * You may fetch rows with methods inherited from @see FBResult.
      * @see Statement is executed in context of default connection transaction.
      *
      * @param params parameters of prepared statement in the same order as in SQL and with appropriate types.
      */
    def execSync(params: DataType*): Unit = js.native
  }
  
  /**
    * Represents BLOB stream.
    *
    * @desc
    * Create BLOB stream using
    * @code var strm = new fb.Stream(FBblob);.
    *
    * You may pipe strm to/from NodeJS Stream objects (fs or socket).
    * You may also look at [NodeJS Streams reference](https://nodejs.org/api/stream.html).
    */
  @JSImport("firebird", "Stream")
  @js.native
  class Stream protected ()
    extends typings.node.streamMod.Stream {
    def this(blob: FBBlob) = this()
    
    def check_destroyed(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    def end(): Unit = js.native
    def end(buffer: Buffer): Unit = js.native
    def end(buffer: Buffer, cb: js.Function): Unit = js.native
    def end(str: String): Unit = js.native
    def end(str: String, cb: js.Function): Unit = js.native
    def end(str: String, encoding: String): Unit = js.native
    def end(str: String, encoding: String, cb: js.Function): Unit = js.native
    def end(str: String, encoding: Unit, cb: js.Function): Unit = js.native
    
    def pause(): this.type = js.native
    
    /* NodeJS.ReadStream */
    var readable: Boolean = js.native
    
    def resume(): this.type = js.native
    
    /* NodeJS.WriteStream */
    var writable: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function): Boolean = js.native
    def write(buffer: Buffer): Boolean = js.native
    def write(buffer: Buffer, cb: js.Function): Boolean = js.native
    def write(str: String, encoding: String): Boolean = js.native
    def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
    def write(str: String, encoding: Unit, cb: js.Function): Boolean = js.native
  }
  
  /**
    * @see createConnection() method will create Firebird Connection object for you
    */
  inline def createConnection(): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")().asInstanceOf[Connection]
  
  /**
    * @desc
    * Here is Firebird to Node data type accordance:
    *
    * | Firebird  | Node      |
    * | :-------  | :-------- |
    * | DATE       |    Date   |
    * | TIME       |    Date   |
    * | TIMESTAMP |     Date   |
    * | CHAR      |     String |
    * | VARCHAR   |     String |
    * | SMALLINT  |     Integer|
    * | INTEGER   |     Integer|
    * | NUMERIC   |     Number |
    * | DECIMAL   |     Number |
    * | FLOAT     |     Number |
    * | DOUBLE    |     Number |
    * | BLOB      |     FBblob |
    */
  type DataType = Date | String | Double | FBBlob
  
  /**
    * Represents BLOB data type.
    */
  @js.native
  trait FBBlob extends StObject {
    
    /**
      * Synchronously closes previously opened blob.
      */
    def _closeSync(): Unit = js.native
    
    /**
      * Synchronously opens blob for reading.
      */
    def _openSync(): Unit = js.native
    
    /**
      * Asynchronously reads BLOB segment (chunk) into buffer. Tries to fill whole buffer with data.
      *
      * @param buffer Node buffer to fill with data.
      * @param callback function(err,buffer,len), err - Error object in case of error, or null;buffer - buffer filled with data; len - actual data length.
      */
    def _read(
      buffer: Buffer,
      callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
    ): Unit = js.native
    
    /**
      * Asynchronously reads all data from BLOB field.
      * Object emits events while reading data error, drain',end`.
      *
      * @param initialSize - optional, initial result buffer to allocate, default = 0
      * @param chunkSize - optional, size of chunk used to read data, default = 1024
      * @param callback - optional, function (err, buffer, len), err - Error object in case of error, or null;buffer - buffer filled with data; len - actual data length.
      */
    def _readAll(): Unit = js.native
    def _readAll(callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]): Unit = js.native
    def _readAll(initialSize: Double): Unit = js.native
    def _readAll(
      initialSize: Double,
      callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
    ): Unit = js.native
    def _readAll(initialSize: Double, chunkSize: Double): Unit = js.native
    def _readAll(
      initialSize: Double,
      chunkSize: Double,
      callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
    ): Unit = js.native
    def _readAll(
      initialSize: Double,
      chunkSize: Unit,
      callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
    ): Unit = js.native
    def _readAll(initialSize: Unit, chunkSize: Double): Unit = js.native
    def _readAll(
      initialSize: Unit,
      chunkSize: Double,
      callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
    ): Unit = js.native
    def _readAll(
      initialSize: Unit,
      chunkSize: Unit,
      callback: js.Function3[/* err */ Error | Null, /* buffer */ Buffer, /* len */ Double, Unit]
    ): Unit = js.native
    
    /**
      * Synchronously reads BLOB segment (chunk) into buffer. Tries to fill whole buffer with data.
      *
      * @param buffer Node buffer to fill with data.
      * @returns actual number of bytes read.
      */
    def _readSync(buffer: Buffer): Double = js.native
    
    /**
      * Asynchronously writes BLOB segment (chunk) from buffer and calls callback function if any.
      *
      * @param buffer Node buffer to write from to blob;
      * @param len optional length parameter, if specified only len bytes from buffer will be writen.
      * @param callback function(err), err - Error object in case of error, or null;
      */
    def _write(buffer: Buffer): Unit = js.native
    def _write(buffer: Buffer, len: Double): Unit = js.native
    def _write(buffer: Buffer, len: Double, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def _write(buffer: Buffer, len: Unit, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    /**
      * Synchronously writes BLOB segment (chunk) from buffer.
      *
      * @param buffer Node buffer to write from to blob;
      * @param len optional length parameter, if specified only len bytes from buffer will be writen.
      * @returns number of bytes actually writen.
      */
    def _writeSync(buffer: Buffer): Double = js.native
    def _writeSync(buffer: Buffer, len: Double): Double = js.native
  }
  
  /**
    * Represents SQL transaction.
    *
    * @desc
    * To get instance of this object call @see startNewTransactionSync or @see startNewTransaction methods of @see Connection object.
    * Transaction objects may be reused after commit or rollback.
    */
  trait Transaction extends StObject {
    
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
    
    /*
      * A boolean readonly property indicating if this transaction is in started state.
      */
    var inTransaction: Boolean
    
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
    
    inline def apply(
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
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setCommit(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
      
      inline def setCommitSync(value: () => Unit): Self = StObject.set(x, "commitSync", js.Any.fromFunction0(value))
      
      inline def setInTransaction(value: Boolean): Self = StObject.set(x, "inTransaction", value.asInstanceOf[js.Any])
      
      inline def setPrepareSync(value: String => FBStatement): Self = StObject.set(x, "prepareSync", js.Any.fromFunction1(value))
      
      inline def setQuery(value: (String, js.Function2[/* err */ Error | Null, /* res */ FBResult, Unit]) => Unit): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      inline def setQuerySync(value: String => Unit): Self = StObject.set(x, "querySync", js.Any.fromFunction1(value))
      
      inline def setRollback(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = StObject.set(x, "rollback", js.Any.fromFunction1(value))
      
      inline def setRollbackSync(value: () => Unit): Self = StObject.set(x, "rollbackSync", js.Any.fromFunction0(value))
      
      inline def setStart(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartSync(value: () => Unit): Self = StObject.set(x, "startSync", js.Any.fromFunction0(value))
    }
  }
}
