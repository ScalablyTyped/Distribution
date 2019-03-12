package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields): gapiDotClientLib.gapiNs.clientNs.Request[MetagameConfig]
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: gapiDotClientDotGamesLib.Anon_AltCollection): gapiDotClientLib.gapiNs.clientNs.Request[CategoryListResponse]
}

object MetagameResource {
  @scala.inline
  def apply(
    getMetagameConfig: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields => gapiDotClientLib.gapiNs.clientNs.Request[MetagameConfig],
    listCategoriesByPlayer: gapiDotClientDotGamesLib.Anon_AltCollection => gapiDotClientLib.gapiNs.clientNs.Request[CategoryListResponse]
  ): MetagameResource = {
    val __obj = js.Dynamic.literal(getMetagameConfig = js.Any.fromFunction1(getMetagameConfig), listCategoriesByPlayer = js.Any.fromFunction1(listCategoriesByPlayer))
  
    __obj.asInstanceOf[MetagameResource]
  }
}

