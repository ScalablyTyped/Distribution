package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TurnBasedMatchData extends js.Object {
  /** The byte representation of the data (limited to 128 kB), as a Base64-encoded string with the URL_SAFE encoding option. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** True if this match has data available but it wasn't returned in a list response; fetching the match individually will retrieve this data. */
  var dataAvailable: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchData. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

