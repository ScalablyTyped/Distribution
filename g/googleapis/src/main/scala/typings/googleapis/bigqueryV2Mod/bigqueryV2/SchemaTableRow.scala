package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableRow extends js.Object {
  /**
    * Represents a single row in the result set, consisting of one or more
    * fields.
    */
  var f: js.UndefOr[js.Array[SchemaTableCell]] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  @scala.inline
  implicit class SchemaTableRowOps[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
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
    def setFVarargs(value: SchemaTableCell*): Self = this.set("f", js.Array(value :_*))
    @scala.inline
    def setF(value: js.Array[SchemaTableCell]): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
  }
  
}

