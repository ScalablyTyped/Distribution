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
    get: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguage, 
      gapiDotClientLib.gapiNs.clientNs.Request[Leaderboard]
    ],
    list: js.Function1[
      gapiDotClientDotGamesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardListResponse]
    ]
  ): LeaderboardsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[LeaderboardsResource]
  }
}

