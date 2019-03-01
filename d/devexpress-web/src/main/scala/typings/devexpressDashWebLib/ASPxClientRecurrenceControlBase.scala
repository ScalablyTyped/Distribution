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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("CreateValueAccessor")(CreateValueAccessor)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Update")(Update)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientRecurrenceControlBase]
  }
}

