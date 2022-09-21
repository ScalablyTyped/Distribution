package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientControlPredicate
import typings.devexpressWeb.ASPxClientEditValidationEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientProcessingModeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base object for all the editors that support validation.
  */
@JSGlobal("ASPxClientEdit")
@js.native
open class ASPxClientEdit ()
  extends StObject
     with typings.devexpressWeb.ASPxClientEdit {
  
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
    * Returns an HTML element that is the control's input element.
    */
  /* CompleteClass */
  override def GetInputElement(): Any = js.native
  
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  /* CompleteClass */
  override def GetIsValid(): Boolean = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  
  /**
    * Returns the editor's value.
    */
  /* CompleteClass */
  override def GetValue(): Any = js.native
  
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
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  /* CompleteClass */
  override def SetValue(value: Any): Unit = js.native
  
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
object ASPxClientEdit {
  
  @JSGlobal("ASPxClientEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Verifies whether the editors in a specified visibility state, which are located within a specified container and belong to a specific validation group, are valid. true if the editors are valid; otherwise, false.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param checkInvisibleEditors true to check both visible and invisible editors that belong to the specified container; false to check only visible editors.
    */
  /* static member */
  inline def AreEditorsValid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")().asInstanceOf[Boolean]
  inline def AreEditorsValid(container: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: String, validationGroup: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: String, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], checkInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: String, validationGroup: Unit, checkInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], checkInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Any, validationGroup: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Any, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], checkInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Any, validationGroup: Unit, checkInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], checkInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Unit, validationGroup: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Unit, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], checkInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def AreEditorsValid(container: Unit, validationGroup: Unit, checkInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEditorsValid")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], checkInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Attaches a handler to the ASPxClientEdit's event indicating whether the editor has been changed since the previous state.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing the predicate criteria.
    */
  /* static member */
  inline def AttachEditorModificationListener(handler: Any, predicate: ASPxClientControlPredicate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AttachEditorModificationListener")(handler.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assigns a null value to all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  /* static member */
  inline def ClearEditorsInContainer(container: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainer")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ClearEditorsInContainer(container: Any, validationGroup: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainer")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ClearEditorsInContainer(container: Any, validationGroup: String, clearInvisibleEditors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainer")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], clearInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ClearEditorsInContainer(container: Any, validationGroup: Unit, clearInvisibleEditors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainer")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], clearInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assigns a null value to all editors which are located within the specified container object, and belonging to a specific validation group, dependent on the visibility state specified.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value specifying the validatiion group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  /* static member */
  inline def ClearEditorsInContainerById(containerId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainerById")(containerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ClearEditorsInContainerById(containerId: String, validationGroup: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainerById")(containerId.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ClearEditorsInContainerById(containerId: String, validationGroup: String, clearInvisibleEditors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainerById")(containerId.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], clearInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ClearEditorsInContainerById(containerId: String, validationGroup: Unit, clearInvisibleEditors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearEditorsInContainerById")(containerId.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], clearInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Assigns a null value to all editors which belong to a specific validation group, dependent on the visibility state specified.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified validation group; false to clear only visible editors.
    */
  /* static member */
  inline def ClearGroup(validationGroup: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearGroup")(validationGroup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ClearGroup(validationGroup: String, clearInvisibleEditors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClearGroup")(validationGroup.asInstanceOf[js.Any], clearInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Detaches a handler from the editor's event if the editor meets the predicate criteria.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing a predicate criteria.
    */
  /* static member */
  inline def DetachEditorModificationListener(handler: Any, predicate: ASPxClientControlPredicate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DetachEditorModificationListener")(handler.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Validates all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group. true if the specified editors pass validation; otherwise, false.
    * @param container An HTML element that contains editors.
    * @param validationGroup The validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  /* static member */
  inline def ValidateEditorsInContainer(container: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainer")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ValidateEditorsInContainer(container: Any, validationGroup: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainer")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ValidateEditorsInContainer(container: Any, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainer")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ValidateEditorsInContainer(container: Any, validationGroup: Unit, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainer")(container.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Performs validation of the editors which are located within the specified container and belong to a specific validation group, dependent on the visibility state specified. true if the specified editors pass validation; otherwise, false.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  /* static member */
  inline def ValidateEditorsInContainerById(containerId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainerById")(containerId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ValidateEditorsInContainerById(containerId: String, validationGroup: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainerById")(containerId.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ValidateEditorsInContainerById(containerId: String, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainerById")(containerId.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ValidateEditorsInContainerById(containerId: String, validationGroup: Unit, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateEditorsInContainerById")(containerId.asInstanceOf[js.Any], validationGroup.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Performs validation of editors contained within the specified validation group, dependent on the editor visibility state specified. true if editors of the specified validation group pass validation; otherwise, false.
    * @param validationGroup A string value specifying the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified validation group; false to validate only visible editors.
    */
  /* static member */
  inline def ValidateGroup(validationGroup: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateGroup")(validationGroup.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ValidateGroup(validationGroup: String, validateInvisibleEditors: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateGroup")(validationGroup.asInstanceOf[js.Any], validateInvisibleEditors.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
