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
  var bindStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[js.Any | extjsLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
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
  var unbindStoreListeners: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit]
  ] = js.undefined
}

object IAbstractView {
  @scala.inline
  def apply(
    IBindable: extjsLib.ExtNs.utilNs.IBindable = null,
    IComponent: extjsLib.ExtNs.IComponent = null,
    afterRender: js.Function0[scala.Unit] = null,
    bindStore: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    bindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null,
    blockRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    clearSelections: js.Function0[scala.Unit] = null,
    collectData: js.Function2[
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* startIndex */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ] = null,
    deferEmptyText: js.UndefOr[scala.Boolean] = js.undefined,
    deferInitialRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    deselect: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    disableSelection: js.UndefOr[scala.Boolean] = js.undefined,
    emptyText: java.lang.String = null,
    findItemByChild: js.Function1[/* node */ js.UndefOr[stdLib.HTMLElement], stdLib.HTMLElement] = null,
    findTargetByEvent: js.Function1[/* e */ js.UndefOr[extjsLib.ExtNs.IEventObject], scala.Unit] = null,
    getNode: js.Function1[/* nodeInfo */ js.UndefOr[js.Any], stdLib.HTMLElement] = null,
    getNodes: js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ] = null,
    getRecord: js.Function1[/* node */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IModel] = null,
    getRecords: js.Function1[/* nodes */ js.UndefOr[extjsLib.ExtNs.Array], extjsLib.ExtNs.Array] = null,
    getSelectedNodes: js.Function0[extjsLib.ExtNs.Array] = null,
    getSelectedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getSelectionCount: js.Function0[scala.Double] = null,
    getSelectionModel: js.Function0[extjsLib.ExtNs.selectionNs.IModel] = null,
    getStore: js.Function0[extjsLib.ExtNs.dataNs.IStore] = null,
    getStoreListeners: js.Function0[_] = null,
    indexOf: js.Function1[/* nodeInfo */ js.UndefOr[js.Any], scala.Double] = null,
    initComponent: js.Function0[scala.Unit] = null,
    isSelected: js.Function1[/* node */ js.UndefOr[js.Any], scala.Boolean] = null,
    itemCls: java.lang.String = null,
    itemSelector: java.lang.String = null,
    itemTpl: js.Any = null,
    loadMask: js.Any = null,
    loadingCls: java.lang.String = null,
    loadingHeight: scala.Int | scala.Double = null,
    loadingText: java.lang.String = null,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    onBindStore: js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onDestroy: js.Function0[scala.Unit] = null,
    onRender: js.Function0[scala.Unit] = null,
    onUnbindStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    overItemCls: java.lang.String = null,
    prepareData: js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* recordIndex */ js.UndefOr[scala.Double], 
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      _
    ] = null,
    preserveScrollOnRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.Function0[scala.Unit] = null,
    refreshNode: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit] = null,
    select: js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    selectedItemCls: java.lang.String = null,
    simpleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    singleSelect: js.UndefOr[scala.Boolean] = js.undefined,
    store: extjsLib.ExtNs.dataNs.IStore = null,
    tpl: js.Any = null,
    trackOver: js.UndefOr[scala.Boolean] = js.undefined,
    unbindStoreListeners: js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], scala.Unit] = null
  ): IAbstractView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBindable)
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(bindStoreListeners)
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh)
    if (clearSelections != null) __obj.updateDynamic("clearSelections")(clearSelections)
    if (collectData != null) __obj.updateDynamic("collectData")(collectData)
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText)
    if (!js.isUndefined(deferInitialRefresh)) __obj.updateDynamic("deferInitialRefresh")(deferInitialRefresh)
    if (deselect != null) __obj.updateDynamic("deselect")(deselect)
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection)
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText)
    if (findItemByChild != null) __obj.updateDynamic("findItemByChild")(findItemByChild)
    if (findTargetByEvent != null) __obj.updateDynamic("findTargetByEvent")(findTargetByEvent)
    if (getNode != null) __obj.updateDynamic("getNode")(getNode)
    if (getNodes != null) __obj.updateDynamic("getNodes")(getNodes)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getRecords != null) __obj.updateDynamic("getRecords")(getRecords)
    if (getSelectedNodes != null) __obj.updateDynamic("getSelectedNodes")(getSelectedNodes)
    if (getSelectedRecords != null) __obj.updateDynamic("getSelectedRecords")(getSelectedRecords)
    if (getSelectionCount != null) __obj.updateDynamic("getSelectionCount")(getSelectionCount)
    if (getSelectionModel != null) __obj.updateDynamic("getSelectionModel")(getSelectionModel)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (isSelected != null) __obj.updateDynamic("isSelected")(isSelected)
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (loadMask != null) __obj.updateDynamic("loadMask")(loadMask)
    if (loadingCls != null) __obj.updateDynamic("loadingCls")(loadingCls)
    if (loadingHeight != null) __obj.updateDynamic("loadingHeight")(loadingHeight.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore)
    if (overItemCls != null) __obj.updateDynamic("overItemCls")(overItemCls)
    if (prepareData != null) __obj.updateDynamic("prepareData")(prepareData)
    if (!js.isUndefined(preserveScrollOnRefresh)) __obj.updateDynamic("preserveScrollOnRefresh")(preserveScrollOnRefresh)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    if (refreshNode != null) __obj.updateDynamic("refreshNode")(refreshNode)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectedItemCls != null) __obj.updateDynamic("selectedItemCls")(selectedItemCls)
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect)
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect)
    if (store != null) __obj.updateDynamic("store")(store)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver)
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(unbindStoreListeners)
    __obj.asInstanceOf[IAbstractView]
  }
}

