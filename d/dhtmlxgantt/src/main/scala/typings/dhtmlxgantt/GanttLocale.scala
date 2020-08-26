package typings.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttLocale extends js.Object {
  var date: GanttLocaleDate = js.native
  var labels: GanttLocaleLabels = js.native
}

object GanttLocale {
  @scala.inline
  def apply(date: GanttLocaleDate, labels: GanttLocaleLabels): GanttLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocale]
  }
  @scala.inline
  implicit class GanttLocaleOps[Self <: GanttLocale] (val x: Self) extends AnyVal {
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
    def setDate(value: GanttLocaleDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: GanttLocaleLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
  }
  
}

