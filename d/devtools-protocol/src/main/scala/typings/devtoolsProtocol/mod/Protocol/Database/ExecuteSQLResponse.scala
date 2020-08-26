package typings.devtoolsProtocol.mod.Protocol.Database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSQLResponse extends js.Object {
  var columnNames: js.UndefOr[js.Array[String]] = js.native
  var sqlError: js.UndefOr[Error] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object ExecuteSQLResponse {
  @scala.inline
  def apply(): ExecuteSQLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteSQLResponse]
  }
  @scala.inline
  implicit class ExecuteSQLResponseOps[Self <: ExecuteSQLResponse] (val x: Self) extends AnyVal {
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
    def setColumnNamesVarargs(value: String*): Self = this.set("columnNames", js.Array(value :_*))
    @scala.inline
    def setColumnNames(value: js.Array[String]): Self = this.set("columnNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNames: Self = this.set("columnNames", js.undefined)
    @scala.inline
    def setSqlError(value: Error): Self = this.set("sqlError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlError: Self = this.set("sqlError", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

