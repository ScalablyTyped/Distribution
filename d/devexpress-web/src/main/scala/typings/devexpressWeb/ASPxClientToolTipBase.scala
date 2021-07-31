package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxSchedulerToolTipBase control.
  */
trait ASPxClientToolTipBase extends StObject {
  
  /**
    * Gets the tooltip position. An ASPxClientPoint object representing the tooltip position.
    * @param bounds An object that represents the tooltip bounds.
    */
  def CalculatePosition(bounds: js.Any): ASPxClientPoint
  
  /**
    * Returns the value that indicates whether or not the tooltip can be displayed.
    */
  def CanShowToolTip(): Boolean
  
  /**
    * Closes the tooltip.
    */
  def Close(): Unit
  
  /**
    * Returns the string representation of the specified interval. A string containing a textual representation of the interval.
    * @param interval An ASPxClientTimeInterval object to convert.
    */
  def ConvertIntervalToString(interval: ASPxClientTimeInterval): String
  
  /**
    * Ends updating the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def FinalizeUpdate(toolTipData: ASPxClientSchedulerToolTipData): Unit
  
  /**
    * Displays the Appointment Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowAppointmentMenu(eventObject: js.Any): Unit
  
  /**
    * Displays the View Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowViewMenu(eventObject: js.Any): Unit
  
  /**
    * Updates the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def Update(toolTipData: ASPxClientSchedulerToolTipData): Unit
}
object ASPxClientToolTipBase {
  
  @scala.inline
  def apply(
    CalculatePosition: js.Any => ASPxClientPoint,
    CanShowToolTip: () => Boolean,
    Close: () => Unit,
    ConvertIntervalToString: ASPxClientTimeInterval => String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => Unit,
    ShowAppointmentMenu: js.Any => Unit,
    ShowViewMenu: js.Any => Unit,
    Update: ASPxClientSchedulerToolTipData => Unit
  ): ASPxClientToolTipBase = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = js.Any.fromFunction0(CanShowToolTip), Close = js.Any.fromFunction0(Close), ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1(FinalizeUpdate), ShowAppointmentMenu = js.Any.fromFunction1(ShowAppointmentMenu), ShowViewMenu = js.Any.fromFunction1(ShowViewMenu), Update = js.Any.fromFunction1(Update))
    __obj.asInstanceOf[ASPxClientToolTipBase]
  }
  
  @scala.inline
  implicit class ASPxClientToolTipBaseMutableBuilder[Self <: ASPxClientToolTipBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculatePosition(value: js.Any => ASPxClientPoint): Self = StObject.set(x, "CalculatePosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanShowToolTip(value: () => Boolean): Self = StObject.set(x, "CanShowToolTip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertIntervalToString(value: ASPxClientTimeInterval => String): Self = StObject.set(x, "ConvertIntervalToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinalizeUpdate(value: ASPxClientSchedulerToolTipData => Unit): Self = StObject.set(x, "FinalizeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowAppointmentMenu(value: js.Any => Unit): Self = StObject.set(x, "ShowAppointmentMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowViewMenu(value: js.Any => Unit): Self = StObject.set(x, "ShowViewMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: ASPxClientSchedulerToolTipData => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction1(value))
  }
}
