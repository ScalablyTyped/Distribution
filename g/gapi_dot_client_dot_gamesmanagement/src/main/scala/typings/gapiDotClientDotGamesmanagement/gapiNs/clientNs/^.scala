package typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs

import typings.gapiDotClientDotGamesmanagement.gapiDotClientDotGamesmanagementStrings.gamesmanagement
import typings.gapiDotClientDotGamesmanagement.gapiDotClientDotGamesmanagementStrings.v1management
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.AchievementsResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.ApplicationsResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.EventsResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.PlayersResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.QuestsResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.RoomsResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.ScoresResource
import typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs.TurnBasedMatchesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val achievements: AchievementsResource = js.native
  val applications: ApplicationsResource = js.native
  val events: EventsResource = js.native
  val players: PlayersResource = js.native
  val quests: QuestsResource = js.native
  val rooms: RoomsResource = js.native
  val scores: ScoresResource = js.native
  val turnBasedMatches: TurnBasedMatchesResource = js.native
  /** Load Google Play Game Services Management API v1management */
  def load(name: gamesmanagement, version: v1management): js.Thenable[Unit] = js.native
  def load(name: gamesmanagement, version: v1management, callback: js.Function0[_]): Unit = js.native
}

