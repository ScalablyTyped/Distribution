package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the RecurrenceRangeControl.
  */
@js.native
trait ASPxClientRecurrenceRangeControl extends ASPxClientControl {
  
  /**
    * Gets the recurrence end date.
    */
  def GetEndDate(): Date = js.native
  
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double = js.native
  
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange = js.native
  
  /**
    * Sets the recurrence end date.
    * @param date A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEndDate(date: Date): Unit = js.native
  
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit = js.native
  
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit = js.native
}
object ASPxClientRecurrenceRangeControl {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetEndDate: () => Date,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetOccurrenceCount: () => Double,
    GetParentControl: () => js.Any,
    GetRange: () => ASPxClientRecurrenceRange,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEndDate: Date => Unit,
    SetHeight: Double => Unit,
    SetOccurrenceCount: Double => Unit,
    SetRange: ASPxClientRecurrenceRange => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientRecurrenceRangeControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEndDate = js.Any.fromFunction0(GetEndDate), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetOccurrenceCount = js.Any.fromFunction0(GetOccurrenceCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRange = js.Any.fromFunction0(GetRange), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEndDate = js.Any.fromFunction1(SetEndDate), SetHeight = js.Any.fromFunction1(SetHeight), SetOccurrenceCount = js.Any.fromFunction1(SetOccurrenceCount), SetRange = js.Any.fromFunction1(SetRange), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceRangeControl]
  }
  
  @scala.inline
  implicit class ASPxClientRecurrenceRangeControlMutableBuilder[Self <: ASPxClientRecurrenceRangeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEndDate(value: () => Date): Self = StObject.set(x, "GetEndDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOccurrenceCount(value: () => Double): Self = StObject.set(x, "GetOccurrenceCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: () => ASPxClientRecurrenceRange): Self = StObject.set(x, "GetRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEndDate(value: Date => Unit): Self = StObject.set(x, "SetEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOccurrenceCount(value: Double => Unit): Self = StObject.set(x, "SetOccurrenceCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRange(value: ASPxClientRecurrenceRange => Unit): Self = StObject.set(x, "SetRange", js.Any.fromFunction1(value))
  }
}
