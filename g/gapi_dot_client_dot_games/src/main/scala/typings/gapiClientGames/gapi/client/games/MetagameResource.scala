package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Collection
import typings.gapiClientGames.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: Oauthtoken): Request[MetagameConfig] = js.native
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: Collection): Request[CategoryListResponse] = js.native
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
  @scala.inline
  implicit class MetagameResourceOps[Self <: MetagameResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetMetagameConfig(value: Oauthtoken => Request[MetagameConfig]): Self = this.set("getMetagameConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setListCategoriesByPlayer(value: Collection => Request[CategoryListResponse]): Self = this.set("listCategoriesByPlayer", js.Any.fromFunction1(value))
  }
  
}

