package typings.expoSqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqliteTypesMod {
  type DatabaseCallback = js.Function1[/* database */ typings.expoSqlite.sqliteTypesMod.Database, scala.Unit]
  type SQLStatementCallback = js.Function2[
    /* transaction */ typings.expoSqlite.sqliteTypesMod.SQLTransaction, 
    /* resultSet */ typings.expoSqlite.sqliteTypesMod.SQLResultSet, 
    scala.Unit
  ]
  type SQLStatementErrorCallback = js.Function2[
    /* transaction */ typings.expoSqlite.sqliteTypesMod.SQLTransaction, 
    /* error */ typings.expoSqlite.sqliteTypesMod.SQLError, 
    scala.Boolean
  ]
  type SQLTransactionCallback = js.Function1[/* transaction */ typings.expoSqlite.sqliteTypesMod.SQLTransaction, scala.Unit]
  type SQLTransactionErrorCallback = js.Function1[/* error */ typings.expoSqlite.sqliteTypesMod.SQLError, scala.Unit]
  type SQLVoidCallback = js.Function0[scala.Unit]
  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* resultSet */ js.UndefOr[
      js.Array[
        typings.expoSqlite.sqliteTypesMod.ResultSetError | typings.expoSqlite.sqliteTypesMod.ResultSet
      ]
    ], 
    scala.Unit
  ]
}
