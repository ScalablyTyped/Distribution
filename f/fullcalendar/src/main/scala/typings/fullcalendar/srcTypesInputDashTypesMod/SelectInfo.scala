package typings.fullcalendar.srcTypesInputDashTypesMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInfo extends js.Object {
  var end: Moment
  var resourceId: js.UndefOr[String] = js.undefined
  var start: Moment
}

object SelectInfo {
  @scala.inline
  def apply(end: Moment, start: Moment, resourceId: String = null): SelectInfo = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[SelectInfo]
  }
}

