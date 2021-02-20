package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait subscribeFailureArgs extends baseFailureArgs {
  
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean = js.native
}
object subscribeFailureArgs {
  
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    isResubscribe: Boolean,
    meta: js.Any,
    timestamp: Date
  ): subscribeFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isResubscribe = isResubscribe.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeFailureArgs]
  }
  
  @scala.inline
  implicit class subscribeFailureArgsMutableBuilder[Self <: subscribeFailureArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsResubscribe(value: Boolean): Self = StObject.set(x, "isResubscribe", value.asInstanceOf[js.Any])
  }
}
