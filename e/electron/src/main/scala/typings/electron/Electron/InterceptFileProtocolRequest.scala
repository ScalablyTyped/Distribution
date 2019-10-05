package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptFileProtocolRequest extends js.Object {
  var method: String
  var referrer: String
  var uploadData: js.Array[UploadData]
  var url: String
}

object InterceptFileProtocolRequest {
  @scala.inline
  def apply(method: String, referrer: String, uploadData: js.Array[UploadData], url: String): InterceptFileProtocolRequest = {
    val __obj = js.Dynamic.literal(method = method, referrer = referrer, uploadData = uploadData, url = url)
  
    __obj.asInstanceOf[InterceptFileProtocolRequest]
  }
}

