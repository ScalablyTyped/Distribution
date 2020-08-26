package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveActivity extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.native
  var actors: js.UndefOr[js.Array[Actor]] = js.native
  var primaryActionDetail: js.UndefOr[ActionDetail] = js.native
  var targets: js.UndefOr[js.Array[Target]] = js.native
  var timeRange: js.UndefOr[TimeRange] = js.native
  var timestamp: js.UndefOr[String] = js.native
}

object DriveActivity {
  @scala.inline
  def apply(): DriveActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveActivity]
  }
  @scala.inline
  implicit class DriveActivityOps[Self <: DriveActivity] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setActorsVarargs(value: Actor*): Self = this.set("actors", js.Array(value :_*))
    @scala.inline
    def setActors(value: js.Array[Actor]): Self = this.set("actors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActors: Self = this.set("actors", js.undefined)
    @scala.inline
    def setPrimaryActionDetail(value: ActionDetail): Self = this.set("primaryActionDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryActionDetail: Self = this.set("primaryActionDetail", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[Target]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setTimeRange(value: TimeRange): Self = this.set("timeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeRange: Self = this.set("timeRange", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

