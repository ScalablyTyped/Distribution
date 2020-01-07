package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MaxAgeSeconds extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  var method: js.UndefOr[js.Array[String]] = js.native
  var origin: js.UndefOr[js.Array[String]] = js.native
  var responseHeader: js.UndefOr[js.Array[String]] = js.native
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
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (responseHeader != null) __obj.updateDynamic("responseHeader")(responseHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAgeSeconds]
  }
}

