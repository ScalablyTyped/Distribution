package typings.expoDashSqlite.buildSQLiteDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var args: js.Array[_]
  var sql: String
}

object Query {
  @scala.inline
  def apply(args: js.Array[_], sql: String): Query = {
    val __obj = js.Dynamic.literal(args = args, sql = sql)
  
    __obj.asInstanceOf[Query]
  }
}

