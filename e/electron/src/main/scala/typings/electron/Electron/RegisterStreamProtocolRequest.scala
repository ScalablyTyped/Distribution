package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterStreamProtocolRequest extends js.Object {
  var headers: Headers
  var method: String
  var referrer: String
  var uploadData: js.Array[UploadData]
  var url: String
}

object RegisterStreamProtocolRequest {
  @scala.inline
  def apply(headers: Headers, method: String, referrer: String, uploadData: js.Array[UploadData], url: String): RegisterStreamProtocolRequest = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, referrer = referrer, uploadData = uploadData, url = url)
  
    __obj.asInstanceOf[RegisterStreamProtocolRequest]
  }
}

