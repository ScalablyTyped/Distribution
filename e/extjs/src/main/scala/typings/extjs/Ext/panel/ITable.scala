package typings.extjs.Ext.panel

import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.selection.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.grid.locking.ILockable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined lockedGridConfig, lockedViewConfig, normalGridConfig, normalViewConfig, scrollDelta, subGridXType, syncRowHeight, syncRowHeights */ trait ITable
  extends typings.extjs.Ext.panel.IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_ITable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_ITable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var columnLines: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.grid.column.Column[]/Object) */
  var columns: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var deferRowRender: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method is obsolete in 4 1  */
  var determineScrollbars: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnMove: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnResize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableLocking: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.grid.feature.Feature[]/Object[]/Ext.enums.Feature[]) */
  var features: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var forceFit: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the selection model being used and creates it via the configuration if it has not been created already
  		* @returns Ext.selection.Model selModel
  		*/
  var getSelectionModel: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns the store associated with this Panel
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IStore]] = js.undefined
  /** [Method] Gets the view for this panel
  		* @returns Ext.view.Table
  		*/
  var getView: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Property] (Boolean) */
  var hasView: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var hideHeaders: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method is obsolete in 4 1  */
  var invalidateScroller: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var optimizedColumnMove: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var rowLines: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Boolean) */
  var scroll: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var sealedColumns: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.selection.Model/Object) */
  var selModel: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var selType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortableColumns: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.undefined
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var verticalScroller: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.view.Table) */
  var view: js.UndefOr[typings.extjs.Ext.view.ITable] = js.undefined
  /** [Config Option] (Object) */
  var viewConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var viewType: js.UndefOr[java.lang.String] = js.undefined
}

object ITable {
  @scala.inline
  def apply(
    IPanel: typings.extjs.Ext.panel.IPanel = null,
    afterCollapse: () => Unit = null,
    afterExpand: () => Unit = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    columnLines: js.UndefOr[Boolean] = js.undefined,
    columns: js.Any = null,
    deferRowRender: js.UndefOr[Boolean] = js.undefined,
    determineScrollbars: () => Unit = null,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    emptyText: java.lang.String = null,
    enableColumnHide: js.UndefOr[Boolean] = js.undefined,
    enableColumnMove: js.UndefOr[Boolean] = js.undefined,
    enableColumnResize: js.UndefOr[Boolean] = js.undefined,
    enableLocking: js.UndefOr[Boolean] = js.undefined,
    features: js.Any = null,
    forceFit: js.UndefOr[Boolean] = js.undefined,
    getSelectionModel: () => IModel = null,
    getStore: () => IStore = null,
    getView: () => ITable = null,
    hasView: js.UndefOr[Boolean] = js.undefined,
    hideHeaders: js.UndefOr[Boolean] = js.undefined,
    invalidateScroller: () => Unit = null,
    lockedGridConfig: js.Any = null,
    lockedViewConfig: js.Any = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    normalGridConfig: js.Any = null,
    normalViewConfig: js.Any = null,
    optimizedColumnMove: js.UndefOr[Boolean] = js.undefined,
    rowLines: js.UndefOr[Boolean] = js.undefined,
    scroll: js.Any = null,
    scrollDelta: Int | Double = null,
    sealedColumns: js.UndefOr[Boolean] = js.undefined,
    selModel: js.Any = null,
    selType: java.lang.String = null,
    simpleSelect: js.UndefOr[Boolean] = js.undefined,
    sortableColumns: js.UndefOr[Boolean] = js.undefined,
    store: IStore = null,
    subGridXType: java.lang.String = null,
    syncRowHeight: js.UndefOr[Boolean] = js.undefined,
    syncRowHeights: () => Unit = null,
    verticalScroller: js.Any = null,
    view: typings.extjs.Ext.view.ITable = null,
    viewConfig: js.Any = null,
    viewType: java.lang.String = null
  ): ITable = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (afterCollapse != null) __obj.updateDynamic("afterCollapse")(js.Any.fromFunction0(afterCollapse))
    if (afterExpand != null) __obj.updateDynamic("afterExpand")(js.Any.fromFunction0(afterExpand))
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (!js.isUndefined(columnLines)) __obj.updateDynamic("columnLines")(columnLines.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRowRender)) __obj.updateDynamic("deferRowRender")(deferRowRender.asInstanceOf[js.Any])
    if (determineScrollbars != null) __obj.updateDynamic("determineScrollbars")(js.Any.fromFunction0(determineScrollbars))
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnHide)) __obj.updateDynamic("enableColumnHide")(enableColumnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnMove)) __obj.updateDynamic("enableColumnMove")(enableColumnMove.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResize)) __obj.updateDynamic("enableColumnResize")(enableColumnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLocking)) __obj.updateDynamic("enableLocking")(enableLocking.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFit)) __obj.updateDynamic("forceFit")(forceFit.asInstanceOf[js.Any])
    if (getSelectionModel != null) __obj.updateDynamic("getSelectionModel")(js.Any.fromFunction0(getSelectionModel))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getView != null) __obj.updateDynamic("getView")(js.Any.fromFunction0(getView))
    if (!js.isUndefined(hasView)) __obj.updateDynamic("hasView")(hasView.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeaders)) __obj.updateDynamic("hideHeaders")(hideHeaders.asInstanceOf[js.Any])
    if (invalidateScroller != null) __obj.updateDynamic("invalidateScroller")(js.Any.fromFunction0(invalidateScroller))
    if (lockedGridConfig != null) __obj.updateDynamic("lockedGridConfig")(lockedGridConfig.asInstanceOf[js.Any])
    if (lockedViewConfig != null) __obj.updateDynamic("lockedViewConfig")(lockedViewConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (normalGridConfig != null) __obj.updateDynamic("normalGridConfig")(normalGridConfig.asInstanceOf[js.Any])
    if (normalViewConfig != null) __obj.updateDynamic("normalViewConfig")(normalViewConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizedColumnMove)) __obj.updateDynamic("optimizedColumnMove")(optimizedColumnMove.asInstanceOf[js.Any])
    if (!js.isUndefined(rowLines)) __obj.updateDynamic("rowLines")(rowLines.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollDelta != null) __obj.updateDynamic("scrollDelta")(scrollDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(sealedColumns)) __obj.updateDynamic("sealedColumns")(sealedColumns.asInstanceOf[js.Any])
    if (selModel != null) __obj.updateDynamic("selModel")(selModel.asInstanceOf[js.Any])
    if (selType != null) __obj.updateDynamic("selType")(selType.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(sortableColumns)) __obj.updateDynamic("sortableColumns")(sortableColumns.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (subGridXType != null) __obj.updateDynamic("subGridXType")(subGridXType.asInstanceOf[js.Any])
    if (!js.isUndefined(syncRowHeight)) __obj.updateDynamic("syncRowHeight")(syncRowHeight.asInstanceOf[js.Any])
    if (syncRowHeights != null) __obj.updateDynamic("syncRowHeights")(js.Any.fromFunction0(syncRowHeights))
    if (verticalScroller != null) __obj.updateDynamic("verticalScroller")(verticalScroller.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewConfig != null) __obj.updateDynamic("viewConfig")(viewConfig.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITable]
  }
}

