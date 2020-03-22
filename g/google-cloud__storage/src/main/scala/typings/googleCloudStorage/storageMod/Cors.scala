package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cors extends js.Object {
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[js.Array[String]] = js.undefined
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  var responseHeader: js.UndefOr[js.Array[String]] = js.undefined
}

object Cors {
  @scala.inline
  def apply(
    maxAgeSeconds: Int | Double = null,
    method: js.Array[String] = null,
    origin: js.Array[String] = null,
    responseHeader: js.Array[String] = null
  ): Cors = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (responseHeader != null) __obj.updateDynamic("responseHeader")(responseHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cors]
  }
}

