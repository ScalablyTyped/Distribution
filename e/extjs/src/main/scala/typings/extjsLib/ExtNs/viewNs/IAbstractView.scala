package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IAbstractView
  extends extjsLib.ExtNs.IComponent {
  /** [Method] Changes the data store bound to this view and refreshes it
  		* @param store Ext.data.Store The store to bind to this view
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | extjsLib.ExtNs.dataNs.IStore], scala.Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects all selected records  */
  var clearSelections: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
  		* @param records Ext.data.Model[] An Array of Ext.data.Models to be rendered into the DataView.
  		* @param startIndex Number the index number of the Record being prepared for rendering.
  		* @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
  		*/
  var collectData: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* startIndex */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var deferInitialRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean Set to false to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one
  		* @param node HTMLElement
  		* @returns HTMLElement The template node
  		*/
  var findItemByChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[stdLib.HTMLElement], stdLib.HTMLElement]] = js.undefined
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found
  		* @param e Ext.EventObject
  		*/
  var findTargetByEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit]] = js.undefined
  /** [Method] Gets a template node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the record associated with the node.
  		* @returns HTMLElement The node or null if it wasn't found
  		*/
  var getNode: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], stdLib.HTMLElement]] = js.undefined
  /** [Method] Gets a range nodes
  		* @param start Number The index of the first node in the range
  		* @param end Number The index of the last node in the range
  		* @returns HTMLElement[] An array of nodes
  		*/
  var getNodes: js.UndefOr[
    js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Gets a record from a node
  		* @param node Ext.Element/HTMLElement The node to evaluate
  		* @returns Ext.data.Model record The Ext.data.Model object
  		*/
  var getRecord: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IModel]] = js.undefined
  /** [Method] Gets an array of the records from an array of nodes
  		* @param nodes HTMLElement[] The nodes to evaluate
  		* @returns Ext.data.Model[] records The Ext.data.Model objects
  		*/
  var getRecords: js.UndefOr[js.Function1[/* nodes */ js.UndefOr[extjsLib.ExtNs.Array], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Gets the currently selected nodes
  		* @returns HTMLElement[] An array of HTMLElements
  		*/
  var getSelectedNodes: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Gets an array of the selected records
  		* @returns Ext.data.Model[] An array of Ext.data.Model objects
  		*/
  var getSelectedRecords: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Gets the number of selected nodes
  		* @returns Number The node count
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the selection model for this view
  		* @returns Ext.selection.Model The selection model
  		*/
  var getSelectionModel: js.UndefOr[js.Function0[extjsLib.ExtNs.selectionNs.IModel]] = js.undefined
  /** [Method] Returns the store associated with this DataView
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[
    js.Function0[extjsLib.ExtNs.dataNs.IAbstractStore | extjsLib.ExtNs.dataNs.IStore]
  ] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[
    js.Function0[_] | (js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], _])
  ] = js.undefined
  /** [Method] Finds the index of the passed node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or a record associated with a node.
  		* @returns Number The index of the node or -1
  		*/
  var indexOf: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Returns true if the passed node is selected else false
  		* @param node HTMLElement/Number/Ext.data.Model The node, node index or record to check
  		* @returns Boolean True if selected, else false
  		*/
  var isSelected: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var itemSelector: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var loadMask: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var loadingCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var loadingHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Object
  		* @param initial Object
  		* @param propName Object
  		*/
  var onBindStore: js.UndefOr[
    (js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]) | (js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      scala.Unit
    ])
  ] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IAbstractView: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]) | (js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], 
      /* initial */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ])
  ] = js.undefined
  /** [Config Option] (String) */
  var overItemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param recordIndex Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* recordIndex */ js.UndefOr[scala.Double], 
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var preserveScrollOnRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Refreshes an individual node s data from the store
  		* @param index Number The item's data index in the store
  		*/
  var refreshNode: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var selectedItemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[extjsLib.ExtNs.dataNs.IStore] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]] = js.undefined
}

object IAbstractView {
  @scala.inline
  def apply(
    IBindable: extjsLib.ExtNs.utilNs.IBindable = null,
    IComponent: extjsLib.ExtNs.IComponent = null,
    afterRender: () => scala.Unit = null,
    bindStore: /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore] => scala.Unit = null,
    bindStoreListeners: /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore] => scala.Unit = null,
    blockRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    clearSelections: () => scala.Unit = null,
    collectData: (/* records */ js.UndefOr[extjsLib.ExtNs.Array], /* startIndex */ js.UndefOr[scala.Double]) => extjsLib.ExtNs.Array = null,
    deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined,
    deferInitialRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    disableSelection: js.UndefOr[scala.Boolean] = js.undefined,
    emptyText: java.lang.String = null,
    findItemByChild: /* node */ js.UndefOr[stdLib.HTMLElement] => stdLib.HTMLElement = null,
    findTargetByEvent: /* e */ js.UndefOr[extjsLib.ExtNs.IEventObject] => scala.Unit = null,
    getNode: /* nodeInfo */ js.UndefOr[js.Any] => stdLib.HTMLElement = null,
    getNodes: (/* start */ js.UndefOr[scala.Double], /* end */ js.UndefOr[scala.Double]) => extjsLib.ExtNs.Array = null,
    getRecord: /* node */ js.UndefOr[js.Any] => extjsLib.ExtNs.dataNs.IModel = null,
    getRecords: /* nodes */ js.UndefOr[extjsLib.ExtNs.Array] => extjsLib.ExtNs.Array = null,
    getSelectedNodes: () => extjsLib.ExtNs.Array = null,
    getSelectedRecords: () => extjsLib.ExtNs.Array = null,
    getSelectionCount: () => scala.Double = null,
    getSelectionModel: () => extjsLib.ExtNs.selectionNs.IModel = null,
    getStore: () => extjsLib.ExtNs.dataNs.IStore = null,
    getStoreListeners: () => _ = null,
    indexOf: /* nodeInfo */ js.UndefOr[js.Any] => scala.Double = null,
    initComponent: () => scala.Unit = null,
    isSelected: /* node */ js.UndefOr[js.Any] => scala.Boolean = null,
    itemCls: java.lang.String = null,
    itemSelector: java.lang.String = null,
    itemTpl: js.Any = null,
    loadMask: js.Any = null,
    loadingCls: java.lang.String = null,
    loadingHeight: scala.Int | scala.Double = null,
    loadingText: java.lang.String = null,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    onBindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], /* propName */ js.UndefOr[js.Any]) => scala.Unit = null,
    onDestroy: () => scala.Unit = null,
    onRender: () => scala.Unit = null,
    onUnbindStore: /* store */ js.UndefOr[js.Any] => scala.Unit = null,
    overItemCls: java.lang.String = null,
    prepareData: (/* data */ js.UndefOr[js.Any], /* recordIndex */ js.UndefOr[scala.Double], /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel]) => _ = null,
    preserveScrollOnRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: () => scala.Unit = null,
    refreshNode: /* index */ js.UndefOr[scala.Double] => scala.Unit = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[scala.Boolean], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    selectedItemCls: java.lang.String = null,
    simpleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    singleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    store: extjsLib.ExtNs.dataNs.IStore = null,
    tpl: js.Any = null,
    trackOver: js.UndefOr[scala.Boolean] = js.undefined,
    unbindStoreListeners: /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore] => scala.Unit = null
  ): IAbstractView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBindable)
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh)
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(js.Any.fromFunction0(clearSelections))
    if (collectData != null) __obj.updateDynamic("collectData")(js.Any.fromFunction2(collectData))
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText)
    if (!js.isUndefined(deferInitialRefresh)) __obj.updateDynamic("deferInitialRefresh")(deferInitialRefresh)
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText)
    if (findItemByChild != null) __obj.updateDynamic("findItemByChild")(js.Any.fromFunction1(findItemByChild))
    if (findTargetByEvent != null) __obj.updateDynamic("findTargetByEvent")(js.Any.fromFunction1(findTargetByEvent))
    if (getNode != null) __obj.updateDynamic("getNode")(js.Any.fromFunction1(getNode))
    if (getNodes != null) __obj.updateDynamic("getNodes")(js.Any.fromFunction2(getNodes))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction1(getRecord))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction1(getRecords))
    if (getSelectedNodes != null) __obj.updateDynamic("getSelectedNodes")(js.Any.fromFunction0(getSelectedNodes))
    if (getSelectedRecords != null) __obj.updateDynamic("getSelectedRecords")(js.Any.fromFunction0(getSelectedRecords))
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(js.Any.fromFunction0(getSelectionCount))
    if (getSelectionModel != null) __obj.updateDynamic("getSelectionModel")(js.Any.fromFunction0(getSelectionModel))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (loadMask != null) __obj.updateDynamic("loadMask")(loadMask)
    if (loadingCls != null) __obj.updateDynamic("loadingCls")(loadingCls)
    if (loadingHeight != null) __obj.updateDynamic("loadingHeight")(loadingHeight.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction3(onBindStore))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction1(onUnbindStore))
    if (overItemCls != null) __obj.updateDynamic("overItemCls")(overItemCls)
    if (prepareData != null) __obj.updateDynamic("prepareData")(js.Any.fromFunction3(prepareData))
    if (!js.isUndefined(preserveScrollOnRefresh)) __obj.updateDynamic("preserveScrollOnRefresh")(preserveScrollOnRefresh)
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction0(refresh))
    if (refreshNode != null) __obj.updateDynamic("refreshNode")(js.Any.fromFunction1(refreshNode))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectedItemCls != null) __obj.updateDynamic("selectedItemCls")(selectedItemCls)
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect)
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect)
    if (store != null) __obj.updateDynamic("store")(store)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver)
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    __obj.asInstanceOf[IAbstractView]
  }
}

