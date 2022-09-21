package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1WorkloadFedrampHighSettings extends StObject {
  
  /**
    * Required. Input only. Immutable. Settings used to create a CMEK crypto key.
    */
  var kmsSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsV1WorkloadKMSSettings] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1WorkloadFedrampHighSettings {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1WorkloadFedrampHighSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1WorkloadFedrampHighSettings]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1WorkloadFedrampHighSettings](x: Self) {
    
    inline def setKmsSettings(value: SchemaGoogleCloudAssuredworkloadsV1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
