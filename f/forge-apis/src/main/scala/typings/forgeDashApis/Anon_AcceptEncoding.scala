package typings.forgeDashApis

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptEncoding extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
  var ifModifiedSince: js.UndefOr[Date] = js.undefined
}

object Anon_AcceptEncoding {
  @scala.inline
  def apply(acceptEncoding: String = null, ifModifiedSince: Date = null): Anon_AcceptEncoding = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding)
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince)
    __obj.asInstanceOf[Anon_AcceptEncoding]
  }
}

