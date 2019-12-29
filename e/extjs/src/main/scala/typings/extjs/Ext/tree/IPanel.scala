package typings.extjs.Ext.tree

import typings.extjs.Ext.Array
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.INodeInterface
import typings.extjs.Ext.data.ITreeStore
import typings.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IPanel: js.UndefOr[Boolean] = js.undefined
  /** [Method] Collapse all nodes
  		* @param callback Function A function to execute when the collapse finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var collapseAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
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
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.undefined
  /** [Method] Expand all nodes
  		* @param callback Function A function to execute when the expand finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var expandAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
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
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* path */ js.UndefOr[String], 
      /* field */ js.UndefOr[String], 
      /* separator */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
  var root: js.UndefOr[js.Any] = js.undefined
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
      /* path */ js.UndefOr[String], 
      /* field */ js.UndefOr[String], 
      /* separator */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets root node of this tree
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Config Option] (Boolean) */
  var singleExpand: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.TreeStore) */
  @JSName("store")
  var store_IPanel: js.UndefOr[ITreeStore] = js.undefined
  /** [Config Option] (Boolean) */
  var useArrows: js.UndefOr[Boolean] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    ITable: ITable = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    collapseAll: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    collapseNode: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    displayField: String = null,
    expandAll: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    expandNode: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    expandPath: (/* path */ js.UndefOr[String], /* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    folderSort: js.UndefOr[Boolean] = js.undefined,
    getChecked: () => Array = null,
    getRootNode: () => INodeInterface = null,
    lines: js.UndefOr[Boolean] = js.undefined,
    root: js.Any = null,
    rootVisible: js.UndefOr[Boolean] = js.undefined,
    selectPath: (/* path */ js.UndefOr[String], /* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    setRootNode: /* root */ js.UndefOr[js.Any] => INodeInterface = null,
    singleExpand: js.UndefOr[Boolean] = js.undefined,
    store: ITreeStore = null,
    useArrows: js.UndefOr[Boolean] = js.undefined
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (collapseAll != null) __obj.updateDynamic("collapseAll")(js.Any.fromFunction2(collapseAll))
    if (collapseNode != null) __obj.updateDynamic("collapseNode")(js.Any.fromFunction4(collapseNode))
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (expandAll != null) __obj.updateDynamic("expandAll")(js.Any.fromFunction2(expandAll))
    if (expandNode != null) __obj.updateDynamic("expandNode")(js.Any.fromFunction4(expandNode))
    if (expandPath != null) __obj.updateDynamic("expandPath")(js.Any.fromFunction5(expandPath))
    if (!js.isUndefined(folderSort)) __obj.updateDynamic("folderSort")(folderSort.asInstanceOf[js.Any])
    if (getChecked != null) __obj.updateDynamic("getChecked")(js.Any.fromFunction0(getChecked))
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(js.Any.fromFunction0(getRootNode))
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible.asInstanceOf[js.Any])
    if (selectPath != null) __obj.updateDynamic("selectPath")(js.Any.fromFunction5(selectPath))
    if (setRootNode != null) __obj.updateDynamic("setRootNode")(js.Any.fromFunction1(setRootNode))
    if (!js.isUndefined(singleExpand)) __obj.updateDynamic("singleExpand")(singleExpand.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(useArrows)) __obj.updateDynamic("useArrows")(useArrows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel]
  }
}

