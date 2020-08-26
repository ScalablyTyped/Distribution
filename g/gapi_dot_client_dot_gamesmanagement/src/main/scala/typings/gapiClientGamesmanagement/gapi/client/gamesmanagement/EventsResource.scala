package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.Alt
import typings.gapiClientGamesmanagement.anon.EventId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /**
    * Resets all player progress on the event with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application. All quests for this player that use the event will also be reset.
    */
  def reset(request: EventId): Request[Unit] = js.native
  /**
    * Resets all player progress on all events for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application. All quests for this player will also be reset.
    */
  def resetAll(request: Alt): Request[Unit] = js.native
  /**
    * Resets all draft events for all players. This method is only available to user accounts for your developer console. All quests that use any of these
    * events will also be reset.
    */
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  /**
    * Resets the event with the given ID for all players. This method is only available to user accounts for your developer console. Only draft events can be
    * reset. All quests that use the event will also be reset.
    */
  def resetForAllPlayers(request: EventId): Request[Unit] = js.native
  /**
    * Resets events with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft events may be
    * reset. All quests that use any of the events will also be reset.
    */
  def resetMultipleForAllPlayers(request: Alt): Request[Unit] = js.native
}

object EventsResource {
  @scala.inline
  def apply(
    reset: EventId => Request[Unit],
    resetAll: Alt => Request[Unit],
    resetAllForAllPlayers: Alt => Request[Unit],
    resetForAllPlayers: EventId => Request[Unit],
    resetMultipleForAllPlayers: Alt => Request[Unit]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[EventsResource]
  }
  @scala.inline
  implicit class EventsResourceOps[Self <: EventsResource] (val x: Self) extends AnyVal {
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
    def setReset(value: EventId => Request[Unit]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAll(value: Alt => Request[Unit]): Self = this.set("resetAll", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAllForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetAllForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetForAllPlayers(value: EventId => Request[Unit]): Self = this.set("resetForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetMultipleForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetMultipleForAllPlayers", js.Any.fromFunction1(value))
  }
  
}

