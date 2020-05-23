package typings.facebookJsSdk.facebook

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
    error_code: js.UndefOr[Double] = js.undefined,
    error_message: String = null
  ): LiveDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secure_stream_url = secure_stream_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    if (!js.isUndefined(error_code)) __obj.updateDynamic("error_code")(error_code.get.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogResponse]
  }
}

