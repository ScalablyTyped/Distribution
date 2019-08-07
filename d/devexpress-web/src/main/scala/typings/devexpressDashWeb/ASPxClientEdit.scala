package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base object for all the editors that support validation.
  */
@JSGlobal("ASPxClientEdit")
@js.native
class ASPxClientEdit () extends ASPxClientEditBase {
  /**
    * Fires on the client side when the editor receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]] = js.native
  /**
    * Fires on the client side when the editor loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]] = js.native
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  var Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]] = js.native
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  var ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]] = js.native
  /**
    * Sets input focus to the editor.
    */
  def Focus(): Unit = js.native
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  def GetErrorText(): String = js.native
  /**
    * Returns an HTML element that represents the control's input element.
    */
  def GetInputElement(): js.Any = js.native
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  def GetIsValid(): Boolean = js.native
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  def GetReadOnly(): Boolean = js.native
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  def SetErrorText(errorText: String): Unit = js.native
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  def SetIsValid(isValid: Boolean): Unit = js.native
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  def SetReadOnly(readOnly: Boolean): Unit = js.native
  /**
    * Performs the editor's validation.
    */
  def Validate(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientEdit")
@js.native
object ASPxClientEdit extends js.Object {
  /**
    * Verifies whether the editors in a specified visibility state, which are located within a specified container and belong to a specific validation group, are valid. true if the editors are valid; otherwise, false.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param checkInvisibleEditors true to check both visible and invisible editors that belong to the specified container; false to check only visible editors.
    */
  def AreEditorsValid(): Boolean = js.native
  def AreEditorsValid(container: String): Boolean = js.native
  def AreEditorsValid(container: String, validationGroup: String): Boolean = js.native
  def AreEditorsValid(container: String, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = js.native
  def AreEditorsValid(container: js.Any): Boolean = js.native
  def AreEditorsValid(container: js.Any, validationGroup: String): Boolean = js.native
  def AreEditorsValid(container: js.Any, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Attaches a handler to the ASPxClientEdit's event indicating whether the editor has been changed since the previous state.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing the predicate criteria.
    */
  def AttachEditorModificationListener(handler: js.Any, predicate: ASPxClientControlPredicate): Unit = js.native
  /**
    * Assigns a null value to all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  def ClearEditorsInContainer(container: js.Any): Unit = js.native
  def ClearEditorsInContainer(container: js.Any, validationGroup: String): Unit = js.native
  def ClearEditorsInContainer(container: js.Any, validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Assigns a null value to all editors which are located within the specified container object, and belonging to a specific validation group, dependent on the visibility state specified.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value specifying the validatiion group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  def ClearEditorsInContainerById(containerId: String): Unit = js.native
  def ClearEditorsInContainerById(containerId: String, validationGroup: String): Unit = js.native
  def ClearEditorsInContainerById(containerId: String, validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Assigns a null value to all editors which belong to a specific validation group, dependent on the visibility state specified.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified validation group; false to clear only visible editors.
    */
  def ClearGroup(validationGroup: String): Unit = js.native
  def ClearGroup(validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Detaches a handler from the editor's event if the editor meets the predicate criteria.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing a predicate criteria.
    */
  def DetachEditorModificationListener(handler: js.Any, predicate: ASPxClientControlPredicate): Unit = js.native
  /**
    * Performs validation of all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group. true if the specified editors pass validation; otherwise, false.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  def ValidateEditorsInContainer(container: js.Any): Boolean = js.native
  def ValidateEditorsInContainer(container: js.Any, validationGroup: String): Boolean = js.native
  def ValidateEditorsInContainer(container: js.Any, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Performs validation of the editors which are located within the specified container and belong to a specific validation group, dependent on the visibility state specified. true if the specified editors pass validation; otherwise, false.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  def ValidateEditorsInContainerById(containerId: String): Boolean = js.native
  def ValidateEditorsInContainerById(containerId: String, validationGroup: String): Boolean = js.native
  def ValidateEditorsInContainerById(containerId: String, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Performs validation of editors contained within the specified validation group, dependent on the editor visibility state specified. true if editors of the specified validation group pass validation; otherwise, false.
    * @param validationGroup A string value specifying the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified validation group; false to validate only visible editors.
    */
  def ValidateGroup(validationGroup: String): Boolean = js.native
  def ValidateGroup(validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
}

