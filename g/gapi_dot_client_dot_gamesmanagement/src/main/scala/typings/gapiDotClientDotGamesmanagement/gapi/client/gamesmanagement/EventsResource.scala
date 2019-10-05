package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGamesmanagement.Anon_Alt
import typings.gapiDotClientDotGamesmanagement.Anon_AltEventId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /**
    * Resets all player progress on the event with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application. All quests for this player that use the event will also be reset.
    */
  def reset(request: Anon_AltEventId): Request[Unit]
  /**
    * Resets all player progress on all events for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application. All quests for this player will also be reset.
    */
  def resetAll(request: Anon_Alt): Request[Unit]
  /**
    * Resets all draft events for all players. This method is only available to user accounts for your developer console. All quests that use any of these
    * events will also be reset.
    */
  def resetAllForAllPlayers(request: Anon_Alt): Request[Unit]
  /**
    * Resets the event with the given ID for all players. This method is only available to user accounts for your developer console. Only draft events can be
    * reset. All quests that use the event will also be reset.
    */
  def resetForAllPlayers(request: Anon_AltEventId): Request[Unit]
  /**
    * Resets events with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft events may be
    * reset. All quests that use any of the events will also be reset.
    */
  def resetMultipleForAllPlayers(request: Anon_Alt): Request[Unit]
}

object EventsResource {
  @scala.inline
  def apply(
    reset: Anon_AltEventId => Request[Unit],
    resetAll: Anon_Alt => Request[Unit],
    resetAllForAllPlayers: Anon_Alt => Request[Unit],
    resetForAllPlayers: Anon_AltEventId => Request[Unit],
    resetMultipleForAllPlayers: Anon_Alt => Request[Unit]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[EventsResource]
  }
}

