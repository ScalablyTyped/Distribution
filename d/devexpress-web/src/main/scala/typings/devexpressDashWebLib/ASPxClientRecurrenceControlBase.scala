package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base for client equivalents of recurrence controls available in the XtraScheduler library.
  */
trait ASPxClientRecurrenceControlBase extends ASPxClientControl {
  /**
    * Returns an object providing access to the ASPxClientRecurrenceControlBase control's editor values.
    */
  def CreateValueAccessor(): DefaultRecurrenceRuleValuesAccessor
  /**
    * Updates values of editors displayed by the ASPxClientRecurrenceControlBase control.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object containing new editor values.
    */
  def Update(recurrenceInfo: ASPxClientRecurrenceInfo): scala.Unit
}

object ASPxClientRecurrenceControlBase {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    CreateValueAccessor: js.Function0[DefaultRecurrenceRuleValuesAccessor],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Update: js.Function1[ASPxClientRecurrenceInfo, scala.Unit],
    name: java.lang.String
  ): ASPxClientRecurrenceControlBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, CreateValueAccessor = CreateValueAccessor, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, Update = Update, name = name)
  
    __obj.asInstanceOf[ASPxClientRecurrenceControlBase]
  }
}

