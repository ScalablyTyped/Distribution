package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogResponse extends DialogResponse {
  var id: String
  var secure_stream_url: String
  var status: String
  var stream_url: String
}

object LiveDialogResponse {
  @scala.inline
  def apply(
    id: String,
    secure_stream_url: String,
    status: String,
    stream_url: String,
    error_code: Int | Double = null,
    error_message: String = null
  ): LiveDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secure_stream_url = secure_stream_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogResponse]
  }
}

