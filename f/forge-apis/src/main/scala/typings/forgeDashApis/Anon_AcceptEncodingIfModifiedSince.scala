package typings.forgeDashApis

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptEncodingIfModifiedSince extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
  var ifModifiedSince: js.UndefOr[Date] = js.undefined
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[String] = js.undefined
}

object Anon_AcceptEncodingIfModifiedSince {
  @scala.inline
  def apply(
    acceptEncoding: String = null,
    ifModifiedSince: Date = null,
    ifNoneMatch: String = null,
    range: String = null
  ): Anon_AcceptEncodingIfModifiedSince = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding)
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince)
    if (ifNoneMatch != null) __obj.updateDynamic("ifNoneMatch")(ifNoneMatch)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Anon_AcceptEncodingIfModifiedSince]
  }
}

