package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtocolRequest extends StObject {
  
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
  implicit class ProtocolRequestMutableBuilder[Self <: ProtocolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadData(value: js.Array[UploadData]): Self = StObject.set(x, "uploadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDataUndefined: Self = StObject.set(x, "uploadData", js.undefined)
    
    @scala.inline
    def setUploadDataVarargs(value: UploadData*): Self = StObject.set(x, "uploadData", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
