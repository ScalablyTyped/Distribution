package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedAutoMatchingCriteria extends js.Object {
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other exclusive bitmasks, the result must be zero. Can be used to support exclusive
    * roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedAutoMatchingCriteria. */
  var kind: js.UndefOr[String] = js.undefined
  /** The maximum number of players that should be added to the match by auto-matching. */
  var maxAutoMatchingPlayers: js.UndefOr[Double] = js.undefined
  /** The minimum number of players that should be added to the match by auto-matching. */
  var minAutoMatchingPlayers: js.UndefOr[Double] = js.undefined
}

object TurnBasedAutoMatchingCriteria {
  @scala.inline
  def apply(
    exclusiveBitmask: String = null,
    kind: String = null,
    maxAutoMatchingPlayers: Int | Double = null,
    minAutoMatchingPlayers: Int | Double = null
  ): TurnBasedAutoMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    if (exclusiveBitmask != null) __obj.updateDynamic("exclusiveBitmask")(exclusiveBitmask)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxAutoMatchingPlayers != null) __obj.updateDynamic("maxAutoMatchingPlayers")(maxAutoMatchingPlayers.asInstanceOf[js.Any])
    if (minAutoMatchingPlayers != null) __obj.updateDynamic("minAutoMatchingPlayers")(minAutoMatchingPlayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedAutoMatchingCriteria]
  }
}

