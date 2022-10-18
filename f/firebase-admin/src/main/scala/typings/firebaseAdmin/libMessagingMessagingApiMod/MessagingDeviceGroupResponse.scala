package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingDeviceGroupResponse extends StObject {
  
  /**
    * An array of registration tokens that failed to receive the message.
    */
  var failedRegistrationTokens: js.Array[String]
  
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var failureCount: Double
  
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var successCount: Double
}
object MessagingDeviceGroupResponse {
  
  inline def apply(failedRegistrationTokens: js.Array[String], failureCount: Double, successCount: Double): MessagingDeviceGroupResponse = {
    val __obj = js.Dynamic.literal(failedRegistrationTokens = failedRegistrationTokens.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDeviceGroupResponse]
  }
  
  extension [Self <: MessagingDeviceGroupResponse](x: Self) {
    
    inline def setFailedRegistrationTokens(value: js.Array[String]): Self = StObject.set(x, "failedRegistrationTokens", value.asInstanceOf[js.Any])
    
    inline def setFailedRegistrationTokensVarargs(value: String*): Self = StObject.set(x, "failedRegistrationTokens", js.Array(value*))
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
