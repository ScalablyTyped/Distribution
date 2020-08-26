package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesListResponse extends js.Object {
  var floodlightActivities: js.UndefOr[js.Array[FloodlightActivity]] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object FloodlightActivitiesListResponse {
  @scala.inline
  def apply(): FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivitiesListResponse]
  }
  @scala.inline
  implicit class FloodlightActivitiesListResponseOps[Self <: FloodlightActivitiesListResponse] (val x: Self) extends AnyVal {
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
    def setFloodlightActivitiesVarargs(value: FloodlightActivity*): Self = this.set("floodlightActivities", js.Array(value :_*))
    @scala.inline
    def setFloodlightActivities(value: js.Array[FloodlightActivity]): Self = this.set("floodlightActivities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivities: Self = this.set("floodlightActivities", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

