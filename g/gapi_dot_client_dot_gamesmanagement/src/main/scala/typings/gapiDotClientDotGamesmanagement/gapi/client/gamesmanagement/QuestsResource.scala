package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGamesmanagement.Anon_Alt
import typings.gapiDotClientDotGamesmanagement.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /**
    * Resets all player progress on the quest with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: Anon_AltFields): Request[Unit]
  /**
    * Resets all player progress on all quests for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: Anon_Alt): Request[Unit]
  /** Resets all draft quests for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Anon_Alt): Request[Unit]
  /**
    * Resets all player progress on the quest with the given ID for all players. This method is only available to user accounts for your developer console.
    * Only draft quests can be reset.
    */
  def resetForAllPlayers(request: Anon_AltFields): Request[Unit]
  /**
    * Resets quests with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft quests may be
    * reset.
    */
  def resetMultipleForAllPlayers(request: Anon_Alt): Request[Unit]
}

object QuestsResource {
  @scala.inline
  def apply(
    reset: Anon_AltFields => Request[Unit],
    resetAll: Anon_Alt => Request[Unit],
    resetAllForAllPlayers: Anon_Alt => Request[Unit],
    resetForAllPlayers: Anon_AltFields => Request[Unit],
    resetMultipleForAllPlayers: Anon_Alt => Request[Unit]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[QuestsResource]
  }
}

