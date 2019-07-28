package typings.gapiDotClientDotGames.gapiNs.clientNs

import typings.gapiDotClientDotGames.gapiDotClientDotGamesStrings.games
import typings.gapiDotClientDotGames.gapiDotClientDotGamesStrings.v1
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.AchievementDefinitionsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.AchievementsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.ApplicationsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.EventsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.LeaderboardsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.MetagameResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.PlayersResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.PushtokensResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.QuestMilestonesResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.QuestsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.RevisionsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.RoomsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.ScoresResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.SnapshotsResource
import typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs.TurnBasedMatchesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val achievementDefinitions: AchievementDefinitionsResource = js.native
  val achievements: AchievementsResource = js.native
  val applications: ApplicationsResource = js.native
  val events: EventsResource = js.native
  val leaderboards: LeaderboardsResource = js.native
  val metagame: MetagameResource = js.native
  val players: PlayersResource = js.native
  val pushtokens: PushtokensResource = js.native
  val questMilestones: QuestMilestonesResource = js.native
  val quests: QuestsResource = js.native
  val revisions: RevisionsResource = js.native
  val rooms: RoomsResource = js.native
  val scores: ScoresResource = js.native
  val snapshots: SnapshotsResource = js.native
  val turnBasedMatches: TurnBasedMatchesResource = js.native
  /** Load Google Play Game Services API v1 */
  def load(name: games, version: v1): js.Thenable[Unit] = js.native
  def load(name: games, version: v1, callback: js.Function0[_]): Unit = js.native
}

