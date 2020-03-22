package typings.fullcalendarVue

import typings.std.Date
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllDay extends js.Object {
  var allDay: Boolean
  var date: Date
  var dayEl: HTMLElement
  var hiddenSegs: js.Array[_]
  var jsEvent: MouseEvent
  var moreEl: HTMLElement
  var segs: js.Array[_]
  var view: js.Any
}

object AnonAllDay {
  @scala.inline
  def apply(
    allDay: Boolean,
    date: Date,
    dayEl: HTMLElement,
    hiddenSegs: js.Array[_],
    jsEvent: MouseEvent,
    moreEl: HTMLElement,
    segs: js.Array[_],
    view: js.Any
  ): AnonAllDay = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], moreEl = moreEl.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllDay]
  }
}

