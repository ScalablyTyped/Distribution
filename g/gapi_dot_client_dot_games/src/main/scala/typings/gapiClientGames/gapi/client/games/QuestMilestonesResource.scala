package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyMilestoneId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestMilestonesResource extends js.Object {
  /**
    * Report that a reward for the milestone corresponding to milestoneId for the quest corresponding to questId has been claimed by the currently authorized
    * user.
    */
  def claim(request: AnonAltConsistencyTokenFieldsKeyMilestoneId): Request_[Unit]
}

object QuestMilestonesResource {
  @scala.inline
  def apply(claim: AnonAltConsistencyTokenFieldsKeyMilestoneId => Request_[Unit]): QuestMilestonesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim))
  
    __obj.asInstanceOf[QuestMilestonesResource]
  }
}

