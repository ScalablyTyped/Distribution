package typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGamesmanagement.Anon_AltApplicationIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(request: Anon_AltApplicationIdFields): Request[Unit]
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(request: Anon_AltApplicationIdFields): Request[Unit]
}

object PlayersResource {
  @scala.inline
  def apply(
    hide: Anon_AltApplicationIdFields => Request[Unit],
    unhide: Anon_AltApplicationIdFields => Request[Unit]
  ): PlayersResource = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), unhide = js.Any.fromFunction1(unhide))
  
    __obj.asInstanceOf[PlayersResource]
  }
}

