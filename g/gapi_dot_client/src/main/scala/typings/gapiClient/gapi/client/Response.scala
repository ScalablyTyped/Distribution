package typings.gapiClient.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the HTTP response
  */
trait Response[T] extends js.Object {
  // The raw response string.
  var body: String
  // The map of HTTP response headers.
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  // The JSON-parsed result.
  var result: T
  // HTTP status
  var status: js.UndefOr[Double] = js.undefined
  // HTTP status text
  var statusText: js.UndefOr[String] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](
    body: String,
    result: T,
    headers: js.Array[_] = null,
    status: Int | Double = null,
    statusText: String = null
  ): Response[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
}

