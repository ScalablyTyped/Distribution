package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadNetworkResourcePageResult extends StObject {
  
  /**
    * Response headers.
    */
  var headers: js.UndefOr[Headers] = js.undefined
  
  var httpStatusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional values used for error reporting.
    */
  var netError: js.UndefOr[Double] = js.undefined
  
  var netErrorName: js.UndefOr[String] = js.undefined
  
  /**
    * If successful, one of the following two fields holds the result.
    */
  var stream: js.UndefOr[StreamHandle] = js.undefined
  
  var success: Boolean
}
object LoadNetworkResourcePageResult {
  
  inline def apply(success: Boolean): LoadNetworkResourcePageResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourcePageResult]
  }
  
  extension [Self <: LoadNetworkResourcePageResult](x: Self) {
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    inline def setNetError(value: Double): Self = StObject.set(x, "netError", value.asInstanceOf[js.Any])
    
    inline def setNetErrorName(value: String): Self = StObject.set(x, "netErrorName", value.asInstanceOf[js.Any])
    
    inline def setNetErrorNameUndefined: Self = StObject.set(x, "netErrorName", js.undefined)
    
    inline def setNetErrorUndefined: Self = StObject.set(x, "netError", js.undefined)
    
    inline def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
