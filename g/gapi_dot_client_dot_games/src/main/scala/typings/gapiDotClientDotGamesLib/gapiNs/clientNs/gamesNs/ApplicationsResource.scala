package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: gapiDotClientDotGamesLib.Anon_AltApplicationId): gapiDotClientLib.gapiNs.clientNs.Request[Application]
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: gapiDotClientDotGamesLib.Anon_AltApplicationIdConsistencyToken): gapiDotClientLib.gapiNs.clientNs.Request[ApplicationVerifyResponse]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltApplicationId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Application]
    ],
    played: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    verify: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltApplicationIdConsistencyToken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ApplicationVerifyResponse]
    ]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = get, played = played, verify = verify)
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

