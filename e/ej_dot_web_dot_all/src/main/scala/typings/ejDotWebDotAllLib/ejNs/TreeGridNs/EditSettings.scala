package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditSettings extends js.Object {
  /** Enables or disables the button to add new row in context menu as well as in toolbar.
               * @Default {true}
               */
  var allowAdding: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the button to delete the selected row in context menu as well as in toolbar.
               * @Default {true}
               */
  var allowDeleting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to edit a row or cell.
               * @Default {false}
               */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** specifies the batch edit mode in TreeGrid.
               */
  var batchEditSettings: js.UndefOr[EditSettingsBatchEditSettings] = js.undefined
  /** Specifies the mouse action whether single click or double click to begin the editing
               * @Default {ej.TreeGrid.BeginEditAction.DblClick}
               */
  var beginEditAction: js.UndefOr[BeginEditAction | java.lang.String] = js.undefined
  /** Specifies the template ID for the custom dialog.
               * @Default {null}
               */
  var dialogEditorTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** specifies the edit mode in TreeGrid , &quot;cellEditing&quot; is for cell type editing and &quot;rowEditing&quot; is for entire row.
               * @Default {ej.TreeGrid.EditMode.CellEditing}
               */
  var editMode: js.UndefOr[EditMode | java.lang.String] = js.undefined
  /** Specifies the position where the new row has to be added.
               * @Default {ej.TreeGrid.RowPosition.Top}
               */
  var rowPosition: js.UndefOr[RowPosition | java.lang.String] = js.undefined
  /** Enable or disable the confirmation dialog while deleting the record.
               * @Default {false}
               */
  var showDeleteConfirmDialog: js.UndefOr[scala.Boolean] = js.undefined
}

