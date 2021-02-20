package typings.firebaseAdmin.messagingMod.messaging

import typings.firebaseAdmin.firebaseNamespaceApiMod.FirebaseArrayIndexError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingTopicManagementResponse extends StObject {
  
  /**
    * An array of errors corresponding to the provided registration token(s). The
    * length of this array will be equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError] = js.native
  
  /**
    * The number of registration tokens that could not be subscribed to the topic
    * and resulted in an error.
    */
  var failureCount: Double = js.native
  
  /**
    * The number of registration tokens that were successfully subscribed to the
    * topic.
    */
  var successCount: Double = js.native
}
object MessagingTopicManagementResponse {
  
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): MessagingTopicManagementResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingTopicManagementResponse]
  }
  
  @scala.inline
  implicit class MessagingTopicManagementResponseMutableBuilder[Self <: MessagingTopicManagementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[FirebaseArrayIndexError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: FirebaseArrayIndexError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
