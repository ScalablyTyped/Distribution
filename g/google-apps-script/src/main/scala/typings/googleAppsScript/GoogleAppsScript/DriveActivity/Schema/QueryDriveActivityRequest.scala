package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDriveActivityRequest extends js.Object {
  var ancestorName: js.UndefOr[String] = js.native
  var consolidationStrategy: js.UndefOr[ConsolidationStrategy] = js.native
  var filter: js.UndefOr[String] = js.native
  var itemName: js.UndefOr[String] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
}

object QueryDriveActivityRequest {
  @scala.inline
  def apply(): QueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDriveActivityRequest]
  }
  @scala.inline
  implicit class QueryDriveActivityRequestOps[Self <: QueryDriveActivityRequest] (val x: Self) extends AnyVal {
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
    def setAncestorName(value: String): Self = this.set("ancestorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAncestorName: Self = this.set("ancestorName", js.undefined)
    @scala.inline
    def setConsolidationStrategy(value: ConsolidationStrategy): Self = this.set("consolidationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsolidationStrategy: Self = this.set("consolidationStrategy", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setItemName(value: String): Self = this.set("itemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemName: Self = this.set("itemName", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

