package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality for a field whose content can be edited in the Web Document Viewer.
  */
trait ASPxClientWebDocumentViewerEditingField extends js.Object {
  /**
    * Provides access to the current value of an editing field.
    * Returns: An object that specifies the current field value.
    */
  var editValue: js.Any
  /**
    * Provides access to a value that specifies whether or not an editing field's content can be customized in Print Preview.
    * Returns: true, if a field cannot be edited in Print Preview; otherwise, false.
    */
  var readOnly: js.Any
  /**
    * Returns the name of an editor used to change a field value in Print Preview.
    */
  def editorName(): String
  /**
    * Returns the ID of a logical group to which an editing field for a check box belongs.
    */
  def groupID(): String
  /**
    * Returns the unique identifier of an editing field.
    */
  def id(): String
  /**
    * Returns the index of the page on which an editing field is located.
    */
  def pageIndex(): Double
}

object ASPxClientWebDocumentViewerEditingField {
  @scala.inline
  def apply(
    editValue: js.Any,
    editorName: () => String,
    groupID: () => String,
    id: () => String,
    pageIndex: () => Double,
    readOnly: js.Any
  ): ASPxClientWebDocumentViewerEditingField = {
    val __obj = js.Dynamic.literal(editValue = editValue, editorName = js.Any.fromFunction0(editorName), groupID = js.Any.fromFunction0(groupID), id = js.Any.fromFunction0(id), pageIndex = js.Any.fromFunction0(pageIndex), readOnly = readOnly)
  
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingField]
  }
}

