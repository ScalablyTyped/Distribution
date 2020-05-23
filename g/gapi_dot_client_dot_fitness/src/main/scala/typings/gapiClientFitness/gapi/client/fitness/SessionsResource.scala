package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFitness.anon.EndTime
import typings.gapiClientFitness.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: Oauthtoken): Request[Unit]
  /** Lists sessions previously created. */
  def list(request: EndTime): Request[ListSessionsResponse]
  /** Updates or insert a given session. */
  def update(request: Oauthtoken): Request[Session]
}

object SessionsResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[Unit],
    list: EndTime => Request[ListSessionsResponse],
    update: Oauthtoken => Request[Session]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SessionsResource]
  }
}

