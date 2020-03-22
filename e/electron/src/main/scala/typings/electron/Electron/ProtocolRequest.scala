package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolRequest extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/protocol-request
  var method: String
  var referrer: String
  var uploadData: js.UndefOr[js.Array[UploadData]] = js.undefined
  var url: String
}

object ProtocolRequest {
  @scala.inline
  def apply(method: String, referrer: String, url: String, uploadData: js.Array[UploadData] = null): ProtocolRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (uploadData != null) __obj.updateDynamic("uploadData")(uploadData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolRequest]
  }
}

