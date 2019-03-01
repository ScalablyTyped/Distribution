package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerLocale extends js.Object {
  var date: SchedulerLocaleDate
  var labels: SchedulerLocaleLabels
}

object SchedulerLocale {
  @scala.inline
  def apply(date: SchedulerLocaleDate, labels: SchedulerLocaleLabels): SchedulerLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[SchedulerLocale]
  }
}

