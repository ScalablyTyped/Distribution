package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: Oauthtoken): Request[Unit] = js.native
  /** Registers a push token for the current user and application. */
  def update(request: Oauthtoken): Request[Unit] = js.native
}

object PushtokensResource {
  @scala.inline
  def apply(remove: Oauthtoken => Request[Unit], update: Oauthtoken => Request[Unit]): PushtokensResource = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PushtokensResource]
  }
  @scala.inline
  implicit class PushtokensResourceOps[Self <: PushtokensResource] (val x: Self) extends AnyVal {
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
    def setRemove(value: Oauthtoken => Request[Unit]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[Unit]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

