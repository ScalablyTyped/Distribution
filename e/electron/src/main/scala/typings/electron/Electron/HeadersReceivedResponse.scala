package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadersReceivedResponse extends js.Object {
  
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
  implicit class HeadersReceivedResponseOps[Self <: HeadersReceivedResponse] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: Record[String, String | js.Array[String]]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    
    @scala.inline
    def setStatusLine(value: String): Self = this.set("statusLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusLine: Self = this.set("statusLine", js.undefined)
  }
}
