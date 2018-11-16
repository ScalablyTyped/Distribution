package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.gridNs.lockingNs.ILockable because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait ITable extends IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_ITable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_ITable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var columnLines: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.grid.column.Column[]/Object) */
  var columns: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var deferRowRender: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method is obsolete in 4 1  */
  var determineScrollbars: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnMove: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnResize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableLocking: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.grid.feature.Feature[]/Object[]/Ext.enums.Feature[]) */
  var features: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var forceFit: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the selection model being used and creates it via the configuration if it has not been created already
  		* @returns Ext.selection.Model selModel
  		*/
  var getSelectionModel: js.UndefOr[js.Function0[extjsLib.ExtNs.selectionNs.IModel]] = js.undefined
  /** [Method] Returns the store associated with this Panel
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IStore]] = js.undefined
  /** [Method] Gets the view for this panel
  		* @returns Ext.view.Table
  		*/
  var getView: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Property] (Boolean) */
  var hasView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var hideHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method is obsolete in 4 1  */
  var invalidateScroller: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var optimizedColumnMove: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var rowLines: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Boolean) */
  var scroll: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var sealedColumns: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.selection.Model/Object) */
  var selModel: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var selType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortableColumns: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[extjsLib.ExtNs.dataNs.IStore] = js.undefined
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var verticalScroller: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.view.Table) */
  var view: js.UndefOr[extjsLib.ExtNs.viewNs.ITable] = js.undefined
  /** [Config Option] (Object) */
  var viewConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var viewType: js.UndefOr[java.lang.String] = js.undefined
}

