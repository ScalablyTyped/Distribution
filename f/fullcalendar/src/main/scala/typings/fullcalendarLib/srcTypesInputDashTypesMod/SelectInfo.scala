package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInfo extends js.Object {
  var end: momentLib.momentMod.Moment
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  var start: momentLib.momentMod.Moment
}

object SelectInfo {
  @scala.inline
  def apply(
    end: momentLib.momentMod.Moment,
    start: momentLib.momentMod.Moment,
    resourceId: java.lang.String = null
  ): SelectInfo = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[SelectInfo]
  }
}

