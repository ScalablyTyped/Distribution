package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingPullResponse. */
trait IStreamingPullResponse extends StObject {
  
  /** StreamingPullResponse receivedMessages */
  var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | Null] = js.undefined
}
object IStreamingPullResponse {
  
  inline def apply(): IStreamingPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingPullResponse]
  }
  
  extension [Self <: IStreamingPullResponse](x: Self) {
    
    inline def setReceivedMessages(value: js.Array[IReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    inline def setReceivedMessagesNull: Self = StObject.set(x, "receivedMessages", null)
    
    inline def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    inline def setReceivedMessagesVarargs(value: IReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value :_*))
  }
}
