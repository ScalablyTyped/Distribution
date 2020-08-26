package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchesResource extends js.Object {
  /** Reset all turn-based match data for a user. This method is only accessible to whitelisted tester accounts for your application. */
  def reset(request: Alt): Request[Unit] = js.native
  /**
    * Deletes turn-based matches where the only match participants are from whitelisted tester accounts for your application. This method is only available
    * to user accounts for your developer console.
    */
  def resetForAllPlayers(request: Alt): Request[Unit] = js.native
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(reset: Alt => Request[Unit], resetForAllPlayers: Alt => Request[Unit]): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers))
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
  @scala.inline
  implicit class TurnBasedMatchesResourceOps[Self <: TurnBasedMatchesResource] (val x: Self) extends AnyVal {
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
    def setReset(value: Alt => Request[Unit]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setResetForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetForAllPlayers", js.Any.fromFunction1(value))
  }
  
}

