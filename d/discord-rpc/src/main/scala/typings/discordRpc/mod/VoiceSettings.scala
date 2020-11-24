package typings.discordRpc.mod

import typings.discordRpc.anon.AutoThreshold
import typings.discordRpc.anon.Device
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceSettings extends js.Object {
  
  var automaticGainControl: Boolean = js.native
  
  var deaf: Boolean = js.native
  
  var echoCancellation: Boolean = js.native
  
  var input: js.UndefOr[Device] = js.native
  
  var mode: js.UndefOr[AutoThreshold] = js.native
  
  var mute: Boolean = js.native
  
  var noiseSuppression: Boolean = js.native
  
  var output: js.UndefOr[Device] = js.native
  
  var qos: Boolean = js.native
  
  var silenceWarning: Boolean = js.native
}
object VoiceSettings {
  
  @scala.inline
  def apply(
    automaticGainControl: Boolean,
    deaf: Boolean,
    echoCancellation: Boolean,
    mute: Boolean,
    noiseSuppression: Boolean,
    qos: Boolean,
    silenceWarning: Boolean
  ): VoiceSettings = {
    val __obj = js.Dynamic.literal(automaticGainControl = automaticGainControl.asInstanceOf[js.Any], deaf = deaf.asInstanceOf[js.Any], echoCancellation = echoCancellation.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], noiseSuppression = noiseSuppression.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], silenceWarning = silenceWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSettings]
  }
  
  @scala.inline
  implicit class VoiceSettingsOps[Self <: VoiceSettings] (val x: Self) extends AnyVal {
    
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
    def setAutomaticGainControl(value: Boolean): Self = this.set("automaticGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeaf(value: Boolean): Self = this.set("deaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellation(value: Boolean): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseSuppression(value: Boolean): Self = this.set("noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQos(value: Boolean): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilenceWarning(value: Boolean): Self = this.set("silenceWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: Device): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setMode(value: AutoThreshold): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOutput(value: Device): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
