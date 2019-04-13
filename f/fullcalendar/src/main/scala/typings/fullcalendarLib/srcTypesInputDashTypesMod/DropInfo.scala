package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropInfo extends js.Object {
  var end: momentLib.momentMod.Moment
  var start: momentLib.momentMod.Moment
}

object DropInfo {
  @scala.inline
  def apply(end: momentLib.momentMod.Moment, start: momentLib.momentMod.Moment): DropInfo = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[DropInfo]
  }
}

