package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGamesmanagement.AnonApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Get the list of players hidden from the given application. This method is only available to user accounts for your developer console. */
  def listHidden(request: AnonApplicationId): Request_[HiddenPlayerList]
}

object ApplicationsResource {
  @scala.inline
  def apply(listHidden: AnonApplicationId => Request_[HiddenPlayerList]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(listHidden = js.Any.fromFunction1(listHidden))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

