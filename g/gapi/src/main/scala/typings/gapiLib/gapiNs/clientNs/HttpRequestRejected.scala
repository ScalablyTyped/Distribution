package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestRejected extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var result: js.Any | scala.Boolean
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object HttpRequestRejected {
  @scala.inline
  def apply(
    body: java.lang.String,
    result: js.Any | scala.Boolean,
    headers: js.Array[_] = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): HttpRequestRejected = {
    val __obj = js.Dynamic.literal(body = body, result = result.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[HttpRequestRejected]
  }
}

