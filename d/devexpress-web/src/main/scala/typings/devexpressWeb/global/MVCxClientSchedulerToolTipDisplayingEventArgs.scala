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
  /**
    * Gets information about the tooltip related to the event.
    */
  /* CompleteClass */
  override var data: typings.devexpressWeb.ASPxClientSchedulerToolTipData = js.native
  /**
    * Gets the tooltip related to the event.
    */
  /* CompleteClass */
  override var toolTip: typings.devexpressWeb.MVCxClientSchedulerTemplateToolTip = js.native
}

