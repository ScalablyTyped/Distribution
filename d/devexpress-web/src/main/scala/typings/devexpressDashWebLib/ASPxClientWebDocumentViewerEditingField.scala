package typings
package devexpressDashWebLib

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
  def editorName(): java.lang.String
  /**
       * Returns the ID of a logical group to which an editing field for a check box belongs.
       */
  def groupID(): java.lang.String
  /**
       * Returns the unique identifier of an editing field.
       */
  def id(): java.lang.String
  /**
       * Returns the index of the page on which an editing field is located.
       */
  def pageIndex(): scala.Double
}

