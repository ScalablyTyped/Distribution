package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchResponse extends StObject {
  
  /**
    * The number of messages that resulted in errors when sending.
    */
  var failureCount: Double = js.native
  
  /**
    * An array of responses, each corresponding to a message.
    */
  var responses: js.Array[SendResponse] = js.native
  
  /**
    * The number of messages that were successfully handed off for sending.
    */
  var successCount: Double = js.native
}
object BatchResponse {
  
  @scala.inline
  def apply(failureCount: Double, responses: js.Array[SendResponse], successCount: Double): BatchResponse = {
    val __obj = js.Dynamic.literal(failureCount = failureCount.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResponse]
  }
  
  @scala.inline
  implicit class BatchResponseMutableBuilder[Self <: BatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponses(value: js.Array[SendResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesVarargs(value: SendResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
