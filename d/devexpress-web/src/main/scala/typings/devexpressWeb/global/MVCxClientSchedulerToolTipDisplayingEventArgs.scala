package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientScheduler.ToolTipDisplaying event.
  */
@JSGlobal("MVCxClientSchedulerToolTipDisplayingEventArgs")
@js.native
class MVCxClientSchedulerToolTipDisplayingEventArgs protected ()
  extends typings.devexpressWeb.MVCxClientSchedulerToolTipDisplayingEventArgs {
  /**
    * Initializes new instance of the MVCxClientSchedulerToolTipDisplayingEventArgs class with the specified settings.
    * @param toolTip A MVCxClientSchedulerTemplateToolTip object that is a tooltip.
    * @param data An ASPxClientSchedulerToolTipData object that is the tooltip data.
    */
  def this(
    toolTip: typings.devexpressWeb.MVCxClientSchedulerTemplateToolTip,
    data: typings.devexpressWeb.ASPxClientSchedulerToolTipData
  ) = this()
}

