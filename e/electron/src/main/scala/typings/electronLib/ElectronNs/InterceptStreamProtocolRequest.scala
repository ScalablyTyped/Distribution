package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptStreamProtocolRequest extends js.Object {
  var headers: Headers
  var method: java.lang.String
  var referrer: java.lang.String
  var uploadData: js.Array[UploadData]
  var url: java.lang.String
}

object InterceptStreamProtocolRequest {
  @scala.inline
  def apply(
    headers: Headers,
    method: java.lang.String,
    referrer: java.lang.String,
    uploadData: js.Array[UploadData],
    url: java.lang.String
  ): InterceptStreamProtocolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("referrer")(referrer)
    __obj.updateDynamic("uploadData")(uploadData)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[InterceptStreamProtocolRequest]
  }
}

