package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDataInsertAllResponse extends js.Object {
  var insertErrors: js.UndefOr[js.Array[TableDataInsertAllResponseInsertErrors]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object TableDataInsertAllResponse {
  @scala.inline
  def apply(): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
  @scala.inline
  implicit class TableDataInsertAllResponseOps[Self <: TableDataInsertAllResponse] (val x: Self) extends AnyVal {
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
    def setInsertErrorsVarargs(value: TableDataInsertAllResponseInsertErrors*): Self = this.set("insertErrors", js.Array(value :_*))
    @scala.inline
    def setInsertErrors(value: js.Array[TableDataInsertAllResponseInsertErrors]): Self = this.set("insertErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertErrors: Self = this.set("insertErrors", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

