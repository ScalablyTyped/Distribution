package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVerifyResponse extends js.Object {
  /** An alternate ID that was once used for the player that was issued the auth token used in this request. (This field is not normally populated.) */
  var alternate_player_id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#applicationVerifyResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the player that was issued the auth token used in this request. */
  var player_id: js.UndefOr[java.lang.String] = js.undefined
}

object ApplicationVerifyResponse {
  @scala.inline
  def apply(
    alternate_player_id: java.lang.String = null,
    kind: java.lang.String = null,
    player_id: java.lang.String = null
  ): ApplicationVerifyResponse = {
    val __obj = js.Dynamic.literal()
    if (alternate_player_id != null) __obj.updateDynamic("alternate_player_id")(alternate_player_id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (player_id != null) __obj.updateDynamic("player_id")(player_id)
    __obj.asInstanceOf[ApplicationVerifyResponse]
  }
}

