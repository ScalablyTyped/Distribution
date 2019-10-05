package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestRejected extends js.Object {
  var body: String
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var result: js.Any | Boolean
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object HttpRequestRejected {
  @scala.inline
  def apply(
    body: String,
    result: js.Any | Boolean,
    headers: js.Array[_] = null,
    status: Int | Double = null,
    statusText: String = null
  ): HttpRequestRejected = {
    val __obj = js.Dynamic.literal(body = body, result = result.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[HttpRequestRejected]
  }
}

