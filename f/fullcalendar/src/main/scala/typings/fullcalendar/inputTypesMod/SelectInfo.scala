package typings.fullcalendar.inputTypesMod

import typings.moment.mod.Moment
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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInfo]
  }
}

