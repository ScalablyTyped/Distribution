package typings.discordRpc.mod

import typings.discordRpc.anon.Name
import typings.discordRpc.discordRpcStrings.audioinput
import typings.discordRpc.discordRpcStrings.audiooutput
import typings.discordRpc.discordRpcStrings.videoinput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertifiedDevice extends js.Object {
  
  var automaticGainControl: js.UndefOr[Boolean] = js.native
  
  var echoCancellation: js.UndefOr[Boolean] = js.native
  
  var hardwareMute: js.UndefOr[Boolean] = js.native
  
  var model: Name = js.native
  
  var noiseSuppression: js.UndefOr[Boolean] = js.native
  
  var related: js.Array[String] = js.native
  
  var `type`: audioinput | audiooutput | videoinput = js.native
  
  var uuid: String = js.native
  
  var vendor: Name = js.native
}
object CertifiedDevice {
  
  @scala.inline
  def apply(
    model: Name,
    related: js.Array[String],
    `type`: audioinput | audiooutput | videoinput,
    uuid: String,
    vendor: Name
  ): CertifiedDevice = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertifiedDevice]
  }
  
  @scala.inline
  implicit class CertifiedDeviceOps[Self <: CertifiedDevice] (val x: Self) extends AnyVal {
    
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
    def setModel(value: Name): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedVarargs(value: String*): Self = this.set("related", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: js.Array[String]): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: audioinput | audiooutput | videoinput): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: Name): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticGainControl(value: Boolean): Self = this.set("automaticGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticGainControl: Self = this.set("automaticGainControl", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: Boolean): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoCancellation: Self = this.set("echoCancellation", js.undefined)
    
    @scala.inline
    def setHardwareMute(value: Boolean): Self = this.set("hardwareMute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareMute: Self = this.set("hardwareMute", js.undefined)
    
    @scala.inline
    def setNoiseSuppression(value: Boolean): Self = this.set("noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoiseSuppression: Self = this.set("noiseSuppression", js.undefined)
  }
}
