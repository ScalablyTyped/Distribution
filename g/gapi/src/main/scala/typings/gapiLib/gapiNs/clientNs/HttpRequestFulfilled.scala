package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestFulfilled[T] extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var result: T
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object HttpRequestFulfilled {
  @scala.inline
  def apply[T](
    body: java.lang.String,
    result: T,
    headers: js.Array[_] = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): HttpRequestFulfilled[T] = {
    val __obj = js.Dynamic.literal(body = body, result = result.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[HttpRequestFulfilled[T]]
  }
}

