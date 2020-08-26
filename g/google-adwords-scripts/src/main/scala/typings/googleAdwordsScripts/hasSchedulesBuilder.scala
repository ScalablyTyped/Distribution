package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasSchedulesBuilder[B] extends js.Object {
  def withSchedules(schedules: ExtensionScheduleInput): B = js.native
}

object hasSchedulesBuilder {
  @scala.inline
  def apply[B](withSchedules: ExtensionScheduleInput => B): hasSchedulesBuilder[B] = {
    val __obj = js.Dynamic.literal(withSchedules = js.Any.fromFunction1(withSchedules))
    __obj.asInstanceOf[hasSchedulesBuilder[B]]
  }
  @scala.inline
  implicit class hasSchedulesBuilderOps[Self <: hasSchedulesBuilder[_], B] (val x: Self with hasSchedulesBuilder[B]) extends AnyVal {
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
    def setWithSchedules(value: ExtensionScheduleInput => B): Self = this.set("withSchedules", js.Any.fromFunction1(value))
  }
  
}

