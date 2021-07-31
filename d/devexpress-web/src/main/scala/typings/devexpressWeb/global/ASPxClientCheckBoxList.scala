package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEditValidationEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientListEditItemSelectedChangedEventHandler
import typings.devexpressWeb.ASPxClientProcessingModeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxCheckBoxList object.
  */
@JSGlobal("ASPxClientCheckBoxList")
@js.native
class ASPxClientCheckBoxList ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCheckBoxList {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Sets input focus to the editor.
    */
  /* CompleteClass */
  override def Focus(): Unit = js.native
  
  /**
    * Returns the text displayed in the editor caption.
    */
  /* CompleteClass */
  override def GetCaption(): String = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  /* CompleteClass */
  override def GetErrorText(): String = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that represents the control's input element.
    */
  /* CompleteClass */
  override def GetInputElement(): js.Any = js.native
  
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  /* CompleteClass */
  override def GetIsValid(): Boolean = js.native
  
  /**
    * Returns the editor's item specified by its index. An ASPxClientListEditItem object that is the item located at the specified index.
    * @param index An integer value specifying the zero-based index of the item to be retrieved.
    */
  /* CompleteClass */
  override def GetItem(index: Double): typings.devexpressWeb.ASPxClientListEditItem = js.native
  
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  /* CompleteClass */
  override def GetItemCount(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  
  /**
    * Returns the index of the selected item within the list editor.
    */
  /* CompleteClass */
  override def GetSelectedIndex(): Double = js.native
  
  /**
    * Returns an array of the check box list editor's selected items indices.
    */
  /* CompleteClass */
  override def GetSelectedIndices(): js.Array[Double] = js.native
  
  /**
    * Returns the list editor's selected item.
    */
  /* CompleteClass */
  override def GetSelectedItem(): typings.devexpressWeb.ASPxClientListEditItem = js.native
  
  /**
    * Returns an array of the check box list editor's selected items.
    */
  /* CompleteClass */
  override def GetSelectedItems(): js.Array[typings.devexpressWeb.ASPxClientListEditItem] = js.native
  
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  /* CompleteClass */
  override def GetSelectedValues(): js.Array[js.Any] = js.native
  
  /**
    * Returns the editor's value.
    */
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Fires on the client side when the editor receives input focus.
    */
  /* CompleteClass */
  var GotFocus: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Fires on the client side when the editor loses input focus.
    */
  /* CompleteClass */
  var LostFocus: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Selects all check box list items.
    */
  /* CompleteClass */
  override def SelectAll(): Unit = js.native
  
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  /* CompleteClass */
  override def SelectIndices(indices: js.Array[Double]): Unit = js.native
  
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  /* CompleteClass */
  override def SelectItems(items: js.Array[typings.devexpressWeb.ASPxClientListEditItem]): Unit = js.native
  
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  /* CompleteClass */
  override def SelectValues(values: js.Array[js.Any]): Unit = js.native
  
  /**
    * Occurs on the client side after a different item in the list has been selected (focus has been moved from one item to another).
    */
  /* CompleteClass */
  var SelectedIndexChanged: typings.devexpressWeb.ASPxClientEvent[ASPxClientProcessingModeEventHandler[typings.devexpressWeb.ASPxClientListEdit]] = js.native
  /**
    * Occurs on the client side after a different item in the check box list has been selected (focus has been moved from one item to another).
    */
  /* CompleteClass */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientCheckBoxList: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientListEditItemSelectedChangedEventHandler[typings.devexpressWeb.ASPxClientCheckBoxList]
  ] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  /* CompleteClass */
  override def SetCaption(caption: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  /* CompleteClass */
  override def SetErrorText(errorText: String): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  /* CompleteClass */
  override def SetIsValid(isValid: Boolean): Unit = js.native
  
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  /* CompleteClass */
  override def SetReadOnly(readOnly: Boolean): Unit = js.native
  
  /**
    * Sets the list editor's selected item specified by its index.
    * @param index An integer value specifying the zero-based index of the item to select.
    */
  /* CompleteClass */
  override def SetSelectedIndex(index: Double): Unit = js.native
  
  /**
    * Sets the list editor's selected item.
    * @param item An ASPxClientListEditItem object that specifies the item to select.
    */
  /* CompleteClass */
  override def SetSelectedItem(item: typings.devexpressWeb.ASPxClientListEditItem): Unit = js.native
  
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  /* CompleteClass */
  override def SetValue(value: js.Any): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Unselects all check box list items.
    */
  /* CompleteClass */
  override def UnselectAll(): Unit = js.native
  
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  /* CompleteClass */
  override def UnselectIndices(indices: js.Array[Double]): Unit = js.native
  
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  /* CompleteClass */
  override def UnselectItems(items: js.Array[typings.devexpressWeb.ASPxClientListEditItem]): Unit = js.native
  
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  /* CompleteClass */
  override def UnselectValues(values: js.Array[js.Any]): Unit = js.native
  
  /**
    * Performs the editor's validation.
    */
  /* CompleteClass */
  override def Validate(): Unit = js.native
  
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  /* CompleteClass */
  var Validation: typings.devexpressWeb.ASPxClientEvent[ASPxClientEditValidationEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  /* CompleteClass */
  var ValueChanged: typings.devexpressWeb.ASPxClientEvent[ASPxClientProcessingModeEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object ASPxClientCheckBoxList {
  
  @JSGlobal("ASPxClientCheckBoxList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientCheckBoxList type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  @scala.inline
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientCheckBoxList = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.ASPxClientCheckBoxList]
}
