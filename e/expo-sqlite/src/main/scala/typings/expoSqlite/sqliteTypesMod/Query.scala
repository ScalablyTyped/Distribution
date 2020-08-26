package typings.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var args: js.Array[_] = js.native
  var sql: String = js.native
}

object Query {
  @scala.inline
  def apply(args: js.Array[_], sql: String): Query = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
  }
  
}

