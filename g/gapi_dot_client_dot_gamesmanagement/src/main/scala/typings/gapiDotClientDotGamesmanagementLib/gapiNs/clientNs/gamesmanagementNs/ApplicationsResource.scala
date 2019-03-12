package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Get the list of players hidden from the given application. This method is only available to user accounts for your developer console. */
  def listHidden(request: gapiDotClientDotGamesmanagementLib.Anon_AltApplicationId): gapiDotClientLib.gapiNs.clientNs.Request[HiddenPlayerList]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    listHidden: gapiDotClientDotGamesmanagementLib.Anon_AltApplicationId => gapiDotClientLib.gapiNs.clientNs.Request[HiddenPlayerList]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(listHidden = js.Any.fromFunction1(listHidden))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

