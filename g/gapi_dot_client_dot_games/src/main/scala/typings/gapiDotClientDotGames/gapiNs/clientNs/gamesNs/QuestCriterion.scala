package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestCriterion extends js.Object {
  /** The total number of times the associated event must be incremented for the player to complete this quest. */
  var completionContribution: js.UndefOr[QuestContribution] = js.undefined
  /**
    * The number of increments the player has made toward the completion count event increments required to complete the quest. This value will not exceed
    * the completion contribution.
    * There will be no currentContribution until the player has accepted the quest.
    */
  var currentContribution: js.UndefOr[QuestContribution] = js.undefined
  /** The ID of the event the criterion corresponds to. */
  var eventId: js.UndefOr[String] = js.undefined
  /**
    * The value of the event associated with this quest at the time that the quest was accepted. This value may change if event increments that took place
    * before the start of quest are uploaded after the quest starts.
    * There will be no initialPlayerProgress until the player has accepted the quest.
    */
  var initialPlayerProgress: js.UndefOr[QuestContribution] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questCriterion. */
  var kind: js.UndefOr[String] = js.undefined
}

object QuestCriterion {
  @scala.inline
  def apply(
    completionContribution: QuestContribution = null,
    currentContribution: QuestContribution = null,
    eventId: String = null,
    initialPlayerProgress: QuestContribution = null,
    kind: String = null
  ): QuestCriterion = {
    val __obj = js.Dynamic.literal()
    if (completionContribution != null) __obj.updateDynamic("completionContribution")(completionContribution)
    if (currentContribution != null) __obj.updateDynamic("currentContribution")(currentContribution)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (initialPlayerProgress != null) __obj.updateDynamic("initialPlayerProgress")(initialPlayerProgress)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[QuestCriterion]
  }
}

