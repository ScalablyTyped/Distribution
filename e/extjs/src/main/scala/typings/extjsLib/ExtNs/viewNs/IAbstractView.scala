package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IBindable because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IAbstractView
  extends extjsLib.ExtNs.IComponent {
  /** [Method] Changes the data store bound to this view and refreshes it
  		* @param store Ext.data.Store The store to bind to this view
  		*/
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], scala.Unit]] = js.undefined
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
  var getStore: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.IStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_]] = js.undefined
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
    js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IAbstractView: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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

