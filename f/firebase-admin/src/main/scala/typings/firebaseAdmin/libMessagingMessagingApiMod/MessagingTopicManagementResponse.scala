package typings.firebaseAdmin.libMessagingMessagingApiMod

import typings.firebaseAdmin.libAppCoreMod.FirebaseArrayIndexError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingTopicManagementResponse extends StObject {
  
  /**
    * An array of errors corresponding to the provided registration token(s). The
    * length of this array will be equal to {@link MessagingTopicManagementResponse.failureCount}.
    */
  var errors: js.Array[FirebaseArrayIndexError]
  
  /**
    * The number of registration tokens that could not be subscribed to the topic
    * and resulted in an error.
    */
  var failureCount: Double
  
  /**
    * The number of registration tokens that were successfully subscribed to the
    * topic.
    */
  var successCount: Double
}
object MessagingTopicManagementResponse {
  
  inline def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): MessagingTopicManagementResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingTopicManagementResponse]
  }
  
  extension [Self <: MessagingTopicManagementResponse](x: Self) {
    
    inline def setErrors(value: js.Array[FirebaseArrayIndexError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: FirebaseArrayIndexError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
