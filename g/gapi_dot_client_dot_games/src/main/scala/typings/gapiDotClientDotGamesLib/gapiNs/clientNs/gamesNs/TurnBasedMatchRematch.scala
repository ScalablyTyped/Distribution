package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TurnBasedMatchRematch extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchRematch. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The old match that the rematch was created from; will be updated such that the rematchId field will point at the new match. */
  var previousMatch: js.UndefOr[TurnBasedMatch] = js.undefined
  /** The newly created match; a rematch of the old match with the same participants. */
  var rematch: js.UndefOr[TurnBasedMatch] = js.undefined
}

