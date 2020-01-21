package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
}

object AnonBeginsWith {
  @scala.inline
  def apply(beginsWith: String = null, limit: Int | Double = null, startAt: String = null): AnonBeginsWith = {
    val __obj = js.Dynamic.literal()
    if (beginsWith != null) __obj.updateDynamic("beginsWith")(beginsWith.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeginsWith]
  }
}

