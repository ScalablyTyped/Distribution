package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declares client constants that specify the task title position.
  */
trait ASPxClientGanttTaskTitlePosition extends js.Object {
  /**
    * Displays the title inside the task.
    */
  var Inside: Double
  /**
    * The title is hidden.
    */
  var None: Double
  /**
    * Displays the title outside the task.
    */
  var Outside: Double
}

object ASPxClientGanttTaskTitlePosition {
  @scala.inline
  def apply(Inside: Double, None: Double, Outside: Double): ASPxClientGanttTaskTitlePosition = {
    val __obj = js.Dynamic.literal(Inside = Inside.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Outside = Outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskTitlePosition]
  }
}

