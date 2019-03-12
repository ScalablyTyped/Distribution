package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguage): gapiDotClientLib.gapiNs.clientNs.Request[Leaderboard]
  /** Lists all the leaderboard metadata for your application. */
  def list(request: gapiDotClientDotGamesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardListResponse]
}

object LeaderboardsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguage => gapiDotClientLib.gapiNs.clientNs.Request[Leaderboard],
    list: gapiDotClientDotGamesLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardListResponse]
  ): LeaderboardsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LeaderboardsResource]
  }
}

