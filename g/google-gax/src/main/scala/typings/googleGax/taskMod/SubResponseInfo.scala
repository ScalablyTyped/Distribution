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
  def apply(field: String, end: Int | Double = null, start: Int | Double = null): SubResponseInfo = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubResponseInfo]
  }
}

