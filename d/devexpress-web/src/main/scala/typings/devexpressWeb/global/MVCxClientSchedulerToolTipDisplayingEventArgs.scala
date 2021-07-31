package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientScheduler.ToolTipDisplaying event.
  */
@JSGlobal("MVCxClientSchedulerToolTipDisplayingEventArgs")
@js.native
class MVCxClientSchedulerToolTipDisplayingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.MVCxClientSchedulerToolTipDisplayingEventArgs {
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
  var data: typings.devexpressWeb.ASPxClientSchedulerToolTipData = js.native
  
  /**
    * Gets the tooltip related to the event.
    */
  /* CompleteClass */
  var toolTip: typings.devexpressWeb.MVCxClientSchedulerTemplateToolTip = js.native
}
