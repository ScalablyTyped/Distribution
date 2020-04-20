package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var headers: js.Array[_]
  var status: Double
  var statusText: String
}

object AnonBody {
  @scala.inline
  def apply(body: String, headers: js.Array[_], status: Double, statusText: String): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

