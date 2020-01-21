package typings.fullcalendar.inputTypesMod

import typings.fullcalendar.jqueryHooksMod._Global_.JQuery
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellInfo extends js.Object {
  var date: Moment
  var dayEl: JQuery
  var hiddenSegs: js.Array[EventSegment]
  var moreEl: JQuery
  var segs: js.Array[EventSegment]
}

object CellInfo {
  @scala.inline
  def apply(
    date: Moment,
    dayEl: JQuery,
    hiddenSegs: js.Array[EventSegment],
    moreEl: JQuery,
    segs: js.Array[EventSegment]
  ): CellInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], moreEl = moreEl.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellInfo]
  }
}

