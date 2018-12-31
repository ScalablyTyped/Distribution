package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable insert action in the editing mode.
    * @Default {false}
    */
  var allowAdding: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the delete action in the editing mode.
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the editing action while double click on the record
    * @Default {true}
    */
  var allowEditOnDblClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the edit action in the editing mode.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Dialog Box
    * @Default {null}
    */
  var dialogEditorTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the mode of editing See editMode
    * @Default {ej.Grid.EditMode.Normal}
    */
  var editMode: js.UndefOr[EditMode | java.lang.String] = js.undefined
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the External edit form
    * @Default {null}
    */
  var externalFormTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** This specifies to set the position of an External edit form either in the top-right or bottom-left of the grid. See formPosition
    * @Default {ej.Grid.FormPosition.BottomLeft}
    */
  var formPosition: js.UndefOr[FormPosition | java.lang.String] = js.undefined
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Inline edit form
    * @Default {null}
    */
  var inlineFormTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** This specifies to set the position of an adding new row either in the top or bottom of the grid. See rowPosition
    * @Default {ej.Grid.RowPosition.Top}
    */
  var rowPosition: js.UndefOr[RowPosition | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to display the add new form by default in the grid.
    * @Default {false}
    */
  var showAddNewRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while saving or discarding the batch changes
    * @Default {true}
    */
  var showConfirmDialog: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while deleting record
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the title for edit form is different from the primarykey column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[java.lang.String] = js.undefined
}

