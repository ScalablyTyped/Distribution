package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerEvent extends js.Object {
  /** The ID of the event definition. */
  var definitionId: js.UndefOr[String] = js.undefined
  /**
    * The current number of times this event has occurred, as a string. The formatting of this string depends on the configuration of your event in the Play
    * Games Developer Console.
    */
  var formattedNumEvents: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerEvent. */
  var kind: js.UndefOr[String] = js.undefined
  /** The current number of times this event has occurred. */
  var numEvents: js.UndefOr[String] = js.undefined
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.undefined
}

object PlayerEvent {
  @scala.inline
  def apply(
    definitionId: String = null,
    formattedNumEvents: String = null,
    kind: String = null,
    numEvents: String = null,
    playerId: String = null
  ): PlayerEvent = {
    val __obj = js.Dynamic.literal()
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId)
    if (formattedNumEvents != null) __obj.updateDynamic("formattedNumEvents")(formattedNumEvents)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numEvents != null) __obj.updateDynamic("numEvents")(numEvents)
    if (playerId != null) __obj.updateDynamic("playerId")(playerId)
    __obj.asInstanceOf[PlayerEvent]
  }
}

