package typings.expoDashSqlite.buildSQLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSQLDatabase extends js.Object {
  def exec(queries: js.Array[Query], readOnly: Boolean, callback: SQLiteCallback): Unit
}

object WebSQLDatabase {
  @scala.inline
  def apply(exec: (js.Array[Query], Boolean, SQLiteCallback) => Unit): WebSQLDatabase = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction3(exec))
  
    __obj.asInstanceOf[WebSQLDatabase]
  }
}

