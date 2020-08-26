package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDataInsertAllRequestRows extends js.Object {
  var insertId: js.UndefOr[String] = js.native
  var json: js.UndefOr[js.Object] = js.native
}

object TableDataInsertAllRequestRows {
  @scala.inline
  def apply(): TableDataInsertAllRequestRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequestRows]
  }
  @scala.inline
  implicit class TableDataInsertAllRequestRowsOps[Self <: TableDataInsertAllRequestRows] (val x: Self) extends AnyVal {
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
    def setInsertId(value: String): Self = this.set("insertId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertId: Self = this.set("insertId", js.undefined)
    @scala.inline
    def setJson(value: js.Object): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
  
}

