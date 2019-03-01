package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /**
    * (voice)
    */
  var bitrate: js.UndefOr[scala.Double] = js.undefined
  var guild_id: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  /**
    * (text) https://discordapp.com/developers/docs/resources/channel#message-object
    */
  var messages: js.UndefOr[js.Array[_]] = js.undefined
  var name: java.lang.String
  /**
    * (text)
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
    * (text)
    */
  var topic: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Guild text: 0, Guild voice: 2, DM: 1, Group DM: 3
    */
  var `type`: scala.Double
  /**
    * (voice) 0 if none
    */
  var user_limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * (voice) https://discordapp.com/developers/docs/resources/voice#voice-state-object
    */
  var voice_states: js.UndefOr[js.Array[_]] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    `type`: scala.Double,
    bitrate: scala.Int | scala.Double = null,
    guild_id: java.lang.String = null,
    messages: js.Array[_] = null,
    position: scala.Int | scala.Double = null,
    topic: java.lang.String = null,
    user_limit: scala.Int | scala.Double = null,
    voice_states: js.Array[_] = null
  ): Channel = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (guild_id != null) __obj.updateDynamic("guild_id")(guild_id)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (user_limit != null) __obj.updateDynamic("user_limit")(user_limit.asInstanceOf[js.Any])
    if (voice_states != null) __obj.updateDynamic("voice_states")(voice_states)
    __obj.asInstanceOf[Channel]
  }
}

