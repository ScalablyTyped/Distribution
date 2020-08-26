package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  var cols: js.Array[DataObjectColumn] = js.native
  var p: js.Any = js.native
  var rows: js.Array[DataObjectRow] = js.native
}

object DataObject {
  @scala.inline
  def apply(cols: js.Array[DataObjectColumn], p: js.Any, rows: js.Array[DataObjectRow]): DataObject = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
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
    def setColsVarargs(value: DataObjectColumn*): Self = this.set("cols", js.Array(value :_*))
    @scala.inline
    def setCols(value: js.Array[DataObjectColumn]): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: js.Any): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: DataObjectRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[DataObjectRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

