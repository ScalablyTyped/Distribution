package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowData extends js.Object {
  var rowData: js.Array[String | ReactNode] = js.native
}

object RowData {
  @scala.inline
  def apply(rowData: js.Array[String | ReactNode]): RowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
  @scala.inline
  implicit class RowDataOps[Self <: RowData] (val x: Self) extends AnyVal {
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
    def setRowDataVarargs(value: (String | ReactNode)*): Self = this.set("rowData", js.Array(value :_*))
    @scala.inline
    def setRowData(value: js.Array[String | ReactNode]): Self = this.set("rowData", value.asInstanceOf[js.Any])
  }
  
}

