package typings.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnId extends js.Object {
  /** The id of the column in the base table from which this column is derived. */
  var columnId: js.UndefOr[Double] = js.native
  /** Offset to the entry in the list of base tables in the table definition. */
  var tableIndex: js.UndefOr[Double] = js.native
}

object ColumnId {
  @scala.inline
  def apply(): ColumnId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnId]
  }
  @scala.inline
  implicit class ColumnIdOps[Self <: ColumnId] (val x: Self) extends AnyVal {
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
    def setColumnId(value: Double): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnId: Self = this.set("columnId", js.undefined)
    @scala.inline
    def setTableIndex(value: Double): Self = this.set("tableIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableIndex: Self = this.set("tableIndex", js.undefined)
  }
  
}

