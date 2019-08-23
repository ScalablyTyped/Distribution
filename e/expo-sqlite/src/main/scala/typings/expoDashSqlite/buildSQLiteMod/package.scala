package typings.expoDashSqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSQLiteMod {
  import typings.std.Error

  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[Error | Null], 
    /* resultSet */ js.UndefOr[js.Array[ResultSetError | ResultSet]], 
    Unit
  ]
}
