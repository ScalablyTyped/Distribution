package typings.expoSqlite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteTypesMod {
  
  @JSImport("expo-sqlite/build/SQLite.types", "SQLError")
  @js.native
  open class SQLError () extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
  }
  /* static members */
  object SQLError {
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.CONSTRAINT_ERR")
    @js.native
    def CONSTRAINT_ERR: Double = js.native
    inline def CONSTRAINT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTRAINT_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.DATABASE_ERR")
    @js.native
    def DATABASE_ERR: Double = js.native
    inline def DATABASE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATABASE_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.QUOTA_ERR")
    @js.native
    def QUOTA_ERR: Double = js.native
    inline def QUOTA_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    inline def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.TIMEOUT_ERR")
    @js.native
    def TIMEOUT_ERR: Double = js.native
    inline def TIMEOUT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.TOO_LARGE_ERR")
    @js.native
    def TOO_LARGE_ERR: Double = js.native
    inline def TOO_LARGE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_LARGE_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.UNKNOWN_ERR")
    @js.native
    def UNKNOWN_ERR: Double = js.native
    inline def UNKNOWN_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.VERSION_ERR")
    @js.native
    def VERSION_ERR: Double = js.native
    inline def VERSION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION_ERR")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Database extends StObject {
    
    def readTransaction(callback: SQLTransactionCallback): Unit = js.native
    def readTransaction(callback: SQLTransactionCallback, errorCallback: Unit, successCallback: js.Function0[Unit]): Unit = js.native
    def readTransaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
    def readTransaction(
      callback: SQLTransactionCallback,
      errorCallback: SQLTransactionErrorCallback,
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Execute a database transaction.
      * @param callback A function representing the transaction to perform. Takes a Transaction
      * (see below) as its only parameter, on which it can add SQL statements to execute.
      * @param errorCallback Called if an error occurred processing this transaction. Takes a single
      * parameter describing the error.
      * @param successCallback Called when the transaction has completed executing on the database.
      */
    def transaction(callback: SQLTransactionCallback): Unit = js.native
    def transaction(callback: SQLTransactionCallback, errorCallback: Unit, successCallback: js.Function0[Unit]): Unit = js.native
    def transaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
    def transaction(
      callback: SQLTransactionCallback,
      errorCallback: SQLTransactionErrorCallback,
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    
    var version: String = js.native
  }
  
  type DatabaseCallback = js.Function1[/* database */ Database, Unit]
  
  trait Query extends StObject {
    
    var args: js.Array[Any]
    
    var sql: String
  }
  object Query {
    
    inline def apply(args: js.Array[Any], sql: String): Query = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultSet extends StObject {
    
    /**
      * The row ID of the row that the SQL statement inserted into the database, if a row was inserted.
      */
    var insertId: js.UndefOr[Double] = js.undefined
    
    var rows: js.Array[StringDictionary[Any]]
    
    /**
      * The number of rows that were changed by the SQL statement.
      */
    var rowsAffected: Double
  }
  object ResultSet {
    
    inline def apply(rows: js.Array[StringDictionary[Any]], rowsAffected: Double): ResultSet = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSet]
    }
    
    extension [Self <: ResultSet](x: Self) {
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
      
      inline def setRows(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait ResultSetError extends StObject {
    
    var error: js.Error
  }
  object ResultSetError {
    
    inline def apply(error: js.Error): ResultSetError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSetError]
    }
    
    extension [Self <: ResultSetError](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQLResultSet extends StObject {
    
    /**
      * The row ID of the row that the SQL statement inserted into the database, if a row was inserted.
      */
    var insertId: js.UndefOr[Double] = js.undefined
    
    var rows: SQLResultSetRowList
    
    /**
      * The number of rows that were changed by the SQL statement.
      */
    var rowsAffected: Double
  }
  object SQLResultSet {
    
    inline def apply(rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLResultSet]
    }
    
    extension [Self <: SQLResultSet](x: Self) {
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
      
      inline def setRows(value: SQLResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQLResultSetRowList extends StObject {
    
    /**
      * The actual array of rows returned by the query. Can be used directly instead of
      * getting rows through rows.item().
      */
    var _array: js.Array[Any]
    
    /**
      * Returns the row with the given `index`. If there is no such row, returns `null`.
      * @param index Index of row to get.
      */
    def item(index: Double): Any
    
    /**
      * The number of rows returned by the query.
      */
    var length: Double
  }
  object SQLResultSetRowList {
    
    inline def apply(_array: js.Array[Any], item: Double => Any, length: Double): SQLResultSetRowList = {
      val __obj = js.Dynamic.literal(_array = _array.asInstanceOf[js.Any], item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLResultSetRowList]
    }
    
    extension [Self <: SQLResultSetRowList](x: Self) {
      
      inline def setItem(value: Double => Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def set_array(value: js.Array[Any]): Self = StObject.set(x, "_array", value.asInstanceOf[js.Any])
      
      inline def set_arrayVarargs(value: Any*): Self = StObject.set(x, "_array", js.Array(value*))
    }
  }
  
  type SQLStatementCallback = js.Function2[/* transaction */ SQLTransaction, /* resultSet */ SQLResultSet, Unit]
  
  type SQLStatementErrorCallback = js.Function2[/* transaction */ SQLTransaction, /* error */ SQLError, Boolean]
  
  @js.native
  trait SQLTransaction extends StObject {
    
    /**
      * Enqueue a SQL statement to execute in the transaction. Authors are strongly recommended to make
      * use of the `?` placeholder feature of the method to avoid against SQL injection attacks, and to
      * never construct SQL statements on the fly.
      * @param sqlStatement A string containing a database query to execute expressed as SQL. The string
      * may contain `?` placeholders, with values to be substituted listed in the `arguments` parameter.
      * @param args An array of values (numbers, strings or nulls) to substitute for `?` placeholders in the
      * SQL statement.
      * @param callback Called when the query is successfully completed during the transaction. Takes
      * two parameters: the transaction itself, and a `ResultSet` object (see below) with the results
      * of the query.
      * @param errorCallback Called if an error occurred executing this particular query in the
      * transaction. Takes two parameters: the transaction itself, and the error object.
      */
    def executeSql(sqlStatement: String): Unit = js.native
    def executeSql(sqlStatement: String, args: js.Array[Double | String | Null]): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: js.Array[Double | String | Null],
      callback: Unit,
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, args: js.Array[Double | String | Null], callback: SQLStatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: js.Array[Double | String | Null],
      callback: SQLStatementCallback,
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, args: Unit, callback: Unit, errorCallback: SQLStatementErrorCallback): Unit = js.native
    def executeSql(sqlStatement: String, args: Unit, callback: SQLStatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: Unit,
      callback: SQLStatementCallback,
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
  }
  
  type SQLTransactionCallback = js.Function1[/* transaction */ SQLTransaction, Unit]
  
  type SQLTransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
  
  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | Null], 
    /* resultSet */ js.UndefOr[js.Array[ResultSetError | ResultSet]], 
    Unit
  ]
  
  @js.native
  trait WebSQLDatabase
    extends StObject
       with Database {
    
    /**
      * Close the database.
      */
    def closeAsync(): Unit = js.native
    
    /**
      * Delete the database file.
      * > The database has to be closed prior to deletion.
      */
    def deleteAsync(): js.Promise[Unit] = js.native
    
    def exec(queries: js.Array[Query], readOnly: Boolean, callback: SQLiteCallback): Unit = js.native
  }
  
  trait Window extends StObject {
    
    var openDatabase: js.UndefOr[
        js.Function5[
          /* name */ String, 
          /* version */ String, 
          /* displayName */ String, 
          /* estimatedSize */ Double, 
          /* creationCallback */ js.UndefOr[DatabaseCallback], 
          Database
        ]
      ] = js.undefined
  }
  object Window {
    
    inline def apply(): Window = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setOpenDatabase(
        value: (/* name */ String, /* version */ String, /* displayName */ String, /* estimatedSize */ Double, /* creationCallback */ js.UndefOr[DatabaseCallback]) => Database
      ): Self = StObject.set(x, "openDatabase", js.Any.fromFunction5(value))
      
      inline def setOpenDatabaseUndefined: Self = StObject.set(x, "openDatabase", js.undefined)
    }
  }
}
