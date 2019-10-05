package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGames.Anon_Alt
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: Anon_AltConsistencyTokenFieldsKeyLanguage): Request[Leaderboard]
  /** Lists all the leaderboard metadata for your application. */
  def list(request: Anon_Alt): Request[LeaderboardListResponse]
}

object LeaderboardsResource {
  @scala.inline
  def apply(
    get: Anon_AltConsistencyTokenFieldsKeyLanguage => Request[Leaderboard],
    list: Anon_Alt => Request[LeaderboardListResponse]
  ): LeaderboardsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LeaderboardsResource]
  }
}

