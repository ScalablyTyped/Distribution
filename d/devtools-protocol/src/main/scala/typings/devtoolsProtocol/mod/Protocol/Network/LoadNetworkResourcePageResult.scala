package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourcePageResult extends StObject {
  
  /**
    * Response headers.
    */
  var headers: js.UndefOr[Headers] = js.native
  
  var httpStatusCode: js.UndefOr[Double] = js.native
  
  /**
    * Optional values used for error reporting.
    */
  var netError: js.UndefOr[Double] = js.native
  
  var netErrorName: js.UndefOr[String] = js.native
  
  /**
    * If successful, one of the following two fields holds the result.
    */
  var stream: js.UndefOr[StreamHandle] = js.native
  
  var success: Boolean = js.native
}
object LoadNetworkResourcePageResult {
  
  @scala.inline
  def apply(success: Boolean): LoadNetworkResourcePageResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourcePageResult]
  }
  
  @scala.inline
  implicit class LoadNetworkResourcePageResultMutableBuilder[Self <: LoadNetworkResourcePageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    @scala.inline
    def setNetError(value: Double): Self = StObject.set(x, "netError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetErrorName(value: String): Self = StObject.set(x, "netErrorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetErrorNameUndefined: Self = StObject.set(x, "netErrorName", js.undefined)
    
    @scala.inline
    def setNetErrorUndefined: Self = StObject.set(x, "netError", js.undefined)
    
    @scala.inline
    def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
