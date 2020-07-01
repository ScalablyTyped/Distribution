package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxAgeSeconds extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  var method: js.UndefOr[js.Array[String]] = js.native
  var origin: js.UndefOr[js.Array[String]] = js.native
  var responseHeader: js.UndefOr[js.Array[String]] = js.native
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

