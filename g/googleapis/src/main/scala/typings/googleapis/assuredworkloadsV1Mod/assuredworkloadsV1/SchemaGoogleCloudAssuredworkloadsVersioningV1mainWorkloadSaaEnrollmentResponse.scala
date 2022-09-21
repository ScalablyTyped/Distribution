package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse extends StObject {
  
  /**
    * Indicates SAA enrollment setup error if any.
    */
  var setupErrors: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates SAA enrollment status of a given workload.
    */
  var setupStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse](x: Self) {
    
    inline def setSetupErrors(value: js.Array[String]): Self = StObject.set(x, "setupErrors", value.asInstanceOf[js.Any])
    
    inline def setSetupErrorsNull: Self = StObject.set(x, "setupErrors", null)
    
    inline def setSetupErrorsUndefined: Self = StObject.set(x, "setupErrors", js.undefined)
    
    inline def setSetupErrorsVarargs(value: String*): Self = StObject.set(x, "setupErrors", js.Array(value*))
    
    inline def setSetupStatus(value: String): Self = StObject.set(x, "setupStatus", value.asInstanceOf[js.Any])
    
    inline def setSetupStatusNull: Self = StObject.set(x, "setupStatus", null)
    
    inline def setSetupStatusUndefined: Self = StObject.set(x, "setupStatus", js.undefined)
  }
}
