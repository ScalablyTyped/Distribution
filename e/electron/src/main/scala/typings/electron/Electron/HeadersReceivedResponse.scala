package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadersReceivedResponse extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  /**
    * When provided, the server is assumed to have responded with these headers.
    */
  var responseHeaders: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
  
  /**
    * Should be provided when overriding `responseHeaders` to change header status
    * otherwise original response header's status will be used.
    */
  var statusLine: js.UndefOr[String] = js.native
}
object HeadersReceivedResponse {
  
  @scala.inline
  def apply(): HeadersReceivedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersReceivedResponse]
  }
  
  @scala.inline
  implicit class HeadersReceivedResponseMutableBuilder[Self <: HeadersReceivedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setStatusLine(value: String): Self = StObject.set(x, "statusLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLineUndefined: Self = StObject.set(x, "statusLine", js.undefined)
  }
}
