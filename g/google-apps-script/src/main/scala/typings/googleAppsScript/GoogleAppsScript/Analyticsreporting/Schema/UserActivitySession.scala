package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserActivitySession extends js.Object {
  var activities: js.UndefOr[js.Array[Activity]] = js.native
  var dataSource: js.UndefOr[String] = js.native
  var deviceCategory: js.UndefOr[String] = js.native
  var platform: js.UndefOr[String] = js.native
  var sessionDate: js.UndefOr[String] = js.native
  var sessionId: js.UndefOr[String] = js.native
}

object UserActivitySession {
  @scala.inline
  def apply(): UserActivitySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActivitySession]
  }
  @scala.inline
  implicit class UserActivitySessionOps[Self <: UserActivitySession] (val x: Self) extends AnyVal {
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
    def setDataSource(value: String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDeviceCategory(value: String): Self = this.set("deviceCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCategory: Self = this.set("deviceCategory", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSessionDate(value: String): Self = this.set("sessionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDate: Self = this.set("sessionDate", js.undefined)
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
  }
  
}

