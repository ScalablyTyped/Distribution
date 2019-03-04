package typings
package easyDashJsendLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialInput extends js.Object {
  var count: scala.Double
  var data: js.Any
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: scala.Double
}

object PartialInput {
  @scala.inline
  def apply(count: scala.Double, data: js.Any, offset: scala.Double, limit: scala.Int | scala.Double = null): PartialInput = {
    val __obj = js.Dynamic.literal(count = count, data = data, offset = offset)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInput]
  }
}

