package typings.googleapis.assuredworkloadsV1beta1Mod.assuredworkloadsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings extends StObject {
  
  /**
    * Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
    */
  var nextRotationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
    */
  var rotationPeriod: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings](x: Self) {
    
    inline def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTimeNull: Self = StObject.set(x, "nextRotationTime", null)
    
    inline def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    inline def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setRotationPeriodNull: Self = StObject.set(x, "rotationPeriod", null)
    
    inline def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
  }
}
