package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAgeSeconds extends js.Object {
  /** The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses. */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  /**
    * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "&#42;" is permitted in the list of methods, and means
    * "any method".
    */
  var method: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of Origins eligible to receive CORS response headers. Note: "&#42;" is permitted in the list of origins, and means "any Origin". */
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains. */
  var responseHeader: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_MaxAgeSeconds {
  @scala.inline
  def apply(
    maxAgeSeconds: Int | Double = null,
    method: js.Array[String] = null,
    origin: js.Array[String] = null,
    responseHeader: js.Array[String] = null
  ): Anon_MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (responseHeader != null) __obj.updateDynamic("responseHeader")(responseHeader)
    __obj.asInstanceOf[Anon_MaxAgeSeconds]
  }
}

