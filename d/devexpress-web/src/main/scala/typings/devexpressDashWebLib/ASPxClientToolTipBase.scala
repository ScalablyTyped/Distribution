package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxSchedulerToolTipBase control.
  */
trait ASPxClientToolTipBase extends js.Object {
  /**
    * Gets the tooltip position.
    * @param bounds An object that represents the tooltip bounds.
    */
  def CalculatePosition(bounds: js.Object): ASPxClientPoint
  /**
    * Returns the value that indicates whether or not the tooltip can be displayed.
    */
  def CanShowToolTip(): scala.Boolean
  /**
    * Closes the tooltip.
    */
  def Close(): scala.Unit
  /**
    * Returns the string representation of the specified interval.
    * @param interval An ASPxClientTimeInterval object to convert.
    */
  def ConvertIntervalToString(interval: ASPxClientTimeInterval): java.lang.String
  /**
    * Ends updating the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def FinalizeUpdate(toolTipData: ASPxClientSchedulerToolTipData): scala.Unit
  /**
    * Displays the Appointment Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowAppointmentMenu(eventObject: js.Object): scala.Unit
  /**
    * Displays the View Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowViewMenu(eventObject: js.Object): scala.Unit
  /**
    * Updates the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def Update(toolTipData: ASPxClientSchedulerToolTipData): scala.Unit
}

object ASPxClientToolTipBase {
  @scala.inline
  def apply(
    CalculatePosition: js.Object => ASPxClientPoint,
    CanShowToolTip: () => scala.Boolean,
    Close: () => scala.Unit,
    ConvertIntervalToString: ASPxClientTimeInterval => java.lang.String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => scala.Unit,
    ShowAppointmentMenu: js.Object => scala.Unit,
    ShowViewMenu: js.Object => scala.Unit,
    Update: ASPxClientSchedulerToolTipData => scala.Unit
  ): ASPxClientToolTipBase = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = js.Any.fromFunction0(CanShowToolTip), Close = js.Any.fromFunction0(Close), ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1(FinalizeUpdate), ShowAppointmentMenu = js.Any.fromFunction1(ShowAppointmentMenu), ShowViewMenu = js.Any.fromFunction1(ShowViewMenu), Update = js.Any.fromFunction1(Update))
  
    __obj.asInstanceOf[ASPxClientToolTipBase]
  }
}

