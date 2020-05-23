package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiError extends js.Object {
  var method: String
  var responseText: String
  var status: Double
  var url: String
}

object ApiError {
  @scala.inline
  def apply(method: String, responseText: String, status: Double, url: String): ApiError = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
}

