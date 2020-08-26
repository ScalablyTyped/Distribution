package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementUnlockResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUnlockResponse. */
  var kind: js.UndefOr[String] = js.native
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}

object AchievementUnlockResponse {
  @scala.inline
  def apply(): AchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUnlockResponse]
  }
  @scala.inline
  implicit class AchievementUnlockResponseOps[Self <: AchievementUnlockResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = this.set("newlyUnlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewlyUnlocked: Self = this.set("newlyUnlocked", js.undefined)
  }
  
}

