package typings.googleCloudPubsub.anon

import typings.googleCloudPubsub.messageQueuesMod.QueuedMessage
import typings.googleCloudPubsub.messageQueuesMod.QueuedMessages
import typings.googleCloudPubsub.subscriberMod.AckResponse
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToError extends StObject {
  
  var toError: Map[AckResponse, QueuedMessages]
  
  var toRetry: QueuedMessages
}
object ToError {
  
  inline def apply(toError: Map[AckResponse, QueuedMessages], toRetry: QueuedMessages): ToError = {
    val __obj = js.Dynamic.literal(toError = toError.asInstanceOf[js.Any], toRetry = toRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToError]
  }
  
  extension [Self <: ToError](x: Self) {
    
    inline def setToError(value: Map[AckResponse, QueuedMessages]): Self = StObject.set(x, "toError", value.asInstanceOf[js.Any])
    
    inline def setToRetry(value: QueuedMessages): Self = StObject.set(x, "toRetry", value.asInstanceOf[js.Any])
    
    inline def setToRetryVarargs(value: QueuedMessage*): Self = StObject.set(x, "toRetry", js.Array(value*))
  }
}
