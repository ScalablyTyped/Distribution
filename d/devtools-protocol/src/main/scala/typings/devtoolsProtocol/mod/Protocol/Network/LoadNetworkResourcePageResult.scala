package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourcePageResult extends js.Object {
  
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
  implicit class LoadNetworkResourcePageResultOps[Self <: LoadNetworkResourcePageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatusCode: Self = this.set("httpStatusCode", js.undefined)
    
    @scala.inline
    def setNetError(value: Double): Self = this.set("netError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetError: Self = this.set("netError", js.undefined)
    
    @scala.inline
    def setNetErrorName(value: String): Self = this.set("netErrorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetErrorName: Self = this.set("netErrorName", js.undefined)
    
    @scala.inline
    def setStream(value: StreamHandle): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
