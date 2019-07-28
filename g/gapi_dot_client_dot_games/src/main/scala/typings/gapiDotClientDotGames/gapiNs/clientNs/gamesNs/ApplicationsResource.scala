package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltApplicationId
import typings.gapiDotClientDotGames.Anon_AltApplicationIdConsistencyToken
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: Anon_AltApplicationId): Request[Application]
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: Anon_AltConsistencyTokenFields): Request[Unit]
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: Anon_AltApplicationIdConsistencyToken): Request[ApplicationVerifyResponse]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: Anon_AltApplicationId => Request[Application],
    played: Anon_AltConsistencyTokenFields => Request[Unit],
    verify: Anon_AltApplicationIdConsistencyToken => Request[ApplicationVerifyResponse]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), played = js.Any.fromFunction1(played), verify = js.Any.fromFunction1(verify))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

