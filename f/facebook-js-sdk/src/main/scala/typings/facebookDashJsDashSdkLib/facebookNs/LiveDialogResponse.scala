package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogResponse extends DialogResponse {
  var id: java.lang.String
  var secure_stream_url: java.lang.String
  var status: java.lang.String
  var stream_url: java.lang.String
}

object LiveDialogResponse {
  @scala.inline
  def apply(
    id: java.lang.String,
    secure_stream_url: java.lang.String,
    status: java.lang.String,
    stream_url: java.lang.String,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): LiveDialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("secure_stream_url")(secure_stream_url)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("stream_url")(stream_url)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[LiveDialogResponse]
  }
}

