package typings.discordRpc.mod

import typings.discordRpc.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserVoiceSettings extends js.Object {
  
  var id: String = js.native
  
  var mute: js.UndefOr[Boolean] = js.native
  
  var pan: js.UndefOr[Left] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object UserVoiceSettings {
  
  @scala.inline
  def apply(id: String): UserVoiceSettings = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserVoiceSettings]
  }
  
  @scala.inline
  implicit class UserVoiceSettingsOps[Self <: UserVoiceSettings] (val x: Self) extends AnyVal {
    
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
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setPan(value: Left): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
