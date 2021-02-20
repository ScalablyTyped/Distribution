package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PullResponse. */
@js.native
trait IPullResponse extends StObject {
  
  /** PullResponse receivedMessages */
  var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | Null] = js.native
}
object IPullResponse {
  
  @scala.inline
  def apply(): IPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPullResponse]
  }
  
  @scala.inline
  implicit class IPullResponseMutableBuilder[Self <: IPullResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceivedMessages(value: js.Array[IReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedMessagesNull: Self = StObject.set(x, "receivedMessages", null)
    
    @scala.inline
    def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    @scala.inline
    def setReceivedMessagesVarargs(value: IReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value :_*))
  }
}
