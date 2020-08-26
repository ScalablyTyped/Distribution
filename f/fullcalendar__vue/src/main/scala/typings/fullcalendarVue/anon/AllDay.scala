package typings.fullcalendarVue.anon

import typings.std.Date
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDay extends js.Object {
  var allDay: Boolean = js.native
  var date: Date = js.native
  var dayEl: HTMLElement = js.native
  var hiddenSegs: js.Array[_] = js.native
  var jsEvent: MouseEvent = js.native
  var moreEl: HTMLElement = js.native
  var segs: js.Array[_] = js.native
  var view: js.Any = js.native
}

object AllDay {
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
  ): AllDay = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], moreEl = moreEl.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay]
  }
  @scala.inline
  implicit class AllDayOps[Self <: AllDay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllDay(value: Boolean): Self = this.set("allDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayEl(value: HTMLElement): Self = this.set("dayEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenSegsVarargs(value: js.Any*): Self = this.set("hiddenSegs", js.Array(value :_*))
    @scala.inline
    def setHiddenSegs(value: js.Array[_]): Self = this.set("hiddenSegs", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsEvent(value: MouseEvent): Self = this.set("jsEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoreEl(value: HTMLElement): Self = this.set("moreEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegsVarargs(value: js.Any*): Self = this.set("segs", js.Array(value :_*))
    @scala.inline
    def setSegs(value: js.Array[_]): Self = this.set("segs", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: js.Any): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

