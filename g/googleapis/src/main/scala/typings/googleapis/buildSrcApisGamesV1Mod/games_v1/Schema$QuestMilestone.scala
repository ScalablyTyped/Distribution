package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a Quest Milestone resource.
  */
@js.native
trait Schema$QuestMilestone extends js.Object {
  /**
    * The completion reward data of the milestone, represented as a
    * Base64-encoded string. This is a developer-specified binary blob with
    * size between 0 and 2 KB before encoding.
    */
  var completionRewardData: js.UndefOr[String] = js.native
  /**
    * The criteria of the milestone.
    */
  var criteria: js.UndefOr[js.Array[Schema$QuestCriterion]] = js.native
  /**
    * The milestone ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questMilestone.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current state of the milestone. Possible values are:   -
    * &quot;COMPLETED_NOT_CLAIMED&quot; - The milestone is complete, but has
    * not yet been claimed.  - &quot;CLAIMED&quot; - The milestone is complete
    * and has been claimed.  - &quot;NOT_COMPLETED&quot; - The milestone has
    * not yet been completed.  - &quot;NOT_STARTED&quot; - The milestone is for
    * a quest that has not yet been accepted.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$QuestMilestone {
  @scala.inline
  def apply(
    completionRewardData: String = null,
    criteria: js.Array[Schema$QuestCriterion] = null,
    id: String = null,
    kind: String = null,
    state: String = null
  ): Schema$QuestMilestone = {
    val __obj = js.Dynamic.literal()
    if (completionRewardData != null) __obj.updateDynamic("completionRewardData")(completionRewardData.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuestMilestone]
  }
}

