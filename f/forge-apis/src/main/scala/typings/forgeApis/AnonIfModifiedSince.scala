package typings.forgeApis

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIfModifiedSince extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
  var ifModifiedSince: js.UndefOr[Date] = js.undefined
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[String] = js.undefined
}

object AnonIfModifiedSince {
  @scala.inline
  def apply(
    acceptEncoding: String = null,
    ifModifiedSince: Date = null,
    ifNoneMatch: String = null,
    range: String = null
  ): AnonIfModifiedSince = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding.asInstanceOf[js.Any])
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince.asInstanceOf[js.Any])
    if (ifNoneMatch != null) __obj.updateDynamic("ifNoneMatch")(ifNoneMatch.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIfModifiedSince]
  }
}

