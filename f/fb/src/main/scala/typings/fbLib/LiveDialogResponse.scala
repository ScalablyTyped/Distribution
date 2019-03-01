package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogResponse extends js.Object {
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
    stream_url: java.lang.String
  ): LiveDialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("secure_stream_url")(secure_stream_url)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("stream_url")(stream_url)
    __obj.asInstanceOf[LiveDialogResponse]
  }
}

