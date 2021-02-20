package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingDeviceGroupResponse extends StObject {
  
  /**
    * An array of registration tokens that failed to receive the message.
    */
  var failedRegistrationTokens: js.Array[String] = js.native
  
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var failureCount: Double = js.native
  
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var successCount: Double = js.native
}
object MessagingDeviceGroupResponse {
  
  @scala.inline
  def apply(failedRegistrationTokens: js.Array[String], failureCount: Double, successCount: Double): MessagingDeviceGroupResponse = {
    val __obj = js.Dynamic.literal(failedRegistrationTokens = failedRegistrationTokens.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDeviceGroupResponse]
  }
  
  @scala.inline
  implicit class MessagingDeviceGroupResponseMutableBuilder[Self <: MessagingDeviceGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedRegistrationTokens(value: js.Array[String]): Self = StObject.set(x, "failedRegistrationTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRegistrationTokensVarargs(value: String*): Self = StObject.set(x, "failedRegistrationTokens", js.Array(value :_*))
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
