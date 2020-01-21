package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFitness.AnonAltCurrentTimeMillisFields
import typings.gapiClientFitness.AnonAltEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: AnonAltCurrentTimeMillisFields): Request_[Unit]
  /** Lists sessions previously created. */
  def list(request: AnonAltEndTime): Request_[ListSessionsResponse]
  /** Updates or insert a given session. */
  def update(request: AnonAltCurrentTimeMillisFields): Request_[Session]
}

object SessionsResource {
  @scala.inline
  def apply(
    delete: AnonAltCurrentTimeMillisFields => Request_[Unit],
    list: AnonAltEndTime => Request_[ListSessionsResponse],
    update: AnonAltCurrentTimeMillisFields => Request_[Session]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SessionsResource]
  }
}

