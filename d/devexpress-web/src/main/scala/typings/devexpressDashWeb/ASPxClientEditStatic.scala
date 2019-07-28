package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientEditStatic extends ASPxClientControlStatic {
  /**
    * Verifies whether visible editors on a page are valid.
    */
  def AreEditorsValid(): Boolean = js.native
  /**
    * Verifies whether visible editors with the specified settings are valid.
    * @param containerId A string value that specifies the container's unique identifier.
    */
  def AreEditorsValid(containerId: String): Boolean = js.native
  /**
    * Verifies whether visible editors with the specified settings are valid.
    * @param containerId A string value that specifies the container's unique identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    */
  def AreEditorsValid(containerId: String, validationGroup: String): Boolean = js.native
  /**
    * Verifies whether the editors with the specified settings are valid.
    * @param containerId A string value that specifies the container's unique identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param checkInvisibleEditors true to check both visible and invisible editors that belong to the specified container; false to check only visible editors.
    */
  def AreEditorsValid(containerId: String, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Verifies whether visible editors located in a specified container are valid.
    * @param container An HTML element specifying the container of editors to be validated.
    */
  def AreEditorsValid(container: js.Object): Boolean = js.native
  /**
    * Verifies whether visible editors, which are located within a specified container and belong to a specific validation group, are valid.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    */
  def AreEditorsValid(container: js.Object, validationGroup: String): Boolean = js.native
  /**
    * Verifies whether the editors in a specified visibility state, which are located within a specified container and belong to a specific validation group, are valid.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param checkInvisibleEditors true to check both visible and invisible editors that belong to the specified container; false to check only visible editors.
    */
  def AreEditorsValid(container: js.Object, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Attaches a handler to the ASPxClientEdit's event indicating whether the editor has been changed since the previous state.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing the predicate criteria.
    */
  def AttachEditorModificationListener(handler: js.Object, predicate: ASPxClientControlPredicate): Unit = js.native
  /**
    * Assigns a null value to all visible editors located within a specified container.
    * @param container An HTML element specifying the container of editors to be validated.
    */
  def ClearEditorsInContainer(container: js.Object): Unit = js.native
  /**
    * Assigns a null value to all visible editors located within a specified container, and belonging to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value specifying the validation group's name.
    */
  def ClearEditorsInContainer(container: js.Object, validationGroup: String): Unit = js.native
  /**
    * Assigns a null value to all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  def ClearEditorsInContainer(container: js.Object, validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Assigns a null value to all visible editors that are located within the specified container object.
    * @param containerId A string value specifying the editor container's identifier.
    */
  def ClearEditorsInContainerById(containerId: String): Unit = js.native
  /**
    * Assigns a null value to all visible editors that are located within the specified container object, and belonging to a specific validation group.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value specifying the validatiion group's name.
    */
  def ClearEditorsInContainerById(containerId: String, validationGroup: String): Unit = js.native
  /**
    * Assigns a null value to all editors which are located within the specified container object, and belonging to a specific validation group, dependent on the visibility state specified.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value specifying the validatiion group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  def ClearEditorsInContainerById(containerId: String, validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Assigns a null value to all visible editors which belong to a specific validation group.
    * @param validationGroup A string value specifying the validation group's name.
    */
  def ClearGroup(validationGroup: String): Unit = js.native
  /**
    * Assigns a null value to all editors which belong to a specific validation group, dependent on the visibility state specified.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified validation group; false to clear only visible editors.
    */
  def ClearGroup(validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Detaches a handler from the editor's event if the editor meets the predicate criteria.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing a predicate criteria.
    */
  def DetachEditorModificationListener(handler: js.Object, predicate: ASPxClientControlPredicate): Unit = js.native
  /**
    * Performs validation of visible editors that are located within the specified container.
    * @param container An HTML element specifying the container of editors to be validated.
    */
  def ValidateEditorsInContainer(container: js.Object): Boolean = js.native
  /**
    * Performs validation of visible editors that are located within the specified container and belong to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    */
  def ValidateEditorsInContainer(container: js.Object, validationGroup: String): Boolean = js.native
  /**
    * Performs validation of all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  def ValidateEditorsInContainer(container: js.Object, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Performs validation of visible editors which are located within the specified container.
    * @param containerId A string value that specifies the container's unique identifier.
    */
  def ValidateEditorsInContainerById(containerId: String): Boolean = js.native
  /**
    * Performs validation of visible editors that are located within the specified container and belong to a specific validation group.
    * @param containerId A string value that specifies the container's unique identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    */
  def ValidateEditorsInContainerById(containerId: String, validationGroup: String): Boolean = js.native
  /**
    * Performs validation of the editors which are located within the specified container and belong to a specific validation group, dependent on the visibility state specified.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  def ValidateEditorsInContainerById(containerId: String, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Performs validation of visible editors contained within the specified validation group.
    * @param validationGroup A string value specifying the validation group's name.
    */
  def ValidateGroup(validationGroup: String): Boolean = js.native
  /**
    * Performs validation of editors contained within the specified validation group, dependent on the editor visibility state specified.
    * @param validationGroup A string value specifying the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified validation group; false to validate only visible editors.
    */
  def ValidateGroup(validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
}

