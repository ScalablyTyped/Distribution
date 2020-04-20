package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGamesmanagement.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchesResource extends js.Object {
  /** Reset all turn-based match data for a user. This method is only accessible to whitelisted tester accounts for your application. */
  def reset(request: AnonAlt): Request_[Unit]
  /**
    * Deletes turn-based matches where the only match participants are from whitelisted tester accounts for your application. This method is only available
    * to user accounts for your developer console.
    */
  def resetForAllPlayers(request: AnonAlt): Request_[Unit]
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(reset: AnonAlt => Request_[Unit], resetForAllPlayers: AnonAlt => Request_[Unit]): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers))
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
}

