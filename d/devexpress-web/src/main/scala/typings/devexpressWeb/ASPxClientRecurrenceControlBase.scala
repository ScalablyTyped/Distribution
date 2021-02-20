package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base for client equivalents of recurrence controls available in the XtraScheduler library.
  */
@js.native
trait ASPxClientRecurrenceControlBase extends ASPxClientControl {
  
  /**
    * Returns an object providing access to the ASPxClientRecurrenceControlBase control's editor values.
    */
  def CreateValueAccessor(): DefaultRecurrenceRuleValuesAccessor = js.native
  
  /**
    * Updates values of editors displayed by the ASPxClientRecurrenceControlBase control.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object containing new editor values.
    */
  def Update(recurrenceInfo: ASPxClientRecurrenceInfo): Unit = js.native
}
object ASPxClientRecurrenceControlBase {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    CreateValueAccessor: () => DefaultRecurrenceRuleValuesAccessor,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
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
  implicit class ASPxClientRecurrenceControlBaseMutableBuilder[Self <: ASPxClientRecurrenceControlBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateValueAccessor(value: () => DefaultRecurrenceRuleValuesAccessor): Self = StObject.set(x, "CreateValueAccessor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: ASPxClientRecurrenceInfo => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction1(value))
  }
}
