package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings extends StObject {
  
  /**
    * Required. Input only. Immutable. Settings used to create a CMEK crypto key.
    */
  var kmsSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings](x: Self) {
    
    inline def setKmsSettings(value: SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
