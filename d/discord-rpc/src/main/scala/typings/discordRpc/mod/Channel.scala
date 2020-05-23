package typings.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /**
    * (voice)
    */
  var bitrate: js.UndefOr[Double] = js.undefined
  var guild_id: js.UndefOr[String] = js.undefined
  var id: String
  /**
    * (text) https://discordapp.com/developers/docs/resources/channel#message-object
    */
  var messages: js.UndefOr[js.Array[_]] = js.undefined
  var name: String
  /**
    * (text)
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * (text)
    */
  var topic: js.UndefOr[String] = js.undefined
  /**
    * Guild text: 0, Guild voice: 2, DM: 1, Group DM: 3
    */
  var `type`: Double
  /**
    * (voice) 0 if none
    */
  var user_limit: js.UndefOr[Double] = js.undefined
  /**
    * (voice) https://discordapp.com/developers/docs/resources/voice#voice-state-object
    */
  var voice_states: js.UndefOr[js.Array[_]] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    id: String,
    name: String,
    `type`: Double,
    bitrate: js.UndefOr[Double] = js.undefined,
    guild_id: String = null,
    messages: js.Array[_] = null,
    position: js.UndefOr[Double] = js.undefined,
    topic: String = null,
    user_limit: js.UndefOr[Double] = js.undefined,
    voice_states: js.Array[_] = null
  ): Channel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (guild_id != null) __obj.updateDynamic("guild_id")(guild_id.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (!js.isUndefined(user_limit)) __obj.updateDynamic("user_limit")(user_limit.get.asInstanceOf[js.Any])
    if (voice_states != null) __obj.updateDynamic("voice_states")(voice_states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

