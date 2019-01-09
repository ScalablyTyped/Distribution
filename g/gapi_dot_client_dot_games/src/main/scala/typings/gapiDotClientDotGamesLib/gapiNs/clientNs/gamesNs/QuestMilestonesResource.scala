package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestMilestonesResource extends js.Object {
  /**
    * Report that a reward for the milestone corresponding to milestoneId for the quest corresponding to questId has been claimed by the currently authorized
    * user.
    */
  def claim(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyMilestoneId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

