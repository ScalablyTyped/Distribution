package typings.dockerode.mod

import typings.dockerode.anon.DriverConfig
import typings.dockerode.anon.Propagation
import typings.dockerode.anon.SizeBytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountSettings extends StObject {
  
  var BindOptions: js.UndefOr[Propagation] = js.undefined
  
  var Consistency: js.UndefOr[MountConsistency] = js.undefined
  
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var Source: String
  
  var Target: String
  
  var TmpfsOptions: js.UndefOr[SizeBytes] = js.undefined
  
  var Type: MountType
  
  var VolumeOptions: js.UndefOr[DriverConfig] = js.undefined
}
object MountSettings {
  
  inline def apply(Source: String, Target: String, Type: MountType): MountSettings = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountSettings]
  }
  
  extension [Self <: MountSettings](x: Self) {
    
    inline def setBindOptions(value: Propagation): Self = StObject.set(x, "BindOptions", value.asInstanceOf[js.Any])
    
    inline def setBindOptionsUndefined: Self = StObject.set(x, "BindOptions", js.undefined)
    
    inline def setConsistency(value: MountConsistency): Self = StObject.set(x, "Consistency", value.asInstanceOf[js.Any])
    
    inline def setConsistencyUndefined: Self = StObject.set(x, "Consistency", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTmpfsOptions(value: SizeBytes): Self = StObject.set(x, "TmpfsOptions", value.asInstanceOf[js.Any])
    
    inline def setTmpfsOptionsUndefined: Self = StObject.set(x, "TmpfsOptions", js.undefined)
    
    inline def setType(value: MountType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVolumeOptions(value: DriverConfig): Self = StObject.set(x, "VolumeOptions", value.asInstanceOf[js.Any])
    
    inline def setVolumeOptionsUndefined: Self = StObject.set(x, "VolumeOptions", js.undefined)
  }
}
