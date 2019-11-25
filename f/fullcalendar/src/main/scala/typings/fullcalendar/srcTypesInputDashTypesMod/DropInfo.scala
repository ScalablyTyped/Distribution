package typings.fullcalendar.srcTypesInputDashTypesMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropInfo extends js.Object {
  var end: Moment
  var start: Moment
}

object DropInfo {
  @scala.inline
  def apply(end: Moment, start: Moment): DropInfo = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropInfo]
  }
}

