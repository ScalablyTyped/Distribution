package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchDataRequest extends js.Object {
  /** The byte representation of the data (limited to 128 kB), as a Base64-encoded string with the URL_SAFE encoding option. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchDataRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object TurnBasedMatchDataRequest {
  @scala.inline
  def apply(data: java.lang.String = null, kind: java.lang.String = null): TurnBasedMatchDataRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TurnBasedMatchDataRequest]
  }
}

