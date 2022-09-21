package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings extends StObject {
  
  /**
    * Input only. Immutable. Settings used to create a CMEK crypto key.
    */
  var kmsSettings: js.UndefOr[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings](x: Self) {
    
    inline def setKmsSettings(value: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
