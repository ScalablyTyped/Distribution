package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropInfo extends js.Object {
  var end: momentLib.momentMod.momentNs.Moment
  var start: momentLib.momentMod.momentNs.Moment
}

object DropInfo {
  @scala.inline
  def apply(end: momentLib.momentMod.momentNs.Moment, start: momentLib.momentMod.momentNs.Moment): DropInfo = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[DropInfo]
  }
}

