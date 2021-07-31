package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A template that is rendered to display a tooltip.
  */
@JSGlobal("MVCxClientSchedulerTemplateToolTip")
@js.native
class MVCxClientSchedulerTemplateToolTip ()
  extends StObject
     with typings.devexpressWeb.MVCxClientSchedulerTemplateToolTip {
  
  /**
    * Gets the tooltip position. An ASPxClientPoint object representing the tooltip position.
    * @param bounds An object that represents the tooltip bounds.
    */
  /* CompleteClass */
  override def CalculatePosition(bounds: js.Any): typings.devexpressWeb.ASPxClientPoint = js.native
  
  /**
    * Returns the value that indicates whether or not the tooltip can be displayed.
    */
  /* CompleteClass */
  override def CanShowToolTip(): Boolean = js.native
  
  /**
    * Closes the tooltip.
    */
  /* CompleteClass */
  override def Close(): Unit = js.native
  
  /**
    * Returns the string representation of the specified interval. A string containing a textual representation of the interval.
    * @param interval An ASPxClientTimeInterval object to convert.
    */
  /* CompleteClass */
  override def ConvertIntervalToString(interval: typings.devexpressWeb.ASPxClientTimeInterval): String = js.native
  
  /**
    * Ends updating the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  /* CompleteClass */
  override def FinalizeUpdate(toolTipData: typings.devexpressWeb.ASPxClientSchedulerToolTipData): Unit = js.native
  
  /**
    * Displays the Appointment Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  /* CompleteClass */
  override def ShowAppointmentMenu(eventObject: js.Any): Unit = js.native
  
  /**
    * Displays the View Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  /* CompleteClass */
  override def ShowViewMenu(eventObject: js.Any): Unit = js.native
  
  /**
    * Updates the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  /* CompleteClass */
  override def Update(toolTipData: typings.devexpressWeb.ASPxClientSchedulerToolTipData): Unit = js.native
  
  /**
    * Gets the tooltip type.
    */
  /* CompleteClass */
  var `type`: typings.devexpressWeb.MVCxSchedulerToolTipType = js.native
}
