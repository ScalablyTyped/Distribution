package typings.googleGax.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubResponseInfo extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var field: String
  var start: js.UndefOr[Double] = js.undefined
}

object SubResponseInfo {
  @scala.inline
  def apply(field: String, end: js.UndefOr[Double] = js.undefined, start: js.UndefOr[Double] = js.undefined): SubResponseInfo = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubResponseInfo]
  }
}

