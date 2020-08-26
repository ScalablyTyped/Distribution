package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a leaderboard update for FBInstant.updateAsync.
  */
@js.native
trait LeaderboardUpdatePayload extends js.Object {
  /**
    * For a leaderboard update, this should be 'LEADERBOARD'. text. By default we will use a localized 'Play Now' as the button text.
    */
  var action: UpdateAction = js.native
  /**
    * The name of the leaderboard to feature in the update.
    */
  var name: String = js.native
  /**
    * Optional text message. If not specified, a localized fallback message will be provided instead.
    */
  var text: js.UndefOr[String] = js.native
}

object LeaderboardUpdatePayload {
  @scala.inline
  def apply(action: UpdateAction, name: String): LeaderboardUpdatePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardUpdatePayload]
  }
  @scala.inline
  implicit class LeaderboardUpdatePayloadOps[Self <: LeaderboardUpdatePayload] (val x: Self) extends AnyVal {
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
    def setAction(value: UpdateAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

