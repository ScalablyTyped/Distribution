package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
}

object BeginsWith {
  @scala.inline
  def apply(beginsWith: String = null, limit: js.UndefOr[Double] = js.undefined, startAt: String = null): BeginsWith = {
    val __obj = js.Dynamic.literal()
    if (beginsWith != null) __obj.updateDynamic("beginsWith")(beginsWith.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginsWith]
  }
}

