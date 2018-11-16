package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Leaderboard extends js.Object {
  /** The icon for the leaderboard. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The leaderboard ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboard. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the leaderboard. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * How scores are ordered.
               * Possible values are:
               * - "LARGER_IS_BETTER" - Larger values are better; scores are sorted in descending order.
               * - "SMALLER_IS_BETTER" - Smaller values are better; scores are sorted in ascending order.
               */
  var order: js.UndefOr[java.lang.String] = js.undefined
}

