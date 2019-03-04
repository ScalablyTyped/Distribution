package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellInfo extends js.Object {
  var date: momentLib.momentMod.momentNs.Moment
  var dayEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery
  var hiddenSegs: js.Array[EventSegment]
  var moreEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery
  var segs: js.Array[EventSegment]
}

object CellInfo {
  @scala.inline
  def apply(
    date: momentLib.momentMod.momentNs.Moment,
    dayEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery,
    hiddenSegs: js.Array[EventSegment],
    moreEl: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery,
    segs: js.Array[EventSegment]
  ): CellInfo = {
    val __obj = js.Dynamic.literal(date = date, dayEl = dayEl, hiddenSegs = hiddenSegs, moreEl = moreEl, segs = segs)
  
    __obj.asInstanceOf[CellInfo]
  }
}

