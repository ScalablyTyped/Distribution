package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDmsWebhooks
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Space resource name, in the form "spaces/x". Example: spaces/AAAAAAAAAAA
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMessage] = js.undefined
  
  /**
    * Optional. A unique request ID for this message. Specifying an existing request ID returns the message created with that ID instead of creating a new message.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Opaque thread identifier. To start or add to a thread, create a message and specify a `threadKey` instead of thread.name. (Setting thread.name has no effect.) The first message with a given `threadKey` starts a new thread. Subsequent messages with the same `threadKey` post into the same thread.
    */
  var threadKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceDmsWebhooks {
  
  inline def apply(): ParamsResourceDmsWebhooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDmsWebhooks]
  }
  
  extension [Self <: ParamsResourceDmsWebhooks](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setThreadKey(value: String): Self = StObject.set(x, "threadKey", value.asInstanceOf[js.Any])
    
    inline def setThreadKeyUndefined: Self = StObject.set(x, "threadKey", js.undefined)
  }
}
