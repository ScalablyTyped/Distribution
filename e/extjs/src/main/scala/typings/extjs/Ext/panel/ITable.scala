package typings.extjs.Ext.panel

import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.selection.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.grid.locking.ILockable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined lockedGridConfig, lockedViewConfig, normalGridConfig, normalViewConfig, scrollDelta, subGridXType, syncRowHeight, syncRowHeights */ @js.native
trait ITable extends IPanel {
  
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_ITable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_ITable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var columnLines: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.grid.column.Column[]/Object) */
  var columns: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var deferRowRender: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method is obsolete in 4 1  */
  var determineScrollbars: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enableColumnMove: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enableColumnResize: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enableLocking: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.grid.feature.Feature[]/Object[]/Ext.enums.Feature[]) */
  var features: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var forceFit: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the selection model being used and creates it via the configuration if it has not been created already
    * @returns Ext.selection.Model selModel
    */
  var getSelectionModel: js.UndefOr[js.Function0[IModel]] = js.native
  
  /** [Method] Returns the store associated with this Panel
    * @returns Ext.data.Store The store
    */
  var getStore: js.UndefOr[js.Function0[IStore]] = js.native
  
  /** [Method] Gets the view for this panel
    * @returns Ext.view.Table
    */
  var getView: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Property] (Boolean) */
  var hasView: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var hideHeaders: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method is obsolete in 4 1  */
  var invalidateScroller: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var optimizedColumnMove: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var rowLines: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Boolean) */
  var scroll: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var sealedColumns: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.selection.Model/Object) */
  var selModel: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var selType: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var sortableColumns: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.native
  
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object) */
  var verticalScroller: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Ext.view.Table) */
  var view: js.UndefOr[typings.extjs.Ext.view.ITable] = js.native
  
  /** [Config Option] (Object) */
  var viewConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var viewType: js.UndefOr[String] = js.native
}
object ITable {
  
  @scala.inline
  def apply(): ITable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITable]
  }
  
  @scala.inline
  implicit class ITableOps[Self <: ITable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterCollapse(value: () => Unit): Self = this.set("afterCollapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterCollapse: Self = this.set("afterCollapse", js.undefined)
    
    @scala.inline
    def setAfterExpand(value: () => Unit): Self = this.set("afterExpand", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterExpand: Self = this.set("afterExpand", js.undefined)
    
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = this.set("allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeselect: Self = this.set("allowDeselect", js.undefined)
    
    @scala.inline
    def setColumnLines(value: Boolean): Self = this.set("columnLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLines: Self = this.set("columnLines", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDeferRowRender(value: Boolean): Self = this.set("deferRowRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferRowRender: Self = this.set("deferRowRender", js.undefined)
    
    @scala.inline
    def setDetermineScrollbars(value: () => Unit): Self = this.set("determineScrollbars", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDetermineScrollbars: Self = this.set("determineScrollbars", js.undefined)
    
    @scala.inline
    def setDisableSelection(value: Boolean): Self = this.set("disableSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSelection: Self = this.set("disableSelection", js.undefined)
    
    @scala.inline
    def setEmptyText(value: String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    
    @scala.inline
    def setEnableColumnHide(value: Boolean): Self = this.set("enableColumnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnHide: Self = this.set("enableColumnHide", js.undefined)
    
    @scala.inline
    def setEnableColumnMove(value: Boolean): Self = this.set("enableColumnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnMove: Self = this.set("enableColumnMove", js.undefined)
    
    @scala.inline
    def setEnableColumnResize(value: Boolean): Self = this.set("enableColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnResize: Self = this.set("enableColumnResize", js.undefined)
    
    @scala.inline
    def setEnableLocking(value: Boolean): Self = this.set("enableLocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLocking: Self = this.set("enableLocking", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Any): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setForceFit(value: Boolean): Self = this.set("forceFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFit: Self = this.set("forceFit", js.undefined)
    
    @scala.inline
    def setGetSelectionModel(value: () => IModel): Self = this.set("getSelectionModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectionModel: Self = this.set("getSelectionModel", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    
    @scala.inline
    def setGetView(value: () => ITable): Self = this.set("getView", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetView: Self = this.set("getView", js.undefined)
    
    @scala.inline
    def setHasView(value: Boolean): Self = this.set("hasView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasView: Self = this.set("hasView", js.undefined)
    
    @scala.inline
    def setHideHeaders(value: Boolean): Self = this.set("hideHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideHeaders: Self = this.set("hideHeaders", js.undefined)
    
    @scala.inline
    def setInvalidateScroller(value: () => Unit): Self = this.set("invalidateScroller", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInvalidateScroller: Self = this.set("invalidateScroller", js.undefined)
    
    @scala.inline
    def setLockedGridConfig(value: js.Any): Self = this.set("lockedGridConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedGridConfig: Self = this.set("lockedGridConfig", js.undefined)
    
    @scala.inline
    def setLockedViewConfig(value: js.Any): Self = this.set("lockedViewConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedViewConfig: Self = this.set("lockedViewConfig", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setNormalGridConfig(value: js.Any): Self = this.set("normalGridConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalGridConfig: Self = this.set("normalGridConfig", js.undefined)
    
    @scala.inline
    def setNormalViewConfig(value: js.Any): Self = this.set("normalViewConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalViewConfig: Self = this.set("normalViewConfig", js.undefined)
    
    @scala.inline
    def setOptimizedColumnMove(value: Boolean): Self = this.set("optimizedColumnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizedColumnMove: Self = this.set("optimizedColumnMove", js.undefined)
    
    @scala.inline
    def setRowLines(value: Boolean): Self = this.set("rowLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLines: Self = this.set("rowLines", js.undefined)
    
    @scala.inline
    def setScroll(value: js.Any): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollDelta(value: Double): Self = this.set("scrollDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDelta: Self = this.set("scrollDelta", js.undefined)
    
    @scala.inline
    def setSealedColumns(value: Boolean): Self = this.set("sealedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealedColumns: Self = this.set("sealedColumns", js.undefined)
    
    @scala.inline
    def setSelModel(value: js.Any): Self = this.set("selModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelModel: Self = this.set("selModel", js.undefined)
    
    @scala.inline
    def setSelType(value: String): Self = this.set("selType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelType: Self = this.set("selType", js.undefined)
    
    @scala.inline
    def setSimpleSelect(value: Boolean): Self = this.set("simpleSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleSelect: Self = this.set("simpleSelect", js.undefined)
    
    @scala.inline
    def setSortableColumns(value: Boolean): Self = this.set("sortableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortableColumns: Self = this.set("sortableColumns", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setSubGridXType(value: String): Self = this.set("subGridXType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubGridXType: Self = this.set("subGridXType", js.undefined)
    
    @scala.inline
    def setSyncRowHeight(value: Boolean): Self = this.set("syncRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncRowHeight: Self = this.set("syncRowHeight", js.undefined)
    
    @scala.inline
    def setSyncRowHeights(value: () => Unit): Self = this.set("syncRowHeights", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSyncRowHeights: Self = this.set("syncRowHeights", js.undefined)
    
    @scala.inline
    def setVerticalScroller(value: js.Any): Self = this.set("verticalScroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalScroller: Self = this.set("verticalScroller", js.undefined)
    
    @scala.inline
    def setView(value: typings.extjs.Ext.view.ITable): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewConfig(value: js.Any): Self = this.set("viewConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewConfig: Self = this.set("viewConfig", js.undefined)
    
    @scala.inline
    def setViewType(value: String): Self = this.set("viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
}
