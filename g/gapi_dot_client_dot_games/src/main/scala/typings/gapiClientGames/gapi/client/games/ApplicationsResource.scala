package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonApplicationId
import typings.gapiClientGames.AnonOauthtoken
import typings.gapiClientGames.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: AnonApplicationId): Request_[Application]
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: AnonOauthtoken): Request_[Unit]
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: AnonPrettyPrint): Request_[ApplicationVerifyResponse]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: AnonApplicationId => Request_[Application],
    played: AnonOauthtoken => Request_[Unit],
    verify: AnonPrettyPrint => Request_[ApplicationVerifyResponse]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), played = js.Any.fromFunction1(played), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[ApplicationsResource]
  }
}

