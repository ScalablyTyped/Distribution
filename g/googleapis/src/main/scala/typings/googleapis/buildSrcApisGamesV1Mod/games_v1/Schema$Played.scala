package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for metadata about a player playing a game with the
  * currently authenticated user.
  */
@js.native
trait Schema$Played extends js.Object {
  /**
    * True if the player was auto-matched with the currently authenticated
    * user.
    */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#played.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last time the player played the game in milliseconds since the epoch
    * in UTC.
    */
  var timeMillis: js.UndefOr[String] = js.native
}

object Schema$Played {
  @scala.inline
  def apply(autoMatched: js.UndefOr[Boolean] = js.undefined, kind: String = null, timeMillis: String = null): Schema$Played = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMatched)) __obj.updateDynamic("autoMatched")(autoMatched.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Played]
  }
}

