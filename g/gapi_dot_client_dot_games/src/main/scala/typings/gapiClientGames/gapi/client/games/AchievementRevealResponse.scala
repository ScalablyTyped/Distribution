package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementRevealResponse extends js.Object {
  /**
    * The current state of the achievement for which a reveal was attempted. This might be UNLOCKED if the achievement was already unlocked.
    * Possible values are:
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementRevealResponse. */
  var kind: js.UndefOr[String] = js.native
}

object AchievementRevealResponse {
  @scala.inline
  def apply(): AchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementRevealResponse]
  }
  @scala.inline
  implicit class AchievementRevealResponseOps[Self <: AchievementRevealResponse] (val x: Self) extends AnyVal {
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
    def setCurrentState(value: String): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentState: Self = this.set("currentState", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

