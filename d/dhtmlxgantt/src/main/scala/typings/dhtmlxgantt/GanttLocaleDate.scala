package typings.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttLocaleDate extends js.Object {
  var day_full: js.Array[String] = js.native
  var day_short: js.Array[String] = js.native
  var month_full: js.Array[String] = js.native
  var month_short: js.Array[String] = js.native
}

object GanttLocaleDate {
  @scala.inline
  def apply(
    day_full: js.Array[String],
    day_short: js.Array[String],
    month_full: js.Array[String],
    month_short: js.Array[String]
  ): GanttLocaleDate = {
    val __obj = js.Dynamic.literal(day_full = day_full.asInstanceOf[js.Any], day_short = day_short.asInstanceOf[js.Any], month_full = month_full.asInstanceOf[js.Any], month_short = month_short.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocaleDate]
  }
  @scala.inline
  implicit class GanttLocaleDateOps[Self <: GanttLocaleDate] (val x: Self) extends AnyVal {
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
    def setDay_fullVarargs(value: String*): Self = this.set("day_full", js.Array(value :_*))
    @scala.inline
    def setDay_full(value: js.Array[String]): Self = this.set("day_full", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay_shortVarargs(value: String*): Self = this.set("day_short", js.Array(value :_*))
    @scala.inline
    def setDay_short(value: js.Array[String]): Self = this.set("day_short", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth_fullVarargs(value: String*): Self = this.set("month_full", js.Array(value :_*))
    @scala.inline
    def setMonth_full(value: js.Array[String]): Self = this.set("month_full", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth_shortVarargs(value: String*): Self = this.set("month_short", js.Array(value :_*))
    @scala.inline
    def setMonth_short(value: js.Array[String]): Self = this.set("month_short", value.asInstanceOf[js.Any])
  }
  
}

