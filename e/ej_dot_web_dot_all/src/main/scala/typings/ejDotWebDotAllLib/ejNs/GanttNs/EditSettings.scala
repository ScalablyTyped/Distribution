package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditSettings extends js.Object {
  /** Enables or disables add record icon in Gantt toolbar
               * @Default {false}
               */
  var allowAdding: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables delete icon in Gantt toolbar
               * @Default {false}
               */
  var allowDeleting: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the option for enabling or disabling editing in Gantt grid part
               * @Default {false}
               */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the option for enabling or disabling indent action in Gantt.
               * @Default {false}
               */
  var allowIndent: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the mouse action whether single click or double click to begin the editing
               * @Default {ej.Gantt.BeginEditAction.DblClick}
               */
  var beginEditAction: js.UndefOr[BeginEditAction | java.lang.String] = js.undefined
  /** Specifies the edit mode in Gantt, &quot;normal&quot; is for dialog editing ,&quot;cellEditing&quot; is for cell type editing
               * @Default {normal}
               */
  var editMode: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the position where the new row has to be added.
               * @Default {ej.Gantt.RowPosition.BelowSelectedRow}
               */
  var rowPosition: js.UndefOr[RowPosition | java.lang.String] = js.undefined
  /** Enable or disable the confirmation dialog while deleting the record.
               * @Default {false}
               */
  var showDeleteConfirmDialog: js.UndefOr[scala.Boolean] = js.undefined
}

