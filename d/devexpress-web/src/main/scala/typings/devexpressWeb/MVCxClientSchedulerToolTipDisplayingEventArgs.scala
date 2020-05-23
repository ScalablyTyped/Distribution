package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientScheduler.ToolTipDisplaying event.
  */
trait MVCxClientSchedulerToolTipDisplayingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets information about the tooltip related to the event.
    */
  var data: ASPxClientSchedulerToolTipData
  /**
    * Gets the tooltip related to the event.
    */
  var toolTip: MVCxClientSchedulerTemplateToolTip
}

object MVCxClientSchedulerToolTipDisplayingEventArgs {
  @scala.inline
  def apply(data: ASPxClientSchedulerToolTipData, toolTip: MVCxClientSchedulerTemplateToolTip): MVCxClientSchedulerToolTipDisplayingEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientSchedulerToolTipDisplayingEventArgs]
  }
}

