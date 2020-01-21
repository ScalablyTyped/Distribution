package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAltCollectionConsistencyToken
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguageOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: AnonAltConsistencyTokenFieldsKeyLanguageOauthtoken): Request_[Player]
  /** Get the collection of players for the currently authenticated user. */
  def list(request: AnonAltCollectionConsistencyToken): Request_[PlayerListResponse]
}

object PlayersResource {
  @scala.inline
  def apply(
    get: AnonAltConsistencyTokenFieldsKeyLanguageOauthtoken => Request_[Player],
    list: AnonAltCollectionConsistencyToken => Request_[PlayerListResponse]
  ): PlayersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PlayersResource]
  }
}

