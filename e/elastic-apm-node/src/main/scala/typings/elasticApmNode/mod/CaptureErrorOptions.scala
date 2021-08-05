package typings.elasticApmNode.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureErrorOptions extends StObject {
  
  var custom: js.UndefOr[js.Object] = js.undefined
  
  var handled: js.UndefOr[Boolean] = js.undefined
  
  var labels: js.UndefOr[Labels] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[IncomingMessage] = js.undefined
  
  var response: js.UndefOr[ServerResponse] = js.undefined
  
  var tags: js.UndefOr[Labels] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var user: js.UndefOr[UserObject] = js.undefined
}
object CaptureErrorOptions {
  
  inline def apply(): CaptureErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureErrorOptions]
  }
  
  extension [Self <: CaptureErrorOptions](x: Self) {
    
    inline def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: ServerResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setTags(value: Labels): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUser(value: UserObject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
