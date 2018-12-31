package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestMilestone extends js.Object {
  /**
    * The completion reward data of the milestone, represented as a Base64-encoded string. This is a developer-specified binary blob with size between 0 and
    * 2 KB before encoding.
    */
  var completionRewardData: js.UndefOr[java.lang.String] = js.undefined
  /** The criteria of the milestone. */
  var criteria: js.UndefOr[js.Array[QuestCriterion]] = js.undefined
  /** The milestone ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questMilestone. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current state of the milestone.
    * Possible values are:
    * - "COMPLETED_NOT_CLAIMED" - The milestone is complete, but has not yet been claimed.
    * - "CLAIMED" - The milestone is complete and has been claimed.
    * - "NOT_COMPLETED" - The milestone has not yet been completed.
    * - "NOT_STARTED" - The milestone is for a quest that has not yet been accepted.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

