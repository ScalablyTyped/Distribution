package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declare client constants that specify the Gantt's view type.
  */
trait ASPxClientGanttViewType extends js.Object {
  /**
    * Displays days.
    */
  var Days: Double
  /**
    * Displays hours.
    */
  var Hours: Double
  /**
    * Display months.
    */
  var Months: Double
  /**
    * Displays weeks.
    */
  var Weeks: Double
}

object ASPxClientGanttViewType {
  @scala.inline
  def apply(Days: Double, Hours: Double, Months: Double, Weeks: Double): ASPxClientGanttViewType = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Weeks = Weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttViewType]
  }
}

