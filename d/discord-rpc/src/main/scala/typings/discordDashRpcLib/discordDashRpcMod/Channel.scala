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

