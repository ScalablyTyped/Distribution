package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base for client equivalents of recurrence controls available in the XtraScheduler library.
  */
trait ASPxClientRecurrenceControlBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns an object providing access to the ASPxClientRecurrenceControlBase control's editor values.
    */
  def CreateValueAccessor(): DefaultRecurrenceRuleValuesAccessor
  
  /**
    * Updates values of editors displayed by the ASPxClientRecurrenceControlBase control.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object containing new editor values.
    */
  def Update(recurrenceInfo: ASPxClientRecurrenceInfo): Unit
}
object ASPxClientRecurrenceControlBase {
  
  inline def apply(
    AdjustControl: () => Unit,
    CreateValueAccessor: () => DefaultRecurrenceRuleValuesAccessor,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Update: ASPxClientRecurrenceInfo => Unit,
    name: String
  ): ASPxClientRecurrenceControlBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CreateValueAccessor = js.Any.fromFunction0(CreateValueAccessor), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Update = js.Any.fromFunction1(Update), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceControlBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientRecurrenceControlBase] (val x: Self) extends AnyVal {
    
    inline def setCreateValueAccessor(value: () => DefaultRecurrenceRuleValuesAccessor): Self = StObject.set(x, "CreateValueAccessor", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: ASPxClientRecurrenceInfo => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction1(value))
  }
}
