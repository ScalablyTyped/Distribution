package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var headers: Record[String, String]
  var method: String
  var referrer: String
  var uploadData: js.Array[UploadData]
  var url: String
}

object Request {
  @scala.inline
  def apply(
    headers: Record[String, String],
    method: String,
    referrer: String,
    uploadData: js.Array[UploadData],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], uploadData = uploadData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

