package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declares client constants that specify the task title position.
  */
@js.native
trait ASPxClientGanttTaskTitlePosition extends js.Object {
  /**
    * Displays the title inside the task.
    */
  var Inside: Double = js.native
  /**
    * The title is hidden.
    */
  var None: Double = js.native
  /**
    * Displays the title outside the task.
    */
  var Outside: Double = js.native
}

object ASPxClientGanttTaskTitlePosition {
  @scala.inline
  def apply(Inside: Double, None: Double, Outside: Double): ASPxClientGanttTaskTitlePosition = {
    val __obj = js.Dynamic.literal(Inside = Inside.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Outside = Outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskTitlePosition]
  }
  @scala.inline
  implicit class ASPxClientGanttTaskTitlePositionOps[Self <: ASPxClientGanttTaskTitlePosition] (val x: Self) extends AnyVal {
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
    def setInside(value: Double): Self = this.set("Inside", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: Double): Self = this.set("None", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutside(value: Double): Self = this.set("Outside", value.asInstanceOf[js.Any])
  }
  
}

