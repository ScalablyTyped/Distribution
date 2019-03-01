package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterStringProtocolRequest extends js.Object {
  var method: java.lang.String
  var referrer: java.lang.String
  var uploadData: js.Array[UploadData]
  var url: java.lang.String
}

object RegisterStringProtocolRequest {
  @scala.inline
  def apply(
    method: java.lang.String,
    referrer: java.lang.String,
    uploadData: js.Array[UploadData],
    url: java.lang.String
  ): RegisterStringProtocolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("referrer")(referrer)
    __obj.updateDynamic("uploadData")(uploadData)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RegisterStringProtocolRequest]
  }
}

