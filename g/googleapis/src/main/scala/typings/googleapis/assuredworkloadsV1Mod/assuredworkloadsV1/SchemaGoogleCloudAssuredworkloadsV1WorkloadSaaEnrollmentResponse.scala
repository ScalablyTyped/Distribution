package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse extends StObject {
  
  /**
    * Indicates SAA enrollment setup error if any.
    */
  var setupErrors: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates SAA enrollment status of a given workload.
    */
  var setupStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse](x: Self) {
    
    inline def setSetupErrors(value: js.Array[String]): Self = StObject.set(x, "setupErrors", value.asInstanceOf[js.Any])
    
    inline def setSetupErrorsNull: Self = StObject.set(x, "setupErrors", null)
    
    inline def setSetupErrorsUndefined: Self = StObject.set(x, "setupErrors", js.undefined)
    
    inline def setSetupErrorsVarargs(value: String*): Self = StObject.set(x, "setupErrors", js.Array(value*))
    
    inline def setSetupStatus(value: String): Self = StObject.set(x, "setupStatus", value.asInstanceOf[js.Any])
    
    inline def setSetupStatusNull: Self = StObject.set(x, "setupStatus", null)
    
    inline def setSetupStatusUndefined: Self = StObject.set(x, "setupStatus", js.undefined)
  }
}
