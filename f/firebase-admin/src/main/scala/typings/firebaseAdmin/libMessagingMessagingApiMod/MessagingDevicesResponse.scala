package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingDevicesResponse extends StObject {
  
  var canonicalRegistrationTokenCount: Double
  
  var failureCount: Double
  
  var multicastId: Double
  
  var results: js.Array[MessagingDeviceResult]
  
  var successCount: Double
}
object MessagingDevicesResponse {
  
  inline def apply(
    canonicalRegistrationTokenCount: Double,
    failureCount: Double,
    multicastId: Double,
    results: js.Array[MessagingDeviceResult],
    successCount: Double
  ): MessagingDevicesResponse = {
    val __obj = js.Dynamic.literal(canonicalRegistrationTokenCount = canonicalRegistrationTokenCount.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], multicastId = multicastId.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDevicesResponse]
  }
  
  extension [Self <: MessagingDevicesResponse](x: Self) {
    
    inline def setCanonicalRegistrationTokenCount(value: Double): Self = StObject.set(x, "canonicalRegistrationTokenCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setMulticastId(value: Double): Self = StObject.set(x, "multicastId", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[MessagingDeviceResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: MessagingDeviceResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
