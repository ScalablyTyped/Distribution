package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedAutoMatchingCriteria extends js.Object {
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other exclusive bitmasks, the result must be zero. Can be used to support exclusive
    * roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedAutoMatchingCriteria. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of players that should be added to the match by auto-matching. */
  var maxAutoMatchingPlayers: js.UndefOr[scala.Double] = js.undefined
  /** The minimum number of players that should be added to the match by auto-matching. */
  var minAutoMatchingPlayers: js.UndefOr[scala.Double] = js.undefined
}

