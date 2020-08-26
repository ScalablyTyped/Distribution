package typings.extjs.Ext.view

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IEventObject
import typings.extjs.Ext.data.IAbstractStore
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IAbstractView extends IComponent {
  /** [Method] Changes the data store bound to this view and refreshes it
    * @param store Ext.data.Store The store to bind to this view
    */
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
    * @param store Ext.data.AbstractStore The store to bind to
    */
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects all selected records  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
    * @param records Ext.data.Model[] An Array of Ext.data.Models to be rendered into the DataView.
    * @param startIndex Number the index number of the Record being prepared for rendering.
    * @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
    */
  var collectData: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var deferInitialRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects a record instance by record instance or index
    * @param records Ext.data.Model[]/Number An array of records or an index
    * @param suppressEvent Boolean Set to false to not fire a deselect event
    */
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.native
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one
    * @param node HTMLElement
    * @returns HTMLElement The template node
    */
  var findItemByChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], HTMLElement]] = js.native
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found
    * @param e Ext.EventObject
    */
  var findTargetByEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Gets a template node
    * @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the record associated with the node.
    * @returns HTMLElement The node or null if it wasn't found
    */
  var getNode: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], HTMLElement]] = js.native
  /** [Method] Gets a range nodes
    * @param start Number The index of the first node in the range
    * @param end Number The index of the last node in the range
    * @returns HTMLElement[] An array of nodes
    */
  var getNodes: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Gets a record from a node
    * @param node Ext.Element/HTMLElement The node to evaluate
    * @returns Ext.data.Model record The Ext.data.Model object
    */
  var getRecord: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Method] Gets an array of the records from an array of nodes
    * @param nodes HTMLElement[] The nodes to evaluate
    * @returns Ext.data.Model[] records The Ext.data.Model objects
    */
  var getRecords: js.UndefOr[js.Function1[/* nodes */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Gets the currently selected nodes
    * @returns HTMLElement[] An array of HTMLElements
    */
  var getSelectedNodes: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets an array of the selected records
    * @returns Ext.data.Model[] An array of Ext.data.Model objects
    */
  var getSelectedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets the number of selected nodes
    * @returns Number The node count
    */
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the selection model for this view
    * @returns Ext.selection.Model The selection model
    */
  var getSelectionModel: js.UndefOr[js.Function0[typings.extjs.Ext.selection.IModel]] = js.native
  /** [Method] Returns the store associated with this DataView
    * @returns Ext.data.Store The store
    */
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
    * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
    */
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Method] Finds the index of the passed node
    * @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or a record associated with a node.
    * @returns Number The index of the node or -1
    */
  var indexOf: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns true if the passed node is selected else false
    * @param node HTMLElement/Number/Ext.data.Model The node, node index or record to check
    * @returns Boolean True if selected, else false
    */
  var isSelected: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var itemSelector: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/Object) */
  var loadMask: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var loadingCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var loadingHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
    * @param store Object
    * @param initial Object
    * @param propName Object
    */
  var onBindStore: js.UndefOr[
    (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IAbstractView: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
    * @param store Object
    */
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.native
  /** [Config Option] (String) */
  var overItemCls: js.UndefOr[String] = js.native
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
    * @param data Object/Object[] The raw data object that was used to create the Record.
    * @param recordIndex Number the index number of the Record being prepared for rendering.
    * @param record Ext.data.Model The Record being prepared for rendering.
    * @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
    */
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* recordIndex */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      _
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var preserveScrollOnRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Refreshes an individual node s data from the store
    * @param index Number The item's data index in the store
    */
  var refreshNode: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Selects a record instance by record instance or index
    * @param records Ext.data.Model[]/Number An array of records or an index
    * @param keepExisting Boolean
    * @param suppressEvent Boolean Set to false to not fire a select event
    */
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var selectedItemCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
  /** [Method] Unbinds listeners from this component to the store
    * @param store Ext.data.AbstractStore The store to unbind from
    */
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IAbstractView {
  @scala.inline
  def apply(): IAbstractView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractView]
  }
  @scala.inline
  implicit class IAbstractViewOps[Self <: IAbstractView] (val x: Self) extends AnyVal {
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
    def setBindStore(value: js.UndefOr[js.Any | IStore] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("bindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStoreListeners: Self = this.set("bindStoreListeners", js.undefined)
    @scala.inline
    def setBlockRefresh(value: Boolean): Self = this.set("blockRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockRefresh: Self = this.set("blockRefresh", js.undefined)
    @scala.inline
    def setClearSelections(value: () => Unit): Self = this.set("clearSelections", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearSelections: Self = this.set("clearSelections", js.undefined)
    @scala.inline
    def setCollectData(value: (/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double]) => Array): Self = this.set("collectData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollectData: Self = this.set("collectData", js.undefined)
    @scala.inline
    def setDeferEmptyText(value: Boolean): Self = this.set("deferEmptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferEmptyText: Self = this.set("deferEmptyText", js.undefined)
    @scala.inline
    def setDeferInitialRefresh(value: Boolean): Self = this.set("deferInitialRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferInitialRefresh: Self = this.set("deferInitialRefresh", js.undefined)
    @scala.inline
    def setDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("deselect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeselect: Self = this.set("deselect", js.undefined)
    @scala.inline
    def setDisableSelection(value: Boolean): Self = this.set("disableSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSelection: Self = this.set("disableSelection", js.undefined)
    @scala.inline
    def setEmptyText(value: String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    @scala.inline
    def setFindItemByChild(value: /* node */ js.UndefOr[HTMLElement] => HTMLElement): Self = this.set("findItemByChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFindItemByChild: Self = this.set("findItemByChild", js.undefined)
    @scala.inline
    def setFindTargetByEvent(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("findTargetByEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFindTargetByEvent: Self = this.set("findTargetByEvent", js.undefined)
    @scala.inline
    def setGetNode(value: /* nodeInfo */ js.UndefOr[js.Any] => HTMLElement): Self = this.set("getNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNode: Self = this.set("getNode", js.undefined)
    @scala.inline
    def setGetNodes(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = this.set("getNodes", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetNodes: Self = this.set("getNodes", js.undefined)
    @scala.inline
    def setGetRecord(value: /* node */ js.UndefOr[js.Any] => IModel): Self = this.set("getRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRecord: Self = this.set("getRecord", js.undefined)
    @scala.inline
    def setGetRecords(value: /* nodes */ js.UndefOr[Array] => Array): Self = this.set("getRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRecords: Self = this.set("getRecords", js.undefined)
    @scala.inline
    def setGetSelectedNodes(value: () => Array): Self = this.set("getSelectedNodes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelectedNodes: Self = this.set("getSelectedNodes", js.undefined)
    @scala.inline
    def setGetSelectedRecords(value: () => Array): Self = this.set("getSelectedRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelectedRecords: Self = this.set("getSelectedRecords", js.undefined)
    @scala.inline
    def setGetSelectionCount(value: () => Double): Self = this.set("getSelectionCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelectionCount: Self = this.set("getSelectionCount", js.undefined)
    @scala.inline
    def setGetSelectionModel(value: () => typings.extjs.Ext.selection.IModel): Self = this.set("getSelectionModel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelectionModel: Self = this.set("getSelectionModel", js.undefined)
    @scala.inline
    def setGetStore(value: () => IAbstractStore | IStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = this.set("getStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStoreListenersFunction0(value: () => _): Self = this.set("getStoreListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = this.set("getStoreListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetStoreListeners: Self = this.set("getStoreListeners", js.undefined)
    @scala.inline
    def setIndexOf(value: /* nodeInfo */ js.UndefOr[js.Any] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    @scala.inline
    def setIsSelected(value: /* node */ js.UndefOr[js.Any] => Boolean): Self = this.set("isSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setItemCls(value: String): Self = this.set("itemCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCls: Self = this.set("itemCls", js.undefined)
    @scala.inline
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSelector: Self = this.set("itemSelector", js.undefined)
    @scala.inline
    def setItemTpl(value: js.Any): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    @scala.inline
    def setLoadMask(value: js.Any): Self = this.set("loadMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMask: Self = this.set("loadMask", js.undefined)
    @scala.inline
    def setLoadingCls(value: String): Self = this.set("loadingCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingCls: Self = this.set("loadingCls", js.undefined)
    @scala.inline
    def setLoadingHeight(value: Double): Self = this.set("loadingHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingHeight: Self = this.set("loadingHeight", js.undefined)
    @scala.inline
    def setLoadingText(value: String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setOnBindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = this.set("onBindStore", js.Any.fromFunction2(value))
    @scala.inline
    def setOnBindStoreFunction3(
      value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], /* propName */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onBindStore", js.Any.fromFunction3(value))
    @scala.inline
    def setOnBindStore(
      value: (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
          /* store */ js.UndefOr[js.Any], 
          /* initial */ js.UndefOr[js.Any], 
          /* propName */ js.UndefOr[js.Any], 
          Unit
        ])
    ): Self = this.set("onBindStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBindStore: Self = this.set("onBindStore", js.undefined)
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setOnUnbindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction2(value))
    @scala.inline
    def setOnUnbindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("onUnbindStore", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUnbindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
    ): Self = this.set("onUnbindStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnbindStore: Self = this.set("onUnbindStore", js.undefined)
    @scala.inline
    def setOverItemCls(value: String): Self = this.set("overItemCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverItemCls: Self = this.set("overItemCls", js.undefined)
    @scala.inline
    def setPrepareData(
      value: (/* data */ js.UndefOr[js.Any], /* recordIndex */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => _
    ): Self = this.set("prepareData", js.Any.fromFunction3(value))
    @scala.inline
    def deletePrepareData: Self = this.set("prepareData", js.undefined)
    @scala.inline
    def setPreserveScrollOnRefresh(value: Boolean): Self = this.set("preserveScrollOnRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveScrollOnRefresh: Self = this.set("preserveScrollOnRefresh", js.undefined)
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setRefreshNode(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("refreshNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshNode: Self = this.set("refreshNode", js.undefined)
    @scala.inline
    def setSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("select", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectedItemCls(value: String): Self = this.set("selectedItemCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemCls: Self = this.set("selectedItemCls", js.undefined)
    @scala.inline
    def setSimpleSelect(value: Boolean): Self = this.set("simpleSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleSelect: Self = this.set("simpleSelect", js.undefined)
    @scala.inline
    def setSingleSelect(value: Boolean): Self = this.set("singleSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleSelect: Self = this.set("singleSelect", js.undefined)
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setTrackOver(value: Boolean): Self = this.set("trackOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackOver: Self = this.set("trackOver", js.undefined)
    @scala.inline
    def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = this.set("unbindStoreListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnbindStoreListeners: Self = this.set("unbindStoreListeners", js.undefined)
  }
  
}

