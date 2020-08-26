package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayersResource extends js.Object {
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(request: Fields): Request[Unit] = js.native
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(request: Fields): Request[Unit] = js.native
}

object PlayersResource {
  @scala.inline
  def apply(hide: Fields => Request[Unit], unhide: Fields => Request[Unit]): PlayersResource = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), unhide = js.Any.fromFunction1(unhide))
    __obj.asInstanceOf[PlayersResource]
  }
  @scala.inline
  implicit class PlayersResourceOps[Self <: PlayersResource] (val x: Self) extends AnyVal {
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
    def setHide(value: Fields => Request[Unit]): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def setUnhide(value: Fields => Request[Unit]): Self = this.set("unhide", js.Any.fromFunction1(value))
  }
  
}

