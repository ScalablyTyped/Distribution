package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingDevicesResponse extends StObject {
  
  var canonicalRegistrationTokenCount: Double = js.native
  
  var failureCount: Double = js.native
  
  var multicastId: Double = js.native
  
  var results: js.Array[MessagingDeviceResult] = js.native
  
  var successCount: Double = js.native
}
object MessagingDevicesResponse {
  
  @scala.inline
  def apply(
    canonicalRegistrationTokenCount: Double,
    failureCount: Double,
    multicastId: Double,
    results: js.Array[MessagingDeviceResult],
    successCount: Double
  ): MessagingDevicesResponse = {
    val __obj = js.Dynamic.literal(canonicalRegistrationTokenCount = canonicalRegistrationTokenCount.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], multicastId = multicastId.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDevicesResponse]
  }
  
  @scala.inline
  implicit class MessagingDevicesResponseMutableBuilder[Self <: MessagingDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalRegistrationTokenCount(value: Double): Self = StObject.set(x, "canonicalRegistrationTokenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticastId(value: Double): Self = StObject.set(x, "multicastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[MessagingDeviceResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: MessagingDeviceResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
