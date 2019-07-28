package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltCollection
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: Anon_AltConsistencyTokenFields): Request[MetagameConfig]
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: Anon_AltCollection): Request[CategoryListResponse]
}

object MetagameResource {
  @scala.inline
  def apply(
    getMetagameConfig: Anon_AltConsistencyTokenFields => Request[MetagameConfig],
    listCategoriesByPlayer: Anon_AltCollection => Request[CategoryListResponse]
  ): MetagameResource = {
    val __obj = js.Dynamic.literal(getMetagameConfig = js.Any.fromFunction1(getMetagameConfig), listCategoriesByPlayer = js.Any.fromFunction1(listCategoriesByPlayer))
  
    __obj.asInstanceOf[MetagameResource]
  }
}

