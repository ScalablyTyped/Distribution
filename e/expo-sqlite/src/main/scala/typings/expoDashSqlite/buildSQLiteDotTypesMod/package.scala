package typings.expoDashSqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSQLiteDotTypesMod {
  import typings.std.Error

  type DatabaseCallback = js.Function1[/* database */ Database, Unit]
  type SQLStatementCallback = js.Function2[/* transaction */ SQLTransaction, /* resultSet */ SQLResultSet, Unit]
  type SQLStatementErrorCallback = js.Function2[/* transaction */ SQLTransaction, /* error */ SQLError, Boolean]
  type SQLTransactionCallback = js.Function1[/* transaction */ SQLTransaction, Unit]
  type SQLTransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
  type SQLVoidCallback = js.Function0[Unit]
  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[Error | Null], 
    /* resultSet */ js.UndefOr[js.Array[ResultSetError | ResultSet]], 
    Unit
  ]
}
