package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRowEditing extends IEditing {
  /** [Config Option] (Boolean) */
  var autoCancel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var clicksToMoveEditor: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var errorSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		* @returns Boolean true if editing was started, false otherwise.
  		*/
  @JSName("startEdit")
  var startEdit_IRowEditing: js.UndefOr[
    js.Function2[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* columnHeader */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      scala.Boolean
    ]
  ] = js.undefined
}

