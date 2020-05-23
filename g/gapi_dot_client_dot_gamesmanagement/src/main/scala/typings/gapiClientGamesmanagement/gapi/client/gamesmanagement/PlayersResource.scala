package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(request: Fields): Request[Unit]
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(request: Fields): Request[Unit]
}

object PlayersResource {
  @scala.inline
  def apply(hide: Fields => Request[Unit], unhide: Fields => Request[Unit]): PlayersResource = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), unhide = js.Any.fromFunction1(unhide))
    __obj.asInstanceOf[PlayersResource]
  }
}

