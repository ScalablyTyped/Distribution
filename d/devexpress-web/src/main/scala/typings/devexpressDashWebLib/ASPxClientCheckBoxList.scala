package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxCheckBoxList object.
  */
trait ASPxClientCheckBoxList extends ASPxClientCheckListBase {
  /**
    * Occurs on the client side after a different item in the check box list has been selected (focus has been moved from one item to another).
    */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientCheckBoxList: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]]
  /**
    * Returns an array of the check box list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[scala.Double]
  /**
    * Returns an array of the check box list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem]
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[js.Object]
  /**
    * Selects all check box list items.
    */
  def SelectAll(): scala.Unit
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def SelectIndices(indices: js.Array[scala.Double]): scala.Unit
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def SelectValues(values: js.Array[js.Object]): scala.Unit
  /**
    * Unselects all check box list items.
    */
  def UnselectAll(): scala.Unit
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def UnselectIndices(indices: js.Array[scala.Double]): scala.Unit
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def UnselectValues(values: js.Array[js.Object]): scala.Unit
}

object ASPxClientCheckBoxList {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Focus: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetErrorText: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetInputElement: js.Function0[js.Object],
    GetIsValid: js.Function0[scala.Boolean],
    GetItem: js.Function1[scala.Double, ASPxClientListEditItem],
    GetItemCount: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetReadOnly: js.Function0[scala.Boolean],
    GetSelectedIndex: js.Function0[scala.Double],
    GetSelectedIndices: js.Function0[js.Array[scala.Double]],
    GetSelectedItem: js.Function0[ASPxClientListEditItem],
    GetSelectedItems: js.Function0[js.Array[ASPxClientListEditItem]],
    GetSelectedValues: js.Function0[js.Array[js.Object]],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: js.Function0[scala.Unit],
    SelectIndices: js.Function1[js.Array[scala.Double], scala.Unit],
    SelectItems: js.Function1[js.Array[ASPxClientListEditItem], scala.Unit],
    SelectValues: js.Function1[js.Array[js.Object], scala.Unit],
    SelectedIndexChanged: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetSelectedIndex: js.Function1[scala.Double, scala.Unit],
    SetSelectedItem: js.Function1[ASPxClientListEditItem, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    UnselectAll: js.Function0[scala.Unit],
    UnselectIndices: js.Function1[js.Array[scala.Double], scala.Unit],
    UnselectItems: js.Function1[js.Array[ASPxClientListEditItem], scala.Unit],
    UnselectValues: js.Function1[js.Array[js.Object], scala.Unit],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientCheckBoxList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetErrorText")(GetErrorText)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInputElement")(GetInputElement)
    __obj.updateDynamic("GetIsValid")(GetIsValid)
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetReadOnly")(GetReadOnly)
    __obj.updateDynamic("GetSelectedIndex")(GetSelectedIndex)
    __obj.updateDynamic("GetSelectedIndices")(GetSelectedIndices)
    __obj.updateDynamic("GetSelectedItem")(GetSelectedItem)
    __obj.updateDynamic("GetSelectedItems")(GetSelectedItems)
    __obj.updateDynamic("GetSelectedValues")(GetSelectedValues)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("GotFocus")(GotFocus)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("LostFocus")(LostFocus)
    __obj.updateDynamic("SelectAll")(SelectAll)
    __obj.updateDynamic("SelectIndices")(SelectIndices)
    __obj.updateDynamic("SelectItems")(SelectItems)
    __obj.updateDynamic("SelectValues")(SelectValues)
    __obj.updateDynamic("SelectedIndexChanged")(SelectedIndexChanged)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetErrorText")(SetErrorText)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetIsValid")(SetIsValid)
    __obj.updateDynamic("SetReadOnly")(SetReadOnly)
    __obj.updateDynamic("SetSelectedIndex")(SetSelectedIndex)
    __obj.updateDynamic("SetSelectedItem")(SetSelectedItem)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("UnselectAll")(UnselectAll)
    __obj.updateDynamic("UnselectIndices")(UnselectIndices)
    __obj.updateDynamic("UnselectItems")(UnselectItems)
    __obj.updateDynamic("UnselectValues")(UnselectValues)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValueChanged")(ValueChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientCheckBoxList]
  }
}

