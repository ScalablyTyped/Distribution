package typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGamesmanagement.Anon_AltApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Get the list of players hidden from the given application. This method is only available to user accounts for your developer console. */
  def listHidden(request: Anon_AltApplicationId): Request[HiddenPlayerList]
}

object ApplicationsResource {
  @scala.inline
  def apply(listHidden: Anon_AltApplicationId => Request[HiddenPlayerList]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(listHidden = js.Any.fromFunction1(listHidden))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

