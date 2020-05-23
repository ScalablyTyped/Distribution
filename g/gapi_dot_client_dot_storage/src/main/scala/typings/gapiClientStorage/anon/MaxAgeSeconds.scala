package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeSeconds extends js.Object {
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

object MaxAgeSeconds {
  @scala.inline
  def apply(
    maxAgeSeconds: js.UndefOr[Double] = js.undefined,
    method: js.Array[String] = null,
    origin: js.Array[String] = null,
    responseHeader: js.Array[String] = null
  ): MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (responseHeader != null) __obj.updateDynamic("responseHeader")(responseHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeSeconds]
  }
}

