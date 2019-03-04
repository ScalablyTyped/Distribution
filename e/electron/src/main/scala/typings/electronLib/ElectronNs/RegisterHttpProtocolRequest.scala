package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterHttpProtocolRequest extends js.Object {
  var headers: Headers
  var method: java.lang.String
  var referrer: java.lang.String
  var uploadData: js.Array[UploadData]
  var url: java.lang.String
}

object RegisterHttpProtocolRequest {
  @scala.inline
  def apply(
    headers: Headers,
    method: java.lang.String,
    referrer: java.lang.String,
    uploadData: js.Array[UploadData],
    url: java.lang.String
  ): RegisterHttpProtocolRequest = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, referrer = referrer, uploadData = uploadData, url = url)
  
    __obj.asInstanceOf[RegisterHttpProtocolRequest]
  }
}

