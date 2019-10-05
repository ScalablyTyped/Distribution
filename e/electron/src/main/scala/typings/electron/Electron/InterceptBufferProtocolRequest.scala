package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptBufferProtocolRequest extends js.Object {
  var method: String
  var referrer: String
  var uploadData: js.Array[UploadData]
  var url: String
}

object InterceptBufferProtocolRequest {
  @scala.inline
  def apply(method: String, referrer: String, uploadData: js.Array[UploadData], url: String): InterceptBufferProtocolRequest = {
    val __obj = js.Dynamic.literal(method = method, referrer = referrer, uploadData = uploadData, url = url)
  
    __obj.asInstanceOf[InterceptBufferProtocolRequest]
  }
}

