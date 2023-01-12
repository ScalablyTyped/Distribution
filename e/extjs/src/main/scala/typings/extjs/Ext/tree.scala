package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.INodeInterface
import typings.extjs.Ext.data.ITreeStore
import typings.extjs.Ext.panel.ITable
import typings.extjs.Ext.view.IDragZone
import typings.extjs.Ext.view.IDropZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tree {
  
  trait IColumn
    extends StObject
       with typings.extjs.Ext.grid.column.IColumn
  object IColumn {
    
    inline def apply(): IColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumn]
    }
  }
  
  trait IPanel
    extends StObject
       with ITable {
    
    /** [Config Option] (Boolean) */
    @JSName("animate")
    var animate_IPanel: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Collapse all nodes
      * @param callback Function A function to execute when the collapse finishes.
      * @param scope Object The scope of the callback function
      */
    var collapseAll: js.UndefOr[js.Function2[/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Collapses a record that is loaded in the tree
      * @param record Ext.data.Model The record to collapse
      * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
      * @param callback Function The function to run after the collapse is completed
      * @param scope Object The scope of the callback function.
      */
    var collapseNode: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var displayField: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Expand all nodes
      * @param callback Function A function to execute when the expand finishes.
      * @param scope Object The scope of the callback function
      */
    var expandAll: js.UndefOr[js.Function2[/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Expands a record that is loaded in the tree
      * @param record Ext.data.Model The record to expand
      * @param deep Boolean True to expand nodes all the way down the tree hierarchy.
      * @param callback Function The function to run after the expand is completed
      * @param scope Object The scope of the callback function.
      */
    var expandNode: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Expand the tree to the path of a particular node
      * @param path String The path to expand. The path should include a leading separator.
      * @param field String The field to get the data from. Defaults to the model idProperty.
      * @param separator String A separator to use.
      * @param callback Function A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode is the last node that was expanded.
      * @param scope Object The scope of the callback function
      */
    var expandPath: js.UndefOr[
        js.Function5[
          /* path */ js.UndefOr[java.lang.String], 
          /* field */ js.UndefOr[java.lang.String], 
          /* separator */ js.UndefOr[java.lang.String], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var folderSort: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Retrieve an array of checked records
      * @returns Ext.data.NodeInterface[] An array containing the checked records
      */
    var getChecked: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the root node for this tree
      * @returns Ext.data.NodeInterface
      */
    var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var lines: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
    var root: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var rootVisible: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Expand the tree to the path of a particular node then select it
      * @param path String The path to select. The path should include a leading separator.
      * @param field String The field to get the data from. Defaults to the model idProperty.
      * @param separator String A separator to use.
      * @param callback Function A function to execute when the select finishes. The callback will be called with (bSuccess, oLastNode) where bSuccess is if the select was successful and oLastNode is the last node that was expanded.
      * @param scope Object The scope of the callback function
      */
    var selectPath: js.UndefOr[
        js.Function5[
          /* path */ js.UndefOr[java.lang.String], 
          /* field */ js.UndefOr[java.lang.String], 
          /* separator */ js.UndefOr[java.lang.String], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets root node of this tree
      * @param root Ext.data.Model/Ext.data.NodeInterface/Object
      * @returns Ext.data.NodeInterface The new root
      */
    var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[Any], INodeInterface]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var singleExpand: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.data.TreeStore) */
    @JSName("store")
    var store_IPanel: js.UndefOr[ITreeStore] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useArrows: js.UndefOr[Boolean] = js.undefined
  }
  object IPanel {
    
    inline def apply(): typings.extjs.Ext.tree.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.tree.IPanel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.extjs.Ext.tree.IPanel] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setCollapseAll(value: (/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction2(value))
      
      inline def setCollapseAllUndefined: Self = StObject.set(x, "collapseAll", js.undefined)
      
      inline def setCollapseNode(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "collapseNode", js.Any.fromFunction4(value))
      
      inline def setCollapseNodeUndefined: Self = StObject.set(x, "collapseNode", js.undefined)
      
      inline def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      inline def setExpandAll(value: (/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction2(value))
      
      inline def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
      
      inline def setExpandNode(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "expandNode", js.Any.fromFunction4(value))
      
      inline def setExpandNodeUndefined: Self = StObject.set(x, "expandNode", js.undefined)
      
      inline def setExpandPath(
        value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "expandPath", js.Any.fromFunction5(value))
      
      inline def setExpandPathUndefined: Self = StObject.set(x, "expandPath", js.undefined)
      
      inline def setFolderSort(value: Boolean): Self = StObject.set(x, "folderSort", value.asInstanceOf[js.Any])
      
      inline def setFolderSortUndefined: Self = StObject.set(x, "folderSort", js.undefined)
      
      inline def setGetChecked(value: () => Array): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
      
      inline def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
      
      inline def setGetRootNode(value: () => INodeInterface): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
      
      inline def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
      
      inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
      
      inline def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
      
      inline def setSelectPath(
        value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "selectPath", js.Any.fromFunction5(value))
      
      inline def setSelectPathUndefined: Self = StObject.set(x, "selectPath", js.undefined)
      
      inline def setSetRootNode(value: /* root */ js.UndefOr[Any] => INodeInterface): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
      
      inline def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
      
      inline def setSingleExpand(value: Boolean): Self = StObject.set(x, "singleExpand", value.asInstanceOf[js.Any])
      
      inline def setSingleExpandUndefined: Self = StObject.set(x, "singleExpand", js.undefined)
      
      inline def setStore(value: ITreeStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setUseArrows(value: Boolean): Self = StObject.set(x, "useArrows", value.asInstanceOf[js.Any])
      
      inline def setUseArrowsUndefined: Self = StObject.set(x, "useArrows", js.undefined)
    }
  }
  
  trait ITreePanel
    extends StObject
       with ITable {
    
    /** [Config Option] (Boolean) */
    @JSName("animate")
    var animate_ITreePanel: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Collapse all nodes
      * @param callback Function A function to execute when the collapse finishes.
      * @param scope Object The scope of the callback function
      */
    var collapseAll: js.UndefOr[js.Function2[/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Collapses a record that is loaded in the tree
      * @param record Ext.data.Model The record to collapse
      * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
      * @param callback Function The function to run after the collapse is completed
      * @param scope Object The scope of the callback function.
      */
    var collapseNode: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var displayField: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Expand all nodes
      * @param callback Function A function to execute when the expand finishes.
      * @param scope Object The scope of the callback function
      */
    var expandAll: js.UndefOr[js.Function2[/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Expands a record that is loaded in the tree
      * @param record Ext.data.Model The record to expand
      * @param deep Boolean True to expand nodes all the way down the tree hierarchy.
      * @param callback Function The function to run after the expand is completed
      * @param scope Object The scope of the callback function.
      */
    var expandNode: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Expand the tree to the path of a particular node
      * @param path String The path to expand. The path should include a leading separator.
      * @param field String The field to get the data from. Defaults to the model idProperty.
      * @param separator String A separator to use.
      * @param callback Function A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode is the last node that was expanded.
      * @param scope Object The scope of the callback function
      */
    var expandPath: js.UndefOr[
        js.Function5[
          /* path */ js.UndefOr[java.lang.String], 
          /* field */ js.UndefOr[java.lang.String], 
          /* separator */ js.UndefOr[java.lang.String], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var folderSort: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Retrieve an array of checked records
      * @returns Ext.data.NodeInterface[] An array containing the checked records
      */
    var getChecked: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the root node for this tree
      * @returns Ext.data.NodeInterface
      */
    var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var lines: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
    var root: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var rootVisible: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Expand the tree to the path of a particular node then select it
      * @param path String The path to select. The path should include a leading separator.
      * @param field String The field to get the data from. Defaults to the model idProperty.
      * @param separator String A separator to use.
      * @param callback Function A function to execute when the select finishes. The callback will be called with (bSuccess, oLastNode) where bSuccess is if the select was successful and oLastNode is the last node that was expanded.
      * @param scope Object The scope of the callback function
      */
    var selectPath: js.UndefOr[
        js.Function5[
          /* path */ js.UndefOr[java.lang.String], 
          /* field */ js.UndefOr[java.lang.String], 
          /* separator */ js.UndefOr[java.lang.String], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets root node of this tree
      * @param root Ext.data.Model/Ext.data.NodeInterface/Object
      * @returns Ext.data.NodeInterface The new root
      */
    var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[Any], INodeInterface]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var singleExpand: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.data.TreeStore) */
    @JSName("store")
    var store_ITreePanel: js.UndefOr[ITreeStore] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useArrows: js.UndefOr[Boolean] = js.undefined
  }
  object ITreePanel {
    
    inline def apply(): typings.extjs.Ext.tree.ITreePanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.tree.ITreePanel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.extjs.Ext.tree.ITreePanel] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setCollapseAll(value: (/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction2(value))
      
      inline def setCollapseAllUndefined: Self = StObject.set(x, "collapseAll", js.undefined)
      
      inline def setCollapseNode(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "collapseNode", js.Any.fromFunction4(value))
      
      inline def setCollapseNodeUndefined: Self = StObject.set(x, "collapseNode", js.undefined)
      
      inline def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      inline def setExpandAll(value: (/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction2(value))
      
      inline def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
      
      inline def setExpandNode(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "expandNode", js.Any.fromFunction4(value))
      
      inline def setExpandNodeUndefined: Self = StObject.set(x, "expandNode", js.undefined)
      
      inline def setExpandPath(
        value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "expandPath", js.Any.fromFunction5(value))
      
      inline def setExpandPathUndefined: Self = StObject.set(x, "expandPath", js.undefined)
      
      inline def setFolderSort(value: Boolean): Self = StObject.set(x, "folderSort", value.asInstanceOf[js.Any])
      
      inline def setFolderSortUndefined: Self = StObject.set(x, "folderSort", js.undefined)
      
      inline def setGetChecked(value: () => Array): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
      
      inline def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
      
      inline def setGetRootNode(value: () => INodeInterface): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
      
      inline def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
      
      inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
      
      inline def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
      
      inline def setSelectPath(
        value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "selectPath", js.Any.fromFunction5(value))
      
      inline def setSelectPathUndefined: Self = StObject.set(x, "selectPath", js.undefined)
      
      inline def setSetRootNode(value: /* root */ js.UndefOr[Any] => INodeInterface): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
      
      inline def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
      
      inline def setSingleExpand(value: Boolean): Self = StObject.set(x, "singleExpand", value.asInstanceOf[js.Any])
      
      inline def setSingleExpandUndefined: Self = StObject.set(x, "singleExpand", js.undefined)
      
      inline def setStore(value: ITreeStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setUseArrows(value: Boolean): Self = StObject.set(x, "useArrows", value.asInstanceOf[js.Any])
      
      inline def setUseArrowsUndefined: Self = StObject.set(x, "useArrows", js.undefined)
    }
  }
  
  trait IView
    extends StObject
       with typings.extjs.Ext.view.ITable {
    
    /** [Config Option] (Boolean) */
    @JSName("animate")
    var animate_IView: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Collapses a record that is loaded in the view
      * @param record Ext.data.Model The record to collapse
      * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
      * @param callback Function The function to run after the collapse is completed
      * @param scope Object The scope of the callback function.
      */
    var collapse: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Expands a record that is loaded in the view
      * @param record Ext.data.Model The record to expand
      * @param deep Boolean True to expand nodes all the way down the tree hierarchy.
      * @param callback Function The function to run after the expand is completed
      * @param scope Object The scope of the callback function.
      */
    var expand: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Gets the listeners to bind to a new store
      * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
      */
    @JSName("getStoreListeners")
    var getStoreListeners_IView: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Gets the base TreeStore from the bound TreePanel  */
    var getTreeStore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var isTreeView: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    @JSName("loadMask")
    var loadMask_IView: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Template method it is called when a new store is bound to the current instance  */
    @JSName("onBindStore")
    var onBindStore_IView: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Template method it is called when an existing store is unbound from the current instance  */
    @JSName("onUnbindStore")
    var onUnbindStore_IView: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var rootVisible: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Toggles a record between expanded and collapsed
      * @param record Ext.data.Model
      * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
      * @param callback Function The function to run after the expand/collapse is completed
      * @param scope Object The scope of the callback function.
      */
    var toggle: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IView {
    
    inline def apply(): IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IView] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setCollapse(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "collapse", js.Any.fromFunction4(value))
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setExpand(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "expand", js.Any.fromFunction4(value))
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setGetStoreListeners(value: () => Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
      
      inline def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
      
      inline def setGetTreeStore(value: () => Unit): Self = StObject.set(x, "getTreeStore", js.Any.fromFunction0(value))
      
      inline def setGetTreeStoreUndefined: Self = StObject.set(x, "getTreeStore", js.undefined)
      
      inline def setIsTreeView(value: Boolean): Self = StObject.set(x, "isTreeView", value.asInstanceOf[js.Any])
      
      inline def setIsTreeViewUndefined: Self = StObject.set(x, "isTreeView", js.undefined)
      
      inline def setLoadMask(value: Boolean): Self = StObject.set(x, "loadMask", value.asInstanceOf[js.Any])
      
      inline def setLoadMaskUndefined: Self = StObject.set(x, "loadMask", js.undefined)
      
      inline def setOnBindStore(value: () => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction0(value))
      
      inline def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
      
      inline def setOnUnbindStore(value: () => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction0(value))
      
      inline def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
      
      inline def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
      
      inline def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
      
      inline def setToggle(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction4(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  type IViewDragZone = IDragZone
  
  trait IViewDropZone
    extends StObject
       with IDropZone {
    
    /** [Config Option] (Boolean) */
    var allowContainerDrop: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var allowParentInserts: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var appendOnly: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var expandDelay: js.UndefOr[Double] = js.undefined
    
    /** [Method] Moved out of the DropZone without dropping  */
    @JSName("notifyOut")
    var notifyOut_IViewDropZone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] The mouse is no longer over a tree node so dropping is not valid
      * @param n Object
      * @param dd Object
      * @param e Object
      * @param data Object
      */
    @JSName("onNodeOut")
    var onNodeOut_IViewDropZone: js.UndefOr[
        js.Function4[
          /* n */ js.UndefOr[Any], 
          /* dd */ js.UndefOr[Any], 
          /* e */ js.UndefOr[Any], 
          /* data */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IViewDropZone {
    
    inline def apply(): IViewDropZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewDropZone]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IViewDropZone] (val x: Self) extends AnyVal {
      
      inline def setAllowContainerDrop(value: Boolean): Self = StObject.set(x, "allowContainerDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowContainerDropUndefined: Self = StObject.set(x, "allowContainerDrop", js.undefined)
      
      inline def setAllowParentInserts(value: Boolean): Self = StObject.set(x, "allowParentInserts", value.asInstanceOf[js.Any])
      
      inline def setAllowParentInsertsUndefined: Self = StObject.set(x, "allowParentInserts", js.undefined)
      
      inline def setAppendOnly(value: Boolean): Self = StObject.set(x, "appendOnly", value.asInstanceOf[js.Any])
      
      inline def setAppendOnlyUndefined: Self = StObject.set(x, "appendOnly", js.undefined)
      
      inline def setExpandDelay(value: Double): Self = StObject.set(x, "expandDelay", value.asInstanceOf[js.Any])
      
      inline def setExpandDelayUndefined: Self = StObject.set(x, "expandDelay", js.undefined)
      
      inline def setNotifyOut(value: () => Unit): Self = StObject.set(x, "notifyOut", js.Any.fromFunction0(value))
      
      inline def setNotifyOutUndefined: Self = StObject.set(x, "notifyOut", js.undefined)
      
      inline def setOnNodeOut(
        value: (/* n */ js.UndefOr[Any], /* dd */ js.UndefOr[Any], /* e */ js.UndefOr[Any], /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onNodeOut", js.Any.fromFunction4(value))
      
      inline def setOnNodeOutUndefined: Self = StObject.set(x, "onNodeOut", js.undefined)
    }
  }
  
  object plugin {
    
    trait ITreeViewDragDrop
      extends StObject
         with IAbstractPlugin {
      
      /** [Config Option] (Boolean) */
      var allowContainerDrops: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Boolean) */
      var allowParentInserts: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Boolean) */
      var appendOnly: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Object/Boolean) */
      var containerScroll: js.UndefOr[Any] = js.undefined
      
      /** [Config Option] (String) */
      var ddGroup: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (String) */
      var displayField: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (String) */
      var dragGroup: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (String) */
      var dragText: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (String) */
      var dropGroup: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (Boolean) */
      var enableDrag: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Boolean) */
      var enableDrop: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Number) */
      var expandDelay: js.UndefOr[Double] = js.undefined
      
      /** [Method] The init method is invoked after initComponent method has been run for the client Component
        * @param view Object
        */
      @JSName("init")
      var init_ITreeViewDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Config Option] (String) */
      var nodeHighlightColor: js.UndefOr[java.lang.String] = js.undefined
      
      /** [Config Option] (Boolean) */
      var nodeHighlightOnDrop: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Boolean) */
      var nodeHighlightOnRepair: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Boolean) */
      var sortOnDrop: js.UndefOr[Boolean] = js.undefined
    }
    object ITreeViewDragDrop {
      
      inline def apply(): ITreeViewDragDrop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITreeViewDragDrop]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ITreeViewDragDrop] (val x: Self) extends AnyVal {
        
        inline def setAllowContainerDrops(value: Boolean): Self = StObject.set(x, "allowContainerDrops", value.asInstanceOf[js.Any])
        
        inline def setAllowContainerDropsUndefined: Self = StObject.set(x, "allowContainerDrops", js.undefined)
        
        inline def setAllowParentInserts(value: Boolean): Self = StObject.set(x, "allowParentInserts", value.asInstanceOf[js.Any])
        
        inline def setAllowParentInsertsUndefined: Self = StObject.set(x, "allowParentInserts", js.undefined)
        
        inline def setAppendOnly(value: Boolean): Self = StObject.set(x, "appendOnly", value.asInstanceOf[js.Any])
        
        inline def setAppendOnlyUndefined: Self = StObject.set(x, "appendOnly", js.undefined)
        
        inline def setContainerScroll(value: Any): Self = StObject.set(x, "containerScroll", value.asInstanceOf[js.Any])
        
        inline def setContainerScrollUndefined: Self = StObject.set(x, "containerScroll", js.undefined)
        
        inline def setDdGroup(value: java.lang.String): Self = StObject.set(x, "ddGroup", value.asInstanceOf[js.Any])
        
        inline def setDdGroupUndefined: Self = StObject.set(x, "ddGroup", js.undefined)
        
        inline def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
        
        inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
        
        inline def setDragGroup(value: java.lang.String): Self = StObject.set(x, "dragGroup", value.asInstanceOf[js.Any])
        
        inline def setDragGroupUndefined: Self = StObject.set(x, "dragGroup", js.undefined)
        
        inline def setDragText(value: java.lang.String): Self = StObject.set(x, "dragText", value.asInstanceOf[js.Any])
        
        inline def setDragTextUndefined: Self = StObject.set(x, "dragText", js.undefined)
        
        inline def setDropGroup(value: java.lang.String): Self = StObject.set(x, "dropGroup", value.asInstanceOf[js.Any])
        
        inline def setDropGroupUndefined: Self = StObject.set(x, "dropGroup", js.undefined)
        
        inline def setEnableDrag(value: Boolean): Self = StObject.set(x, "enableDrag", value.asInstanceOf[js.Any])
        
        inline def setEnableDragUndefined: Self = StObject.set(x, "enableDrag", js.undefined)
        
        inline def setEnableDrop(value: Boolean): Self = StObject.set(x, "enableDrop", value.asInstanceOf[js.Any])
        
        inline def setEnableDropUndefined: Self = StObject.set(x, "enableDrop", js.undefined)
        
        inline def setExpandDelay(value: Double): Self = StObject.set(x, "expandDelay", value.asInstanceOf[js.Any])
        
        inline def setExpandDelayUndefined: Self = StObject.set(x, "expandDelay", js.undefined)
        
        inline def setInit(value: /* view */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
        
        inline def setNodeHighlightColor(value: java.lang.String): Self = StObject.set(x, "nodeHighlightColor", value.asInstanceOf[js.Any])
        
        inline def setNodeHighlightColorUndefined: Self = StObject.set(x, "nodeHighlightColor", js.undefined)
        
        inline def setNodeHighlightOnDrop(value: Boolean): Self = StObject.set(x, "nodeHighlightOnDrop", value.asInstanceOf[js.Any])
        
        inline def setNodeHighlightOnDropUndefined: Self = StObject.set(x, "nodeHighlightOnDrop", js.undefined)
        
        inline def setNodeHighlightOnRepair(value: Boolean): Self = StObject.set(x, "nodeHighlightOnRepair", value.asInstanceOf[js.Any])
        
        inline def setNodeHighlightOnRepairUndefined: Self = StObject.set(x, "nodeHighlightOnRepair", js.undefined)
        
        inline def setSortOnDrop(value: Boolean): Self = StObject.set(x, "sortOnDrop", value.asInstanceOf[js.Any])
        
        inline def setSortOnDropUndefined: Self = StObject.set(x, "sortOnDrop", js.undefined)
      }
    }
  }
}
