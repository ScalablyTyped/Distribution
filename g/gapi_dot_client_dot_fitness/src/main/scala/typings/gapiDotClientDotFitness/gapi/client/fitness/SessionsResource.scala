package typings.gapiDotClientDotFitness.gapi.client.fitness

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFitness.Anon_AltCurrentTimeMillisFields
import typings.gapiDotClientDotFitness.Anon_AltEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: Anon_AltCurrentTimeMillisFields): Request[Unit]
  /** Lists sessions previously created. */
  def list(request: Anon_AltEndTime): Request[ListSessionsResponse]
  /** Updates or insert a given session. */
  def update(request: Anon_AltCurrentTimeMillisFields): Request[Session]
}

object SessionsResource {
  @scala.inline
  def apply(
    delete: Anon_AltCurrentTimeMillisFields => Request[Unit],
    list: Anon_AltEndTime => Request[ListSessionsResponse],
    update: Anon_AltCurrentTimeMillisFields => Request[Session]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SessionsResource]
  }
}

