package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchResponse extends StObject {
  
  /**
    * The number of messages that resulted in errors when sending.
    */
  var failureCount: Double
  
  /**
    * An array of responses, each corresponding to a message.
    */
  var responses: js.Array[SendResponse]
  
  /**
    * The number of messages that were successfully handed off for sending.
    */
  var successCount: Double
}
object BatchResponse {
  
  inline def apply(failureCount: Double, responses: js.Array[SendResponse], successCount: Double): BatchResponse = {
    val __obj = js.Dynamic.literal(failureCount = failureCount.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResponse]
  }
  
  extension [Self <: BatchResponse](x: Self) {
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: js.Array[SendResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: SendResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
