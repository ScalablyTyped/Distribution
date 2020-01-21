package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestMilestone extends js.Object {
  /**
    * The completion reward data of the milestone, represented as a Base64-encoded string. This is a developer-specified binary blob with size between 0 and
    * 2 KB before encoding.
    */
  var completionRewardData: js.UndefOr[String] = js.undefined
  /** The criteria of the milestone. */
  var criteria: js.UndefOr[js.Array[QuestCriterion]] = js.undefined
  /** The milestone ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questMilestone. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The current state of the milestone.
    * Possible values are:
    * - "COMPLETED_NOT_CLAIMED" - The milestone is complete, but has not yet been claimed.
    * - "CLAIMED" - The milestone is complete and has been claimed.
    * - "NOT_COMPLETED" - The milestone has not yet been completed.
    * - "NOT_STARTED" - The milestone is for a quest that has not yet been accepted.
    */
  var state: js.UndefOr[String] = js.undefined
}

object QuestMilestone {
  @scala.inline
  def apply(
    completionRewardData: String = null,
    criteria: js.Array[QuestCriterion] = null,
    id: String = null,
    kind: String = null,
    state: String = null
  ): QuestMilestone = {
    val __obj = js.Dynamic.literal()
    if (completionRewardData != null) __obj.updateDynamic("completionRewardData")(completionRewardData.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestMilestone]
  }
}

