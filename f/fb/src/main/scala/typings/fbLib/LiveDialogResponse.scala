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
    val __obj = js.Dynamic.literal(id = id, secure_stream_url = secure_stream_url, status = status, stream_url = stream_url)
  
    __obj.asInstanceOf[LiveDialogResponse]
  }
}

