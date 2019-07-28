package typings.easyDashJsend.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialInput extends js.Object {
  var count: Double
  var data: js.Any
  var limit: js.UndefOr[Double] = js.undefined
  var offset: Double
}

object PartialInput {
  @scala.inline
  def apply(count: Double, data: js.Any, offset: Double, limit: Int | Double = null): PartialInput = {
    val __obj = js.Dynamic.literal(count = count, data = data, offset = offset)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInput]
  }
}

