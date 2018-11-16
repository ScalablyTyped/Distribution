package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayersResource extends js.Object {
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrintApplicationId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrintApplicationId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

