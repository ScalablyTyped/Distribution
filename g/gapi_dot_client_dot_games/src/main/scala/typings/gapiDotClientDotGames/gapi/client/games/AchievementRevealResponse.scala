package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementRevealResponse extends js.Object {
  /**
    * The current state of the achievement for which a reveal was attempted. This might be UNLOCKED if the achievement was already unlocked.
    * Possible values are:
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementRevealResponse. */
  var kind: js.UndefOr[String] = js.undefined
}

object AchievementRevealResponse {
  @scala.inline
  def apply(currentState: String = null, kind: String = null): AchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    if (currentState != null) __obj.updateDynamic("currentState")(currentState)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AchievementRevealResponse]
  }
}

