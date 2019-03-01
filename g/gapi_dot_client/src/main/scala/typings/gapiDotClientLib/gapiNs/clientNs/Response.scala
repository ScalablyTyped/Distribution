package typings
package gapiDotClientLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the HTTP response
  */
trait Response[T] extends js.Object {
  // The raw response string.
  var body: java.lang.String
  // The map of HTTP response headers.
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  // The JSON-parsed result.
  var result: T
  // HTTP status
  var status: js.UndefOr[scala.Double] = js.undefined
  // HTTP status text
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](
    body: java.lang.String,
    result: T,
    headers: js.Array[_] = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): Response[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Response[T]]
  }
}

