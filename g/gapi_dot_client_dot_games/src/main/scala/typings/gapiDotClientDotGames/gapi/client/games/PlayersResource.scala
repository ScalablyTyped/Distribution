package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGames.Anon_AltCollectionConsistencyToken
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtoken): Request[Player]
  /** Get the collection of players for the currently authenticated user. */
  def list(request: Anon_AltCollectionConsistencyToken): Request[PlayerListResponse]
}

object PlayersResource {
  @scala.inline
  def apply(
    get: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtoken => Request[Player],
    list: Anon_AltCollectionConsistencyToken => Request[PlayerListResponse]
  ): PlayersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PlayersResource]
  }
}

