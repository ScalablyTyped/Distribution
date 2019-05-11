package typings
package googleDashGaxLib.buildSrcBundlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubResponseInfo extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var field: java.lang.String
  var start: js.UndefOr[scala.Double] = js.undefined
}

object SubResponseInfo {
  @scala.inline
  def apply(
    field: java.lang.String,
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): SubResponseInfo = {
    val __obj = js.Dynamic.literal(field = field)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubResponseInfo]
  }
}

