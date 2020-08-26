package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientScheduler.ToolTipDisplaying event.
  */
@js.native
trait MVCxClientSchedulerToolTipDisplayingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets information about the tooltip related to the event.
    */
  var data: ASPxClientSchedulerToolTipData = js.native
  /**
    * Gets the tooltip related to the event.
    */
  var toolTip: MVCxClientSchedulerTemplateToolTip = js.native
}

object MVCxClientSchedulerToolTipDisplayingEventArgs {
  @scala.inline
  def apply(data: ASPxClientSchedulerToolTipData, toolTip: MVCxClientSchedulerTemplateToolTip): MVCxClientSchedulerToolTipDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientSchedulerToolTipDisplayingEventArgs]
  }
  @scala.inline
  implicit class MVCxClientSchedulerToolTipDisplayingEventArgsOps[Self <: MVCxClientSchedulerToolTipDisplayingEventArgs] (val x: Self) extends AnyVal {
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
    def setData(value: ASPxClientSchedulerToolTipData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTip(value: MVCxClientSchedulerTemplateToolTip): Self = this.set("toolTip", value.asInstanceOf[js.Any])
  }
  
}

