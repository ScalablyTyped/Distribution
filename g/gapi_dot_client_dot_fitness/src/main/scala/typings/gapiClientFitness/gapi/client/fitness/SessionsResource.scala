package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFitness.anon.EndTime
import typings.gapiClientFitness.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /** Lists sessions previously created. */
  def list(request: EndTime): Request[ListSessionsResponse] = js.native
  /** Updates or insert a given session. */
  def update(request: Oauthtoken): Request[Session] = js.native
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
  @scala.inline
  implicit class SessionsResourceOps[Self <: SessionsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Oauthtoken => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EndTime => Request[ListSessionsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[Session]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

