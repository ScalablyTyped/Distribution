package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Player]
  /** Get the collection of players for the currently authenticated user. */
  def list(request: gapiDotClientDotGamesLib.Anon_CollectionConsistencyToken): gapiDotClientLib.gapiNs.clientNs.Request[PlayerListResponse]
}

