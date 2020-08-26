package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerEvent extends js.Object {
  /** The ID of the event definition. */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * The current number of times this event has occurred, as a string. The formatting of this string depends on the configuration of your event in the Play
    * Games Developer Console.
    */
  var formattedNumEvents: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerEvent. */
  var kind: js.UndefOr[String] = js.native
  /** The current number of times this event has occurred. */
  var numEvents: js.UndefOr[String] = js.native
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.native
}

object PlayerEvent {
  @scala.inline
  def apply(): PlayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerEvent]
  }
  @scala.inline
  implicit class PlayerEventOps[Self <: PlayerEvent] (val x: Self) extends AnyVal {
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
    def setDefinitionId(value: String): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionId: Self = this.set("definitionId", js.undefined)
    @scala.inline
    def setFormattedNumEvents(value: String): Self = this.set("formattedNumEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedNumEvents: Self = this.set("formattedNumEvents", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNumEvents(value: String): Self = this.set("numEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumEvents: Self = this.set("numEvents", js.undefined)
    @scala.inline
    def setPlayerId(value: String): Self = this.set("playerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerId: Self = this.set("playerId", js.undefined)
  }
  
}

