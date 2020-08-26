package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  var f: js.UndefOr[js.Array[TableCell]] = js.native
}

object TableRow {
  @scala.inline
  def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  @scala.inline
  implicit class TableRowOps[Self <: TableRow] (val x: Self) extends AnyVal {
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
    def setFVarargs(value: TableCell*): Self = this.set("f", js.Array(value :_*))
    @scala.inline
    def setF(value: js.Array[TableCell]): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
  }
  
}

