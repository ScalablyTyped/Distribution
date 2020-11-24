package typings.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
  /**
    * (voice)
    */
  var bitrate: js.UndefOr[Double] = js.native
  
  var guild_id: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  /**
    * (text) https://discordapp.com/developers/docs/resources/channel#message-object
    */
  var messages: js.UndefOr[js.Array[_]] = js.native
  
  var name: String = js.native
  
  /**
    * (text)
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * (text)
    */
  var topic: js.UndefOr[String] = js.native
  
  /**
    * Guild text: 0, Guild voice: 2, DM: 1, Group DM: 3
    */
  var `type`: Double = js.native
  
  /**
    * (voice) 0 if none
    */
  var user_limit: js.UndefOr[Double] = js.native
  
  /**
    * (voice) https://discordapp.com/developers/docs/resources/voice#voice-state-object
    */
  var voice_states: js.UndefOr[js.Array[_]] = js.native
}
object Channel {
  
  @scala.inline
  def apply(id: String, name: String, `type`: Double): Channel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setGuild_id(value: String): Self = this.set("guild_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuild_id: Self = this.set("guild_id", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: js.Any*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[_]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setUser_limit(value: Double): Self = this.set("user_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_limit: Self = this.set("user_limit", js.undefined)
    
    @scala.inline
    def setVoice_statesVarargs(value: js.Any*): Self = this.set("voice_states", js.Array(value :_*))
    
    @scala.inline
    def setVoice_states(value: js.Array[_]): Self = this.set("voice_states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoice_states: Self = this.set("voice_states", js.undefined)
  }
}
