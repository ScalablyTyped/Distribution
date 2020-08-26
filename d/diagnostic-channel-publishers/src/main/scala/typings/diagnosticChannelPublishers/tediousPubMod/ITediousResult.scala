package typings.diagnosticChannelPublishers.tediousPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITediousResult extends js.Object {
  var rowCount: Double = js.native
  var rows: js.Any = js.native
}

object ITediousResult {
  @scala.inline
  def apply(rowCount: Double, rows: js.Any): ITediousResult = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITediousResult]
  }
  @scala.inline
  implicit class ITediousResultOps[Self <: ITediousResult] (val x: Self) extends AnyVal {
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
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: js.Any): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

