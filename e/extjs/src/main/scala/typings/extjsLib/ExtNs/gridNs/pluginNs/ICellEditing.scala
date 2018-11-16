package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICellEditing extends IEditing {
  /** [Method] Starts editing by position row column
  		* @param position Object A position with keys of row and column.
  		*/
  var startEditByPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record.
  		* @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
  		* @returns Boolean true if editing was started, false otherwise.
  		*/
  @JSName("startEdit")
  var startEdit_ICellEditing: js.UndefOr[
    js.Function2[
      /* record */ js.UndefOr[js.Any], 
      /* columnHeader */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
}

