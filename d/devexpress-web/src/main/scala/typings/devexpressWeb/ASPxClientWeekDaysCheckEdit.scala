package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the WeekDaysCheckEdit control.
  */
trait ASPxClientWeekDaysCheckEdit
  extends StObject
     with ASPxClientControl {
  
  /**
    * Gets the selection state of the week day check boxes.
    */
  def GetValue(): ASPxClientWeekDays
  
  /**
    * Gets the selection state of the week day check boxes.
    * @param value An ASPxClientWeekDays object specifying the selection state of the week day check boxes.
    */
  def SetValue(value: ASPxClientWeekDays): Unit
}
object ASPxClientWeekDaysCheckEdit {
  
  inline def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetValue: () => ASPxClientWeekDays,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetValue: ASPxClientWeekDays => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientWeekDaysCheckEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekDaysCheckEdit]
  }
  
  extension [Self <: ASPxClientWeekDaysCheckEdit](x: Self) {
    
    inline def setGetValue(value: () => ASPxClientWeekDays): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: ASPxClientWeekDays => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
  }
}
