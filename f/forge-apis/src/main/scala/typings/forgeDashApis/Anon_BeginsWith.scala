package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
}

object Anon_BeginsWith {
  @scala.inline
  def apply(beginsWith: String = null, limit: Int | Double = null, startAt: String = null): Anon_BeginsWith = {
    val __obj = js.Dynamic.literal()
    if (beginsWith != null) __obj.updateDynamic("beginsWith")(beginsWith)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt)
    __obj.asInstanceOf[Anon_BeginsWith]
  }
}

