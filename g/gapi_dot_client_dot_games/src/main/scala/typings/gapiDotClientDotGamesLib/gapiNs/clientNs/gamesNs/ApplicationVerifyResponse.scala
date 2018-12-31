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

