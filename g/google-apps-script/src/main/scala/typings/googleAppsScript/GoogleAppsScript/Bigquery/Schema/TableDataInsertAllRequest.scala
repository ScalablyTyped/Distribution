package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDataInsertAllRequest extends js.Object {
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[TableDataInsertAllRequestRows]] = js.native
  var skipInvalidRows: js.UndefOr[Boolean] = js.native
  var templateSuffix: js.UndefOr[String] = js.native
}

object TableDataInsertAllRequest {
  @scala.inline
  def apply(): TableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllRequest]
  }
  @scala.inline
  implicit class TableDataInsertAllRequestOps[Self <: TableDataInsertAllRequest] (val x: Self) extends AnyVal {
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
    def setIgnoreUnknownValues(value: Boolean): Self = this.set("ignoreUnknownValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnknownValues: Self = this.set("ignoreUnknownValues", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRowsVarargs(value: TableDataInsertAllRequestRows*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[TableDataInsertAllRequestRows]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSkipInvalidRows(value: Boolean): Self = this.set("skipInvalidRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipInvalidRows: Self = this.set("skipInvalidRows", js.undefined)
    @scala.inline
    def setTemplateSuffix(value: String): Self = this.set("templateSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateSuffix: Self = this.set("templateSuffix", js.undefined)
  }
  
}

