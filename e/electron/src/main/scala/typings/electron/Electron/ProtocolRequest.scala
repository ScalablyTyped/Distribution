package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolRequest extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-request
  var headers: Record[String, String] = js.native
  
  var method: String = js.native
  
  var referrer: String = js.native
  
  var uploadData: js.UndefOr[js.Array[UploadData]] = js.native
  
  var url: String = js.native
}
object ProtocolRequest {
  
  @scala.inline
  def apply(headers: Record[String, String], method: String, referrer: String, url: String): ProtocolRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolRequest]
  }
  
  @scala.inline
  implicit class ProtocolRequestOps[Self <: ProtocolRequest] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDataVarargs(value: UploadData*): Self = this.set("uploadData", js.Array(value :_*))
    
    @scala.inline
    def setUploadData(value: js.Array[UploadData]): Self = this.set("uploadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadData: Self = this.set("uploadData", js.undefined)
  }
}
