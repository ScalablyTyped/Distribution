package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row extends js.Object {
  var cells: js.UndefOr[js.Array[Value]] = js.native
}

object Row {
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
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
    def setCellsVarargs(value: Value*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[Value]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
  }
  
}

