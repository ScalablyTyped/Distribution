package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeCellsRequest extends js.Object {
  var mergeType: js.UndefOr[String] = js.native
  var range: js.UndefOr[GridRange] = js.native
}

object MergeCellsRequest {
  @scala.inline
  def apply(): MergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeCellsRequest]
  }
  @scala.inline
  implicit class MergeCellsRequestOps[Self <: MergeCellsRequest] (val x: Self) extends AnyVal {
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
    def setMergeType(value: String): Self = this.set("mergeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeType: Self = this.set("mergeType", js.undefined)
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

