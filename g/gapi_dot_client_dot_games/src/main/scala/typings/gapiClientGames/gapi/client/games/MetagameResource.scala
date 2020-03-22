package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonCollection
import typings.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: AnonOauthtoken): Request_[MetagameConfig]
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: AnonCollection): Request_[CategoryListResponse]
}

object MetagameResource {
  @scala.inline
  def apply(
    getMetagameConfig: AnonOauthtoken => Request_[MetagameConfig],
    listCategoriesByPlayer: AnonCollection => Request_[CategoryListResponse]
  ): MetagameResource = {
    val __obj = js.Dynamic.literal(getMetagameConfig = js.Any.fromFunction1(getMetagameConfig), listCategoriesByPlayer = js.Any.fromFunction1(listCategoriesByPlayer))
  
    __obj.asInstanceOf[MetagameResource]
  }
}

