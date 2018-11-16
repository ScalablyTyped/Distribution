package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRowEditor
  extends extjsLib.ExtNs.formNs.IPanel {
  /** [Method] Lie to the CQ system about our nesting structure  */
  @JSName("getRefItems")
  var getRefItems_IRowEditor: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Object
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  @JSName("loadRecord")
  var loadRecord_IRowEditor: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], extjsLib.ExtNs.formNs.IBasic]] = js.undefined
  /** [Method] Start editing the specified grid at the specified position
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* columnHeader */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      scala.Unit
    ]
  ] = js.undefined
}

