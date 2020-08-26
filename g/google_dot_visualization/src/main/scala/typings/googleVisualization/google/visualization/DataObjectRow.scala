package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObjectRow extends js.Object {
  var c: js.Array[DataObjectCell] = js.native
  var p: js.UndefOr[js.Any] = js.native
}

object DataObjectRow {
  @scala.inline
  def apply(c: js.Array[DataObjectCell]): DataObjectRow = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectRow]
  }
  @scala.inline
  implicit class DataObjectRowOps[Self <: DataObjectRow] (val x: Self) extends AnyVal {
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
    def setCVarargs(value: DataObjectCell*): Self = this.set("c", js.Array(value :_*))
    @scala.inline
    def setC(value: js.Array[DataObjectCell]): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: js.Any): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
  }
  
}

