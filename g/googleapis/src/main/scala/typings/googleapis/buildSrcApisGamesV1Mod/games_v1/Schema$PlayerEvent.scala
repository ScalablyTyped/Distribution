package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event status resource.
  */
@js.native
trait Schema$PlayerEvent extends js.Object {
  /**
    * The ID of the event definition.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * The current number of times this event has occurred, as a string. The
    * formatting of this string depends on the configuration of your event in
    * the Play Games Developer Console.
    */
  var formattedNumEvents: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerEvent.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current number of times this event has occurred.
    */
  var numEvents: js.UndefOr[String] = js.native
  /**
    * The ID of the player.
    */
  var playerId: js.UndefOr[String] = js.native
}

object Schema$PlayerEvent {
  @scala.inline
  def apply(
    definitionId: String = null,
    formattedNumEvents: String = null,
    kind: String = null,
    numEvents: String = null,
    playerId: String = null
  ): Schema$PlayerEvent = {
    val __obj = js.Dynamic.literal()
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId.asInstanceOf[js.Any])
    if (formattedNumEvents != null) __obj.updateDynamic("formattedNumEvents")(formattedNumEvents.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numEvents != null) __obj.updateDynamic("numEvents")(numEvents.asInstanceOf[js.Any])
    if (playerId != null) __obj.updateDynamic("playerId")(playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerEvent]
  }
}

