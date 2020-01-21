package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAlt
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: AnonAltConsistencyTokenFieldsKeyLanguage): Request_[Leaderboard]
  /** Lists all the leaderboard metadata for your application. */
  def list(request: AnonAlt): Request_[LeaderboardListResponse]
}

object LeaderboardsResource {
  @scala.inline
  def apply(
    get: AnonAltConsistencyTokenFieldsKeyLanguage => Request_[Leaderboard],
    list: AnonAlt => Request_[LeaderboardListResponse]
  ): LeaderboardsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LeaderboardsResource]
  }
}

