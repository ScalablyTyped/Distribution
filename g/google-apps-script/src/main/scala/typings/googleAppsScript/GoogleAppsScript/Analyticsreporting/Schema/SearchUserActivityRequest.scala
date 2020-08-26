package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchUserActivityRequest extends js.Object {
  var activityTypes: js.UndefOr[js.Array[String]] = js.native
  var dateRange: js.UndefOr[DateRange] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var user: js.UndefOr[User] = js.native
  var viewId: js.UndefOr[String] = js.native
}

object SearchUserActivityRequest {
  @scala.inline
  def apply(): SearchUserActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserActivityRequest]
  }
  @scala.inline
  implicit class SearchUserActivityRequestOps[Self <: SearchUserActivityRequest] (val x: Self) extends AnyVal {
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
    def setActivityTypesVarargs(value: String*): Self = this.set("activityTypes", js.Array(value :_*))
    @scala.inline
    def setActivityTypes(value: js.Array[String]): Self = this.set("activityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTypes: Self = this.set("activityTypes", js.undefined)
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewId: Self = this.set("viewId", js.undefined)
  }
  
}

