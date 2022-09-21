package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1WorkloadCJISSettings extends StObject {
  
  /**
    * Required. Input only. Immutable. Settings used to create a CMEK crypto key.
    */
  var kmsSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsV1WorkloadKMSSettings] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1WorkloadCJISSettings {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1WorkloadCJISSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1WorkloadCJISSettings]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1WorkloadCJISSettings](x: Self) {
    
    inline def setKmsSettings(value: SchemaGoogleCloudAssuredworkloadsV1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
