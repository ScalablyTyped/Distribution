package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeTableCellsRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.native
  var tableRange: js.UndefOr[TableRange] = js.native
}

object MergeTableCellsRequest {
  @scala.inline
  def apply(): MergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeTableCellsRequest]
  }
  @scala.inline
  implicit class MergeTableCellsRequestOps[Self <: MergeTableCellsRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setTableRange(value: TableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
  }
  
}

