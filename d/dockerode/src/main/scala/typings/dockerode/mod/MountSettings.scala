package typings.dockerode.mod

import typings.dockerode.anon.DriverConfig
import typings.dockerode.anon.Propagation
import typings.dockerode.anon.SizeBytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountSettings extends js.Object {
  
  var BindOptions: js.UndefOr[Propagation] = js.native
  
  var Consistency: js.UndefOr[MountConsistency] = js.native
  
  var ReadOnly: js.UndefOr[Boolean] = js.native
  
  var Source: String = js.native
  
  var Target: String = js.native
  
  var TmpfsOptions: js.UndefOr[SizeBytes] = js.native
  
  var Type: MountType = js.native
  
  var VolumeOptions: js.UndefOr[DriverConfig] = js.native
}
object MountSettings {
  
  @scala.inline
  def apply(Source: String, Target: String, Type: MountType): MountSettings = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountSettings]
  }
  
  @scala.inline
  implicit class MountSettingsOps[Self <: MountSettings] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MountType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindOptions(value: Propagation): Self = this.set("BindOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindOptions: Self = this.set("BindOptions", js.undefined)
    
    @scala.inline
    def setConsistency(value: MountConsistency): Self = this.set("Consistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistency: Self = this.set("Consistency", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("ReadOnly", js.undefined)
    
    @scala.inline
    def setTmpfsOptions(value: SizeBytes): Self = this.set("TmpfsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpfsOptions: Self = this.set("TmpfsOptions", js.undefined)
    
    @scala.inline
    def setVolumeOptions(value: DriverConfig): Self = this.set("VolumeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeOptions: Self = this.set("VolumeOptions", js.undefined)
  }
}
