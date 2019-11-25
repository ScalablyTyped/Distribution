package typings.forgeDashApis

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IfModifiedSince extends js.Object {
  var _with: js.UndefOr[String] = js.undefined
  var ifModifiedSince: js.UndefOr[Date] = js.undefined
}

object Anon_IfModifiedSince {
  @scala.inline
  def apply(_with: String = null, ifModifiedSince: Date = null): Anon_IfModifiedSince = {
    val __obj = js.Dynamic.literal()
    if (_with != null) __obj.updateDynamic("_with")(_with.asInstanceOf[js.Any])
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IfModifiedSince]
  }
}

