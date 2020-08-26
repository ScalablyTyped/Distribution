package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.ApplicationId
import typings.gapiClientGames.anon.Oauthtoken
import typings.gapiClientGames.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationsResource extends js.Object {
  /**
    * Retrieves the metadata of the application with the given ID. If the requested application is not available for the specified platformType, the returned
    * response will not include any instance data.
    */
  def get(request: ApplicationId): Request[Application] = js.native
  /** Indicate that the the currently authenticated user is playing your application. */
  def played(request: Oauthtoken): Request[Unit] = js.native
  /** Verifies the auth token provided with this request is for the application with the specified ID, and returns the ID of the player it was granted for. */
  def verify(request: PrettyPrint): Request[ApplicationVerifyResponse] = js.native
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: ApplicationId => Request[Application],
    played: Oauthtoken => Request[Unit],
    verify: PrettyPrint => Request[ApplicationVerifyResponse]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), played = js.Any.fromFunction1(played), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[ApplicationsResource]
  }
  @scala.inline
  implicit class ApplicationsResourceOps[Self <: ApplicationsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: ApplicationId => Request[Application]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPlayed(value: Oauthtoken => Request[Unit]): Self = this.set("played", js.Any.fromFunction1(value))
    @scala.inline
    def setVerify(value: PrettyPrint => Request[ApplicationVerifyResponse]): Self = this.set("verify", js.Any.fromFunction1(value))
  }
  
}

