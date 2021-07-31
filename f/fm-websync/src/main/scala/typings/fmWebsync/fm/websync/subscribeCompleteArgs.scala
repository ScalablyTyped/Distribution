package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subscribeCompleteArgs
  extends StObject
     with baseResponseArgs {
  
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean
}
object subscribeCompleteArgs {
  
  @scala.inline
  def apply(client: client, clientId: String, isResubscribe: Boolean, meta: js.Any, timestamp: Date): subscribeCompleteArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isResubscribe = isResubscribe.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeCompleteArgs]
  }
  
  @scala.inline
  implicit class subscribeCompleteArgsMutableBuilder[Self <: subscribeCompleteArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsResubscribe(value: Boolean): Self = StObject.set(x, "isResubscribe", value.asInstanceOf[js.Any])
  }
}
