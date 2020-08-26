package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementResetMultipleForAllRequest extends js.Object {
  /** The IDs of achievements to reset. */
  var achievement_ids: js.UndefOr[js.Array[String]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#achievementResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.native
}

object AchievementResetMultipleForAllRequest {
  @scala.inline
  def apply(): AchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetMultipleForAllRequest]
  }
  @scala.inline
  implicit class AchievementResetMultipleForAllRequestOps[Self <: AchievementResetMultipleForAllRequest] (val x: Self) extends AnyVal {
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
    def setAchievement_idsVarargs(value: String*): Self = this.set("achievement_ids", js.Array(value :_*))
    @scala.inline
    def setAchievement_ids(value: js.Array[String]): Self = this.set("achievement_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchievement_ids: Self = this.set("achievement_ids", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

