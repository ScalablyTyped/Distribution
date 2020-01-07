package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a Quest Criterion resource.
  */
@js.native
trait Schema$QuestCriterion extends js.Object {
  /**
    * The total number of times the associated event must be incremented for
    * the player to complete this quest.
    */
  var completionContribution: js.UndefOr[Schema$QuestContribution] = js.native
  /**
    * The number of increments the player has made toward the completion count
    * event increments required to complete the quest. This value will not
    * exceed the completion contribution. There will be no currentContribution
    * until the player has accepted the quest.
    */
  var currentContribution: js.UndefOr[Schema$QuestContribution] = js.native
  /**
    * The ID of the event the criterion corresponds to.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * The value of the event associated with this quest at the time that the
    * quest was accepted. This value may change if event increments that took
    * place before the start of quest are uploaded after the quest starts.
    * There will be no initialPlayerProgress until the player has accepted the
    * quest.
    */
  var initialPlayerProgress: js.UndefOr[Schema$QuestContribution] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questCriterion.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$QuestCriterion {
  @scala.inline
  def apply(
    completionContribution: Schema$QuestContribution = null,
    currentContribution: Schema$QuestContribution = null,
    eventId: String = null,
    initialPlayerProgress: Schema$QuestContribution = null,
    kind: String = null
  ): Schema$QuestCriterion = {
    val __obj = js.Dynamic.literal()
    if (completionContribution != null) __obj.updateDynamic("completionContribution")(completionContribution.asInstanceOf[js.Any])
    if (currentContribution != null) __obj.updateDynamic("currentContribution")(currentContribution.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (initialPlayerProgress != null) __obj.updateDynamic("initialPlayerProgress")(initialPlayerProgress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuestCriterion]
  }
}

