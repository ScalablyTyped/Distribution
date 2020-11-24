package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEntry extends js.Object {
  
  /**
    * Request headers
    */
  var requestHeaders: js.Array[Header] = js.native
  
  /**
    * Request method.
    */
  var requestMethod: String = js.native
  
  /**
    * Request URL.
    */
  var requestURL: String = js.native
  
  /**
    * Response headers
    */
  var responseHeaders: js.Array[Header] = js.native
  
  /**
    * HTTP response status code.
    */
  var responseStatus: integer = js.native
  
  /**
    * HTTP response status text.
    */
  var responseStatusText: String = js.native
  
  /**
    * Number of seconds since epoch.
    */
  var responseTime: Double = js.native
  
  /**
    * HTTP response type
    */
  var responseType: CachedResponseType = js.native
}
object DataEntry {
  
  @scala.inline
  def apply(
    requestHeaders: js.Array[Header],
    requestMethod: String,
    requestURL: String,
    responseHeaders: js.Array[Header],
    responseStatus: integer,
    responseStatusText: String,
    responseTime: Double,
    responseType: CachedResponseType
  ): DataEntry = {
    val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseStatusText = responseStatusText.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEntry]
  }
  
  @scala.inline
  implicit class DataEntryOps[Self <: DataEntry] (val x: Self) extends AnyVal {
    
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
    def setRequestHeadersVarargs(value: Header*): Self = this.set("requestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeaders(value: js.Array[Header]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMethod(value: String): Self = this.set("requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestURL(value: String): Self = this.set("requestURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersVarargs(value: Header*): Self = this.set("responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeaders(value: js.Array[Header]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: integer): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusText(value: String): Self = this.set("responseStatusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTime(value: Double): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseType(value: CachedResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
  }
}
