package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.MilestoneId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestMilestonesResource extends js.Object {
  /**
    * Report that a reward for the milestone corresponding to milestoneId for the quest corresponding to questId has been claimed by the currently authorized
    * user.
    */
  def claim(request: MilestoneId): Request[Unit] = js.native
}

object QuestMilestonesResource {
  @scala.inline
  def apply(claim: MilestoneId => Request[Unit]): QuestMilestonesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim))
    __obj.asInstanceOf[QuestMilestonesResource]
  }
  @scala.inline
  implicit class QuestMilestonesResourceOps[Self <: QuestMilestonesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClaim(value: MilestoneId => Request[Unit]): Self = this.set("claim", js.Any.fromFunction1(value))
  }
  
}

