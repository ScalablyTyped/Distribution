package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTableRequest extends js.Object {
  var columns: js.UndefOr[Double] = js.native
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.native
  var location: js.UndefOr[Location] = js.native
  var rows: js.UndefOr[Double] = js.native
}

object InsertTableRequest {
  @scala.inline
  def apply(): InsertTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRequest]
  }
  @scala.inline
  implicit class InsertTableRequestOps[Self <: InsertTableRequest] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = this.set("endOfSegmentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfSegmentLocation: Self = this.set("endOfSegmentLocation", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

