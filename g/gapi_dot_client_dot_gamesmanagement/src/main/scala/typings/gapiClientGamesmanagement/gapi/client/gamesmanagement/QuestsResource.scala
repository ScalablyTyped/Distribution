package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.Alt
import typings.gapiClientGamesmanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestsResource extends js.Object {
  /**
    * Resets all player progress on the quest with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: Key): Request[Unit] = js.native
  /**
    * Resets all player progress on all quests for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: Alt): Request[Unit] = js.native
  /** Resets all draft quests for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  /**
    * Resets all player progress on the quest with the given ID for all players. This method is only available to user accounts for your developer console.
    * Only draft quests can be reset.
    */
  def resetForAllPlayers(request: Key): Request[Unit] = js.native
  /**
    * Resets quests with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft quests may be
    * reset.
    */
  def resetMultipleForAllPlayers(request: Alt): Request[Unit] = js.native
}

object QuestsResource {
  @scala.inline
  def apply(
    reset: Key => Request[Unit],
    resetAll: Alt => Request[Unit],
    resetAllForAllPlayers: Alt => Request[Unit],
    resetForAllPlayers: Key => Request[Unit],
    resetMultipleForAllPlayers: Alt => Request[Unit]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[QuestsResource]
  }
  @scala.inline
  implicit class QuestsResourceOps[Self <: QuestsResource] (val x: Self) extends AnyVal {
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
    def setReset(value: Key => Request[Unit]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAll(value: Alt => Request[Unit]): Self = this.set("resetAll", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAllForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetAllForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetForAllPlayers(value: Key => Request[Unit]): Self = this.set("resetForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetMultipleForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetMultipleForAllPlayers", js.Any.fromFunction1(value))
  }
  
}

