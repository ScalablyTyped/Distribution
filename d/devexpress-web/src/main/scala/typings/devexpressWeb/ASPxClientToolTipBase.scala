package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxSchedulerToolTipBase control.
  */
@JSGlobal("ASPxClientToolTipBase")
@js.native
class ASPxClientToolTipBase () extends js.Object {
  /**
    * Gets the tooltip position. An ASPxClientPoint object representing the tooltip position.
    * @param bounds An object that represents the tooltip bounds.
    */
  def CalculatePosition(bounds: js.Any): ASPxClientPoint = js.native
  /**
    * Returns the value that indicates whether or not the tooltip can be displayed.
    */
  def CanShowToolTip(): Boolean = js.native
  /**
    * Closes the tooltip.
    */
  def Close(): Unit = js.native
  /**
    * Returns the string representation of the specified interval. A string containing a textual representation of the interval.
    * @param interval An ASPxClientTimeInterval object to convert.
    */
  def ConvertIntervalToString(interval: ASPxClientTimeInterval): String = js.native
  /**
    * Ends updating the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def FinalizeUpdate(toolTipData: ASPxClientSchedulerToolTipData): Unit = js.native
  /**
    * Displays the Appointment Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowAppointmentMenu(eventObject: js.Any): Unit = js.native
  /**
    * Displays the View Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowViewMenu(eventObject: js.Any): Unit = js.native
  /**
    * Updates the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def Update(toolTipData: ASPxClientSchedulerToolTipData): Unit = js.native
}

