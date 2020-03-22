package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFitness.AnonEndTime
import typings.gapiClientFitness.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Lists sessions previously created. */
  def list(request: AnonEndTime): Request_[ListSessionsResponse]
  /** Updates or insert a given session. */
  def update(request: AnonOauthtoken): Request_[Session]
}

object SessionsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    list: AnonEndTime => Request_[ListSessionsResponse],
    update: AnonOauthtoken => Request_[Session]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SessionsResource]
  }
}

