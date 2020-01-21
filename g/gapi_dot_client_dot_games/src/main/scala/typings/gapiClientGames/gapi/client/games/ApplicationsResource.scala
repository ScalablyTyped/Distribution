package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAltApplicationId
import typings.gapiClientGames.AnonAltApplicationIdConsistencyToken
import typings.gapiClientGames.AnonAltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: AnonAltApplicationId): Request_[Application]
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: AnonAltConsistencyTokenFields): Request_[Unit]
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: AnonAltApplicationIdConsistencyToken): Request_[ApplicationVerifyResponse]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: AnonAltApplicationId => Request_[Application],
    played: AnonAltConsistencyTokenFields => Request_[Unit],
    verify: AnonAltApplicationIdConsistencyToken => Request_[ApplicationVerifyResponse]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), played = js.Any.fromFunction1(played), verify = js.Any.fromFunction1(verify))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

