package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Collection
import typings.gapiClientGames.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: Oauthtoken): Request[MetagameConfig]
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: Collection): Request[CategoryListResponse]
}

object MetagameResource {
  @scala.inline
  def apply(
    getMetagameConfig: Oauthtoken => Request[MetagameConfig],
    listCategoriesByPlayer: Collection => Request[CategoryListResponse]
  ): MetagameResource = {
    val __obj = js.Dynamic.literal(getMetagameConfig = js.Any.fromFunction1(getMetagameConfig), listCategoriesByPlayer = js.Any.fromFunction1(listCategoriesByPlayer))
    __obj.asInstanceOf[MetagameResource]
  }
}

