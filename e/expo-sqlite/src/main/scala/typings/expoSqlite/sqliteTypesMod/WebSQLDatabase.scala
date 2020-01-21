package typings.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSQLDatabase extends Database {
  def exec(queries: js.Array[Query], readOnly: Boolean, callback: SQLiteCallback): Unit = js.native
}

