package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Player]
  /** Get the collection of players for the currently authenticated user. */
  def list(request: gapiDotClientDotGamesLib.Anon_AltCollectionConsistencyToken): gapiDotClientLib.gapiNs.clientNs.Request[PlayerListResponse]
}

object PlayersResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Player]
    ],
    list: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltCollectionConsistencyToken, 
      gapiDotClientLib.gapiNs.clientNs.Request[PlayerListResponse]
    ]
  ): PlayersResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[PlayersResource]
  }
}

