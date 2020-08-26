package typings.googleAppsScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivitiesResponse extends js.Object {
  var activities: js.UndefOr[js.Array[Activity]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListActivitiesResponse {
  @scala.inline
  def apply(): ListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActivitiesResponse]
  }
  @scala.inline
  implicit class ListActivitiesResponseOps[Self <: ListActivitiesResponse] (val x: Self) extends AnyVal {
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
    def setActivitiesVarargs(value: Activity*): Self = this.set("activities", js.Array(value :_*))
    @scala.inline
    def setActivities(value: js.Array[Activity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

