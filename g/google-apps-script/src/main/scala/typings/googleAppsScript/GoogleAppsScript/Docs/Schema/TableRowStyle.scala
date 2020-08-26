package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowStyle extends js.Object {
  var minRowHeight: js.UndefOr[Dimension] = js.native
}

object TableRowStyle {
  @scala.inline
  def apply(): TableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowStyle]
  }
  @scala.inline
  implicit class TableRowStyleOps[Self <: TableRowStyle] (val x: Self) extends AnyVal {
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
    def setMinRowHeight(value: Dimension): Self = this.set("minRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRowHeight: Self = this.set("minRowHeight", js.undefined)
  }
  
}

