package typings.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttLocale extends js.Object {
  var date: GanttLocaleDate
  var labels: GanttLocaleLabels
}

object GanttLocale {
  @scala.inline
  def apply(date: GanttLocaleDate, labels: GanttLocaleLabels): GanttLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GanttLocale]
  }
}

