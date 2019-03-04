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
    CalculatePosition: js.Function1[js.Object, ASPxClientPoint],
    CanShowToolTip: js.Function0[scala.Boolean],
    Close: js.Function0[scala.Unit],
    ConvertIntervalToString: js.Function1[ASPxClientTimeInterval, java.lang.String],
    FinalizeUpdate: js.Function1[ASPxClientSchedulerToolTipData, scala.Unit],
    ShowAppointmentMenu: js.Function1[js.Object, scala.Unit],
    ShowViewMenu: js.Function1[js.Object, scala.Unit],
    Update: js.Function1[ASPxClientSchedulerToolTipData, scala.Unit]
  ): ASPxClientToolTipBase = {
    val __obj = js.Dynamic.literal(CalculatePosition = CalculatePosition, CanShowToolTip = CanShowToolTip, Close = Close, ConvertIntervalToString = ConvertIntervalToString, FinalizeUpdate = FinalizeUpdate, ShowAppointmentMenu = ShowAppointmentMenu, ShowViewMenu = ShowViewMenu, Update = Update)
  
    __obj.asInstanceOf[ASPxClientToolTipBase]
  }
}

