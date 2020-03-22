package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGamesmanagement.AnonAlt
import typings.gapiClientGamesmanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /**
    * Resets all player progress on the quest with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: AnonKey): Request_[Unit]
  /**
    * Resets all player progress on all quests for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: AnonAlt): Request_[Unit]
  /** Resets all draft quests for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit]
  /**
    * Resets all player progress on the quest with the given ID for all players. This method is only available to user accounts for your developer console.
    * Only draft quests can be reset.
    */
  def resetForAllPlayers(request: AnonKey): Request_[Unit]
  /**
    * Resets quests with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft quests may be
    * reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit]
}

object QuestsResource {
  @scala.inline
  def apply(
    reset: AnonKey => Request_[Unit],
    resetAll: AnonAlt => Request_[Unit],
    resetAllForAllPlayers: AnonAlt => Request_[Unit],
    resetForAllPlayers: AnonKey => Request_[Unit],
    resetMultipleForAllPlayers: AnonAlt => Request_[Unit]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[QuestsResource]
  }
}

