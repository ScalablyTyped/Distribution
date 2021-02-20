package typings.dockerode.mod

import typings.dockerode.anon.DriverConfig
import typings.dockerode.anon.Propagation
import typings.dockerode.anon.SizeBytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountSettings extends StObject {
  
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
  implicit class MountSettingsMutableBuilder[Self <: MountSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindOptions(value: Propagation): Self = StObject.set(x, "BindOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindOptionsUndefined: Self = StObject.set(x, "BindOptions", js.undefined)
    
    @scala.inline
    def setConsistency(value: MountConsistency): Self = StObject.set(x, "Consistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyUndefined: Self = StObject.set(x, "Consistency", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpfsOptions(value: SizeBytes): Self = StObject.set(x, "TmpfsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpfsOptionsUndefined: Self = StObject.set(x, "TmpfsOptions", js.undefined)
    
    @scala.inline
    def setType(value: MountType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeOptions(value: DriverConfig): Self = StObject.set(x, "VolumeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeOptionsUndefined: Self = StObject.set(x, "VolumeOptions", js.undefined)
  }
}
