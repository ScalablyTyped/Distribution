package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableRequest extends StObject {
  
  /**
    * Longest post body size (in bytes) that would be included in requestWillBeSent notification
    */
  var maxPostDataSize: js.UndefOr[integer] = js.undefined
  
  /**
    * Per-resource buffer size in bytes to use when preserving network payloads (XHRs, etc).
    */
  var maxResourceBufferSize: js.UndefOr[integer] = js.undefined
  
  /**
    * Buffer size in bytes to use when preserving network payloads (XHRs, etc).
    */
  var maxTotalBufferSize: js.UndefOr[integer] = js.undefined
}
object EnableRequest {
  
  inline def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxPostDataSize(value: integer): Self = StObject.set(x, "maxPostDataSize", value.asInstanceOf[js.Any])
    
    inline def setMaxPostDataSizeUndefined: Self = StObject.set(x, "maxPostDataSize", js.undefined)
    
    inline def setMaxResourceBufferSize(value: integer): Self = StObject.set(x, "maxResourceBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxResourceBufferSizeUndefined: Self = StObject.set(x, "maxResourceBufferSize", js.undefined)
    
    inline def setMaxTotalBufferSize(value: integer): Self = StObject.set(x, "maxTotalBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTotalBufferSizeUndefined: Self = StObject.set(x, "maxTotalBufferSize", js.undefined)
  }
}
