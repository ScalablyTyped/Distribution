package typings.dhtmlxscheduler

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
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerLocale]
  }
}

